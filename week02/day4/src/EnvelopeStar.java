import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
    public static void mainDraw(Graphics graphics) {
        //create a star
        Random rand = new Random();
        int widh=((WIDTH/2)-(HEIGHT/2));


        for (int i = 0; i <HEIGHT/2 ; i+=5) {
            graphics.setColor(new Color(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255)));
        graphics.drawLine(widh+i,HEIGHT/2,WIDTH/2,HEIGHT/2+i);
        graphics.drawLine(widh+i,HEIGHT/2,WIDTH/2,HEIGHT/2-i);
        graphics.drawLine(widh+WIDTH/2-i,HEIGHT/2,WIDTH/2,HEIGHT/2-i);
        graphics.drawLine(widh+WIDTH/2-i,HEIGHT/2,WIDTH/2,HEIGHT/2+i);

        }

    }

    // Don't touch the code below
    //      sorry for that - ZaitzeV16
    static int WIDTH;
    static int HEIGHT;

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