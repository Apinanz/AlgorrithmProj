
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.*;

public class Backtracking {

    private int[] numbers;
    private int target;
    private boolean draw_bool;
    private int totalSum = 0;
    private int index;
    private ArrayList<ArrayList<Integer>> results;
    private ArrayList<Integer> sublist;

    private int baseWidth;
    private int baseHeight;
    private int widthPerNode;
    private ArrayList<Vertex> vertex;
    private ArrayList<Edge> edge;

    private int heightPerNode = 50;
    private int distanceHeight = 100;

    private ArrayList<int[]> resultPath;

    public Backtracking(int[] numbers, int target, boolean draw, int index) {
        this.numbers = numbers;
        this.target = target;
        this.draw_bool = draw;
        this.index = index;
        Arrays.sort(this.numbers);
        for (int item : numbers) {
            totalSum += item;
        }
    }

    public ArrayList<ArrayList<Integer>> run() {
        results = new ArrayList<ArrayList<Integer>>();
        BufferedImage image = new BufferedImage(500, 500, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = image.createGraphics();
        String maxText = target + "," + totalSum;
        widthPerNode = g.getFontMetrics(new Font("TH Sarabun New", Font.BOLD, 20)).stringWidth(maxText);
        baseWidth = (widthPerNode + 40) * (int) Math.pow(2, numbers.length);
        baseHeight = numbers.length * distanceHeight + heightPerNode;

        vertex = new ArrayList<>();
        edge = new ArrayList<>();
        resultPath = new ArrayList<>();
        sumOfSubsets(new int[numbers.length], -1, totalSum, null);

        for (int[] i : resultPath) {
            sublist = new ArrayList<Integer>();
            for (int num = 0; num < i.length; num++) {
                if (i[num] == 1) {
                    sublist.add(numbers[num]);
                }
            }
            results.add(sublist);

            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }

        DrawGraph draw = new DrawGraph(vertex, edge, baseWidth, baseHeight, resultPath.get(index), draw_bool);
        return results;
    }

    private void sumOfSubsets(int[] path, int level, int remainingSum, Vertex parent) {
        //remainingSum = totalSum
        int sum = sum(path, level);

        String PATH = "";
        for (int i = 0; i <= level; i++) {
            PATH += path[i] + "";
        }
        int numNode = getNumNode(PATH);
        Vertex child = null;

        if (level == -1) {
            child = new Vertex(sum, remainingSum, baseWidth / 2, getY(level + 1), nodeWidth(sum + "," + remainingSum), PATH, level + 1);
        } else {
            int side = path[level];
            int offset = (baseWidth / (int) (Math.pow(2, level + 2)));
            if (side == 0) {
                child = new Vertex(sum, remainingSum, parent.getX() + offset, getY(level + 1), nodeWidth(sum + "," + remainingSum), PATH, level + 1);
            } else {
                child = new Vertex(sum, remainingSum, parent.getX() - offset, getY(level + 1), nodeWidth(sum + "," + remainingSum), PATH, level + 1);
            }
        }

        vertex.add(child);

        if (parent != null) {
            edge.add(new Edge(parent, child));
        }

        if (level == numbers.length - 1) {

            if (sum == target) {

                int[] np = new int[numbers.length];

                for (int i = 0; i < numbers.length; i++) {
                    np[i] = path[i];
                }
                resultPath.add(np);
            }
        } else {
            if (sum + numbers[level + 1] <= target) { //numbers[-1]

                path[level + 1] = 1;
                sumOfSubsets(path, level + 1, remainingSum - numbers[level + 1], child);

            }

            path[level + 1] = 0;
            sumOfSubsets(path, level + 1, remainingSum - numbers[level + 1], child);

        }
    }

    private int sum(int[] path, int level) {
        int sum = 0;
        for (int i = 0; i <= level; i++) {
            sum += (path[i] * numbers[i]);
        }
        return sum;
    }

    private int nodeWidth(String txt) {
        BufferedImage image = new BufferedImage(500, 500, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = image.createGraphics();
        return g.getFontMetrics(new Font("TH Sarabun New", Font.BOLD, 20)).stringWidth(txt);

    }

    private int getNumNode(String path) {
        String reverseBit = "";
        if (path.isEmpty()) {
            return 0;
        }
        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == '1') {
                reverseBit += "0";
            } else {
                reverseBit += "1";
            }
        }
        return Integer.parseInt(reverseBit, 2);
    }

    private int getY(int level) {
        return heightPerNode + (level * distanceHeight);
    }
    
    public ArrayList<int[]> getResultPath() {
        return resultPath;
    }

//    public static void main(String[] args) {
//        int[] numbers = {5, 10, 12, 13, 15, 18};
//        Backtracking algo = new Backtracking(numbers , 30);
//        ArrayList<ArrayList<Integer>> results = algo.run();
//
//        for (ArrayList<Integer> a : results) {
//            System.out.println(a);
//        }
//    }
//    test:
//    target 30
//    INPUT 5, 10, 12, 13, 15, 18
}
