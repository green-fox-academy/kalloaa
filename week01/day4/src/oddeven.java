import java.util.Scanner;

public class oddeven
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("write down a number and see if its odd or even");
        int num = scanner.nextInt();
        if (num % 2==0)
        {
            System.out.println("Even");
        }
        else
            {
                System.out.println("Odd");
            }
    }
}
