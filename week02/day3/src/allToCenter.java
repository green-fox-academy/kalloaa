import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class allToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a function that draws a single line and takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.
        Random rand = new Random();
        for (int i = 0; i <WIDTH ; i++) {
            graphics.setColor(Color.cyan);
            if (i%2==0 || i%7==0){
                graphics.setColor(Color.BLUE);
            }
            if(i%3==0){
                graphics.setColor(Color.red);
            }
            if (i%5==0){
                graphics.setColor(Color.MAGENTA);
            }
            if (i%11==0){
                graphics.setColor(new Color(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256)));
            }
            graphics.drawLine(i,HEIGHT,WIDTH/2,HEIGHT/2);
            graphics.drawLine(i,0,WIDTH/2,HEIGHT/2);
        }

        for (int i = 0; i <HEIGHT ; i++) {
            graphics.setColor(Color.cyan);
            if (i%2==0 || i%7==0){
                graphics.setColor(Color.BLUE);
            }
            if(i%3==0){
                graphics.setColor(Color.red);
            }
            if (i%5==0){
                graphics.setColor(Color.MAGENTA);
            }
            if (i%11==0){
                graphics.setColor(new Color(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256)));
            }
            graphics.drawLine(WIDTH,i,WIDTH/2,HEIGHT/2);
            graphics.drawLine(0,i,WIDTH/2,HEIGHT/2);
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