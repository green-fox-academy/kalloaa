public class chessboard {
    public static void main(String[] args) {
        for (int i = 1; i<=8;i++){
            System.out.println();
            for(int j = 1; j<=8;i++){
                if(i%2==1 && j%2==0){
                    System.out.print("O");
                }
                else if (i%2==1 && j%2==1){
                    System.out.print(" ");
                }
                else if(i%2==0 && j%2==0){
                    System.out.print("O");
                }
                else if (i%2==0 && j%2==1){
                    System.out.print(" ");
                }
            }
        }

    }
}
