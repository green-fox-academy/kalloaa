import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    public static void mainDraw(Graphics graphics) {
        //create a play with lines where they create a curve on both sides
        //create a color for them where they continously change as the lines continue
        int colorCounter1 =55;
        int colorCounter2 =55;
        int colorCounter3 =55;
        int colorCounter4 =0;
        int colorCounter5 =0;
        int colorCounter6 =0;
        for (int i = 0; i <HEIGHT ; i++) {
            if(colorCounter1<255 && colorCounter2==55){
                graphics.setColor(new Color(colorCounter1,colorCounter2,colorCounter3));
                colorCounter1++;
            }
            //i200 red255
            else if(colorCounter2<255){
                graphics.setColor(new Color(colorCounter1,colorCounter2,colorCounter3));
                colorCounter2++;
                //i400 r255 b255
            }
             else if (colorCounter3 < 255){
                graphics.setColor(new Color(colorCounter1,colorCounter2,colorCounter3));
                colorCounter3++;

            }
             //600
            else if(colorCounter1>154){
                graphics.setColor(new Color(colorCounter1,colorCounter2,colorCounter3));
                colorCounter1--;
                colorCounter2--;

            }
            if(i==HEIGHT/4*3){
                colorCounter4=colorCounter1;
                colorCounter5=colorCounter2;
                colorCounter6=colorCounter3;
            }
            if(i>=(HEIGHT/4*3)+1){
                if (colorCounter5>=50){
                    colorCounter5--;
                }
                else if (colorCounter4<255){
                    colorCounter4++;
                    if (i%2==0){
                        colorCounter5++;
                    }
                }
                else if (colorCounter6<255){
                    colorCounter6++;
                    colorCounter4--;
                }
                graphics.setColor(new Color(colorCounter4,colorCounter5,colorCounter6));

            }



            graphics.drawLine(WIDTH,HEIGHT-i,WIDTH-i*2,0);
            graphics.drawLine(0,i,0+i,HEIGHT);

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