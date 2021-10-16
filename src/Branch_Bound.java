
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.util.*;
import javax.swing.*;
import org.abego.treelayout.TreeLayout;
import org.abego.treelayout.TreeForTreeLayout;
import org.abego.treelayout.util.DefaultConfiguration;
import org.abego.treelayout.util.DefaultTreeForTreeLayout;
import org.abego.treelayout.NodeExtentProvider;

public class Branch_Bound {

    private final int[] numbers;
    private final int target;
    private DefaultTreeForTreeLayout<Vertex> tree;
    private Font font = new Font("TH Sarabun New", Font.BOLD, 20);
    private int[] subSet;

    public Branch_Bound(int[] numbers, int target) {
        this.numbers = numbers;
        this.target = target;
        this.subSet = new int[numbers.length];
        subOfSum();

        int x = 75, y = 150; //ความห่างแต่ละ node
        DefaultConfiguration<Vertex> config = new DefaultConfiguration<>(y, x);
        NodeExtentProvider<Vertex> extent = new NodeExtentProvider<Vertex>() {
            @Override
            public double getWidth(Vertex v) {
                return v.getWidth();
            }

            @Override
            public double getHeight(Vertex v) {
                return v.getHeight();
            }

        };
        TreeLayout<Vertex> layout = new TreeLayout<>(tree, extent, config);
        JPanel panel = new JPanel() {
            @Override
            public void paint(Graphics g) {
                super.paint(g);
                drawEdge(g, layout.getTree().getRoot());
                drawVertex(g);
            }

            public void drawVertex(Graphics g) {
                g.setFont(font);
                for (Vertex v : layout.getNodeBounds().keySet()) {
                    boolean isSelect = false;
                    if (v.getPath().length() > 0) {
                        for (int i = 0; i < v.getPath().length(); i++) {
                            int currentPath = v.getPath().charAt(i) - '0';

                            if (subSet[i] != currentPath) {
                                isSelect = false;
                                break;
                            }
                            isSelect = true;
                        }
                    }

                    Rectangle2D.Double node = layout.getNodeBounds().get(v);
                    //g.setColor(Color.WHITE);
                    g.setColor(isSelect || v.getPath().length() == 0 ? Color.GREEN : Color.white);
                    g.fillRect((int) node.x, (int) node.y, (int) node.width, (int) node.height);
                    g.setColor(Color.BLACK);
                    g.drawRect((int) node.x, (int) node.y, (int) node.width, (int) node.height);
                    String sum = v.getSum() + "";
                    int width = getFontMetrics(font).stringWidth(sum);
                    int height = getFontMetrics(font).getHeight();
                    int x = (int) node.getCenterX(), y = (int) node.getCenterY();
                    g.drawString(sum, x - (width / 2), y + (height / 4));
                }
            }

            public void drawEdge(Graphics g, Vertex parent) {

                if (!layout.getTree().isLeaf(parent)) {
                    g.setFont(font);
                    Rectangle2D.Double node1 = layout.getNodeBounds().get(parent);
                    int x1 = (int) node1.getCenterX(), y1 = (int) node1.getCenterY();
                    for (Vertex child : layout.getTree().getChildren(parent)) {

                        boolean isSelect = false;
                        for (int i = 0; i < child.getPath().length(); i++) {
                            int currentPath = child.getPath().charAt(i) - '0';
                            if (subSet[i] != currentPath) {
                                isSelect = false;
                                break;
                            }
                            isSelect = true;
                        }
                        
                        Rectangle2D.Double node2 = layout.getNodeBounds().get(child);
                        g.setColor(isSelect ? Color.GREEN : Color.black);
                        int x2 = (int) node2.getCenterX(), y2 = (int) node2.getCenterY();
                        //g.setColor(Color.black);
                        g.drawLine(x1, y1 + (int) node1.getHeight() / 2, x2, y2 - (int) node2.getHeight() / 2);
                        int indexInLine = child.getPath().length();
                        String str = indexInLine + "";
                        int centerX = (x1 + x2) / 2, centerY = (y1 + y2) / 2;
                        int width = g.getFontMetrics(font).stringWidth(str) + 8;
                        int height = g.getFontMetrics(font).getHeight();
                        g.setColor(this.getBackground());
                        g.fillRect(centerX - width / 2, centerY - height / 2, width, height);
                        g.setColor(Color.black);
                        g.drawString(str, (centerX - width / 2) + 4, centerY + height / 4);
                        drawEdge(g, child);
                    }
                }
            }
        };
        JFrame frame = new JFrame("BNB");
        JScrollPane scoll = new JScrollPane(panel);
        scoll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scoll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scoll.setBorder(null);
        frame.setLayout(new BorderLayout());
        frame.add(scoll);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void subOfSum() {
        Dimension dimension = size("0");
        PriorityQueue<Vertex> queue = new PriorityQueue<>(new Comparator<Vertex>() {
            @Override
            public int compare(Vertex v, Vertex v2) {
                if (v.getSum() < v2.getSum()) {
                    return 1;
                } else if (v.getSum() == v2.getSum()) {
                    return 0;
                } else {
                    return -1;
                }
            }

        });
        Vertex root = new Vertex(0, "", dimension.width, dimension.height);
        tree = new DefaultTreeForTreeLayout<>(root);
        queue.add(root);

        while (!queue.isEmpty()) {
            Vertex parent = queue.poll();
            int index = parent.getPath().length();
            int sum = parent.getSum();

            if (sum == target) {
                String path = parent.getPath();
                for (int i = 0; i < path.length(); i++) {
                    subSet[i] = path.charAt(i) - '0';
                }
                for (int i = path.length(); i < numbers.length; i++) {
                    subSet[i] += 0;
                }

                return;
            }
            for (int i = index; i < numbers.length; i++) {
                int currentSum = sum + numbers[i];
                String path = parent.getPath();
                for (int j = path.length(); j < i; j++) {
                    path += "0";
                }
                path += "1";
                dimension = size(currentSum + "");
                Vertex child = new Vertex(currentSum, path, dimension.width, dimension.height);
                tree.addChild(parent, child);
                if (currentSum <= target) {
                    queue.add(child);
                }
            }

        }

    }

    private Dimension size(String str) {
        BufferedImage image = new BufferedImage(500, 500, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = image.createGraphics();
        int width = g.getFontMetrics(font).stringWidth(str), height = g.getFontMetrics(font).getHeight();
        return new Dimension(width, height);
    }

    public static void main(String[] args) {
        int[] numbers = {5, 10, 12, 13, 15, 18};
        int target = 30;
        Branch_Bound bnb = new Branch_Bound(numbers, target);
    }
}
