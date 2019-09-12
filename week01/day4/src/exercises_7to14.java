import java.util.Scanner;
public class exercises_7to14
{
    public static void main(String[] args)
    {
        int myFavNumber = 177682;
        System.out.println("your favourite number" + myFavNumber);

        int a = 123;
        int b = 526;
        int c = b;
        b = a;
        a = c;

        System.out.println(a);
        System.out.println(b);

        double massInKg = 81.2;
        double heightInM = 1.78;
        System.out.println(massInKg/heightInM);

        String myName= "András";
        int myAge = 20;
        double myHeight = 1.75;
        boolean married = false;

        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;
        int allCurrentSeconds =(currentHours*3600)+(currentMinutes*60)+currentSeconds;
        int maxSeconds = 24*3600;
        System.out.println(maxSeconds-allCurrentSeconds +"seconds left from the day");

        Scanner scanner = new Scanner(System.in);
        System.out.println("write 3 numbers to create a cuboid");
        int  num1 = scanner.nextInt();
        int  num2 = scanner.nextInt();
        int  num3 = scanner.nextInt();

        System.out.println("volume :" + (num1*num2*num3));
        System.out.println("surface area :" + (num1*num2*2+num1*num3*2+num2*num3*2));



    }
}
