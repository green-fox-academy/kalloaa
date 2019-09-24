public class DivideByZero {
    public static void main(String[] args) {
        Division(10);
    }

    public static void Division(int input){

        try {
          int result = 10/input;
            System.out.println(result);
        }
        catch (ArithmeticException e){
            System.out.println("Can't divide by zero!");
        }
    }
}
