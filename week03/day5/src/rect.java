import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class rect {
    public static void mainDraw(Graphics graphics) {
        Random ra = new Random();
        for (int i = 0; i <WIDTH ; i+=20) {
            graphics.setColor(new Color(ra.nextInt(255),ra.nextInt(255),ra.nextInt(255)));
            graphics.drawRect(i,i,WIDTH-i*2,HEIGHT-i*2);
            graphics.drawLine(WIDTH-i,i,i,HEIGHT+i);
            graphics.drawLine(WIDTH+i,i,i,HEIGHT+i);
            graphics.drawLine(i,HEIGHT-i,WIDTH+i,i);
            graphics.drawLine(i,HEIGHT-i,WIDTH-i,i);
        }
    }

    // Don't touch the code below
    //      sorry for that - ZaitzeV16
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();

        //_______________________________________________________________
        // set by ZaitzeV16                                           //|
        // gets current maximum resolution minus the taskbar height   //|
        int[] curRes = CurrentResolution.getCurrentMaxResolution();   //|
        WIDTH = curRes[0];                                            //|
        HEIGHT = curRes[1];                                           //|
        //______________________________________________________________|

        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);

        //_______________________________________________________________
        // set by ZaitzeV16                                           //|
        // maximizes the canvas window by default                     //|
        //      and places it to the middle                           //|
        jFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);               //|
        //______________________________________________________________|

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