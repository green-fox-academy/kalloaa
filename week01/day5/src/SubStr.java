import java.util.Scanner;

public class SubStr {
    public static int stringe(String input, String searched){
        int a =0;
        if(!input.contains(searched)){
            a= -1;
        }
        else{
            a = input.indexOf(searched);
        }
        return a+1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("write down 2 strings where the 2nd contains the first and this program will find where in the string it is");
        String a = scanner.next();
        String b = scanner.next();
        System.out.println(stringe(a,b));



    }
}
