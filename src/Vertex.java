
import java.awt.*;

public class Vertex {

    private int sum;
    private int totalSum;

    private int x, y;
    private int width;
    private int height;
    private Font font;

    private int textWidth;
    private int textHeight;

    private String path;
    private int level;
    private int numberNode;

    public Vertex(int sum, int totalSum, int x, int y, int width, String path, int level) {
        this.sum = sum;
        this.totalSum = totalSum;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = 50;
        this.font = new Font("TH Sarabun New", Font.BOLD, 20);
        this.level = level;
        this.numberNode = numberNode;
        this.path = path;

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getLevel() {
        return level;
    }

    public String getPath() {
        return path;
    }

    public void Draw(Graphics2D graphic, int[] selectPath) {
        boolean isSelect = false;
        if (level > 0) {
            for (int i = 0; i < level; i++) {
                int currentPath = path.charAt(i) - '0';

                if (selectPath[i] != currentPath) {
                    isSelect = false;
                    break;
                }
                isSelect = true;
            }
        }
        graphic.setFont(font);
        graphic.setColor(isSelect || level == 0 ? Color.GREEN : Color.blue);
        graphic.setStroke(new BasicStroke(2));

        textWidth = graphic.getFontMetrics(font).stringWidth(sum + "," + totalSum);
        textHeight = graphic.getFontMetrics(font).getHeight();
        graphic.drawRect(x - (textWidth + 20) / 2, y - height / 2, textWidth + 20, height);

        graphic.drawString(sum + "," + totalSum, x - textWidth / 2, y + textHeight / 4);

    }

}
