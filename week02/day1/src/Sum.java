import java.util.Scanner;

public class Sum {
    public static int sum (int numbersto){
        int sum =0;
        for (int i = 1; i <=numbersto ; i++) {
            sum+=i;

        }
        return sum;
    }
    public static void main(String[] args) {
        // Create the usual class wrapper and main method on your own.

        // Write a function called `sum` that returns the sum of numbers from zero to the given parameter

        System.out.println("write the number until you want all numbers added");
        Scanner scanner = new Scanner(System.in);
        int numbersTo = scanner.nextInt();
        int allNumbers = sum(numbersTo);
        System.out.println(allNumbers);
    }
}
