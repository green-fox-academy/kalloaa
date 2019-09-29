public class bunnies {
    public static void main(String[] args) {
        int bunnies = 20;
        System.out.println(BunnyEarCounter(bunnies,0));
    }
    public static int BunnyEarCounter(int bunnies,int ears){
        if(bunnies>0){
            ears=+2;
            return bunnies-BunnyEarCounter(bunnies-1,ears);
        }
        else{
            return ears;
        }


    }
}
