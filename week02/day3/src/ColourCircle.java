import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColourCircle {
    public static void mainDraw(Graphics graphics) {
        //make all lines lead to the middle, essentially making a circle
        //use random to get their colours and their placement
        Random rand = new Random();
        int lineLenght = rand.nextInt(((400)+100*2));
        for (int i = 0; i < 1000000 ; i++) {
            int temp = rand.nextInt(2);
            int neg = 0;
            int heightOfy2;
            if(temp==1){
                neg = 1;
            }
            else{
                neg = -1;
            }
            int heightOfx2 = rand.nextInt(1001);
            if (heightOfx2 > HEIGHT/2) {
                heightOfy2 = 0;
            }
            else{
                heightOfy2 =0;
            }
            graphics.setColor(new Color(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256)));
            graphics.drawLine(WIDTH/2,HEIGHT/2,heightOfy2 ,heightOfx2);

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