import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CheckBoard {
    public static void mainDraw(Graphics graphics) {
    // Fill the canvas with a checkerboard pattern.
        for (int row = 0; row < WIDTH/10 ; row++) {
            for (int column = 0; column <HEIGHT/10 ; column++) {
                if(column%2==0 && row%2==0){
                    graphics.setColor(Color.WHITE);
                    graphics.fillRect(100*column,100*row,100,100);
                }
                if(column%2==1 && row%2==0){
                    graphics.setColor(Color.BLACK);
                    graphics.fillRect(100*column,100*row,100,100);
                }
                if(column%2==0 && row%2==1){
                    graphics.setColor(Color.BLACK);
                    graphics.fillRect(100*column,100*row,100,100);
                }
                if(column%2==1 && row%2==1){
                    graphics.setColor(Color.WHITE);
                    graphics.fillRect(100*column,100*row,100,100);
                }

            }

        }

    }

    // Don't touch the code below
    //      sorry for that - ZaitzeV16
    static int WIDTH ;
    static int HEIGHT ;

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