import java.util.Scanner;

public class mileToKMconverter
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("write down miles to convert them into km");
        double miles = scanner.nextDouble();
        System.out.println(miles*1.609344 + "km");
    }
}
