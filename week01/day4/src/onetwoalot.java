import java.util.Scanner;

public class onetwoalot {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("write down a small number");
        int num = scanner.nextInt();
        if (num>2){
            System.out.println("a lot");
        }
        else if (num==2){
            System.out.println("this number is 2");
        }
        else if(num==1){
            System.out.println("this number is 1");
        }
        else{
            System.out.println("too small number");
        }


    }
}
