
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class Edge {

    private Vertex start, end;

    public Edge(Vertex start, Vertex end) {
        this.start = start;
        this.end = end;
    }

    public void Draw(Graphics2D g, int[] selectPath) {
        boolean isSelect = false;
        for (int i = 0; i < end.getLevel(); i++) {
            int currentPath = end.getPath().charAt(i) - '0';
            if (selectPath[i] != currentPath) {
                isSelect = false;
                break;
            }
            isSelect = true;
        }
        g.setColor(isSelect ? Color.GREEN : Color.black);
        g.setStroke(new BasicStroke(2));
        g.drawLine(start.getX(), start.getY() + start.getHeight() / 2, end.getX(), end.getY() - end.getHeight() / 2);

    }

}
