import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("set how high you want the pyramid to be");
        int pyramid = scanner.nextInt();
        int pyraneg = (pyramid*-1);
        int pyrapoz = (pyramid);
        for(int i =0; i<=pyramid;i++){
            System.out.println();
            for (int j =pyramid*-1; j<=pyramid;j++){
                if (j>=(i*-1) && j<=0){
                    System.out.print("+");
                }
                else if (j<=i && j >=0){
                    System.out.print("+");
                }
                else{
                    System.out.print("-");
                }
            }
        }

    }
}
