import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("write down how many numbers you want to summed and averaged and then write down that amount of numbers");
        int numberofnumbers = scanner.nextInt();
        int sum=0;
        for (int i = 1; i<=numberofnumbers;i++){
            int addednumber =scanner.nextInt();
            sum+=addednumber;
        }
        float average =(float)sum/numberofnumbers;
        System.out.println("Sum: " + sum + " Average: " + average);


    }
}
