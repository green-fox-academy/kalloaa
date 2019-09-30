package garden;

public class Tree {
    String name;
    int waterneed = 10;
    int currentwater = 0;
    float absorbtion = 0.4f;
    public Tree(String name) {
        this.name = name;
    }
    public void drinkwater(int water){
        currentwater+=water*absorbtion;
    }
}
