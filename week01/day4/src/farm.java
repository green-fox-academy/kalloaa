import java.util.Scanner;

public class farm
{
    public static void main(String[] args)
    {
        System.out.println("write down 2 ints, the first number are chickens, the second number is pigs");
        Scanner scanner = new Scanner(System.in);
        int chicken = scanner.nextInt();
        int piggie = scanner.nextInt();
        System.out.println("all together they have : " + ((chicken*2)+(piggie*4)) + " legs");

    }
}
