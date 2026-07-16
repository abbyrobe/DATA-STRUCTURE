import javax.swing.*;
import java.awt.*;

public class TimeComplexityGraph extends JPanel {
    public int width;
    public int height;

    public TimeComplexityGraph(int width, int height) {
        this.width = width;
        this.height = height;
        setPreferredSize(new Dimension(width, height));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawAxes(g);
        drawTimeComplexityCurves(g);
    }

    private void drawAxes(Graphics g) {
        g.drawLine(50, height - 50, width - 50, height - 50); // X-axis
        g.drawLine(50, height - 50, 50, 50); // Y-axis
        g.drawString("Input Size (n)", width / 2, height - 20);
        g.drawString("Time Complexity", 10, height / 2);
    }

    private void drawTimeComplexityCurves(Graphics g) {
        // Draw O(1)
        g.setColor(Color.RED);
        g.drawString("O(1)", width - 100, height - 60);
        g.drawLine(100, height - 100, width - 100, height - 100);

        // Draw O(n)
        g.setColor(Color.BLUE);
        g.drawString("O(n)", width - 100, height - 120);
        for (int i = 0; i < width - 100; i++) {
            int y = (int) (height - 100 - (i * (height - 200) / (width - 200)));
            g.drawLine(i + 100, y, i + 101, y);
        }

        // Draw O(n^2)
        g.setColor(Color.GREEN);
        g.drawString("O(n^2)", width - 100, height - 140);
        for (int i = 0; i < width - 100; i++) {
            int y = (int) (height - 100 - ((i * i) * (height - 200) / ((width - 200) * (width - 200))));
            if (y < height - 50) {
                g.drawLine(i + 100, y, i + 101, y);
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Time Complexity Graph");
        TimeComplexityGraph graphPanel = new TimeComplexityGraph(500, 400);
        frame.add(graphPanel);
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}