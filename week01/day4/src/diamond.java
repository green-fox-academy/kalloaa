import java.util.Scanner;

public class diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("write down how big you want the diamond to be");
        int diamond = scanner.nextInt();
        if (diamond % 2 == 1) {
            int diatopneg = (diamond / 2 + 1) * -1;
            int diatoppoz = diamond / 2 + 1  ;
            for (int i = 0; i < diatoppoz; i++) {
                System.out.println();
                for (int j = diatopneg; j <= diatoppoz; j++) {
                    if (j >= (i * -1) && j <= 0) {
                        System.out.print("o");
                    } else if (j <= i && j >= 0) {
                        System.out.print("o");
                    } else {
                        System.out.print("-");
                    }
                }
            }
            int diabotpoz = diamond/2+-1 ;
            for (int i = diabotpoz; i >= 0; i--){
                System.out.println();
                for (int j = diatopneg; j <= diatoppoz; j++){

                    if (j >= (i * -1) && j <= 0) {
                        System.out.print("o");
                    } else if (j <= i && j >= 0) {
                        System.out.print("o");
                    } else {
                        System.out.print("-");
                    }
                }
            }
        }
        else{
            int diatopneg = (diamond / 2 ) * -1;
            int diatoppoz = diamond / 2 ;
            for (int i = 0; i < diatoppoz; i++) {
                System.out.println();
                for (int j = diatopneg; j <= diatoppoz; j++) {
                    if (j >= (i * -1) && j <= 0) {
                        System.out.print("o");
                    } else if (j <= i && j >= 0) {
                        System.out.print("o");
                    } else {
                        System.out.print("-");
                    }
                }
            }
            int diabotpoz = diamond/2-1 ;
            for (int i = diabotpoz; i >= 0; i--){
                System.out.println();
                for (int j = diatopneg; j <= diatoppoz; j++){

                    if (j >= (i * -1) && j <= 0) {
                        System.out.print("o");
                    } else if (j <= i && j >= 0) {
                        System.out.print("o");
                    } else {
                        System.out.print("-");
                    }
                }
            }
        }
    }
}
