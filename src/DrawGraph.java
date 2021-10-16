
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class DrawGraph extends JFrame {

    private ArrayList<Vertex> vertex;
    private ArrayList<Edge> edge;
    private Dimension screenSize;
    private JPanel graph;
    private JScrollPane scroll;
    private boolean draw;

    public DrawGraph(ArrayList<Vertex> vertex, ArrayList<Edge> edge, int baseWidth, int baseHeight, int[] selectPath, boolean draw) {
        this.vertex = vertex;
        this.edge = edge;
        this.draw = draw;
        this.screenSize = new Dimension(baseWidth, baseHeight);
        this.graph = new JPanel() {
            @Override
            protected void paintComponent(Graphics grphcs) {
                super.paintComponent(grphcs); //To change body of generated methods, choose Tools | Templates.
                Graphics2D g = (Graphics2D) grphcs;
                for (Vertex v : vertex) {
                    v.Draw(g, selectPath);
                }
                for (Edge e : edge) {
                    e.Draw(g, selectPath);
                }
            }
        };
        graph.setPreferredSize(screenSize);
        this.scroll = new JScrollPane(graph);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scroll.setBorder(null);
        setTitle("Graph");
        setSize(1080, 720);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());
        add(scroll);
        setLocationRelativeTo(null);
        setExtendedState(MAXIMIZED_BOTH);
        setVisible(draw);
    }
}
