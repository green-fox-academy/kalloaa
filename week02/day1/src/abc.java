public class abc {
    public static void main(String[] args) {
        String[] abc = {"First", "Second", "Third"};


        for(int i=0; i<abc.length/2; i++){
            String temp = abc[i];
            abc[i] = abc[abc.length -i -1];
            abc[abc.length -i -1] = temp;

        }
        for (int i = 0; i <abc.length ; i++) {
            System.out.println(abc[i]);

        }
    }
}
