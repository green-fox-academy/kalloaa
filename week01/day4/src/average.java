import java.util.Scanner;

public class average
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("write down 5 numbers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int f = scanner.nextInt();
        System.out.println((a+b+c+d+f)/5 + " is the average");
        System.out.println((a+b+c+d+f) + " is the sum");


    }
}
