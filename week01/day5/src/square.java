import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("how big do you want your square to be");
        int squaresize =scanner.nextInt();
        for (int i =1; i<=squaresize;i++){
            System.out.println();
            for (int j =1; j<=squaresize;j++){
                if (i==1 || i==squaresize || j ==1 || j == squaresize){
                    System.out.print("+");
                }
                else {
                    System.out.print("-");
                }
            }
        }

    }
}
