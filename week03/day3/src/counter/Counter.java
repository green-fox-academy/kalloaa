package counter;

public class Counter {
    int a = 0;
    int b;
    public Counter(){
    b =a;
    }
    public Counter(int a){
        this.a=a;
        b=a;

    }
    public void add(int addedNumber){
        a+=addedNumber;
    }
    public void add(){
        a++;
    }
    public int get(){
        return a;
    }
    public void reset (){
        a=b;
    }
}
