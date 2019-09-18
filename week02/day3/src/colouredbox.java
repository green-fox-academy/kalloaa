import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class colouredbox {
    public static void mainDraw(Graphics graphics) {
        // Draw a box that has different colored lines on each edge.
        graphics.setColor(Color.black);
        graphics.drawLine(10,10,200,10);
        graphics.setColor(Color.CYAN);
        graphics.drawLine(200,10,200,200);
        graphics.setColor(Color.pink);
        graphics.drawLine(200,200,10,200);
        graphics.setColor(Color.MAGENTA);
        graphics.drawLine(10,200,10,10);



    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}