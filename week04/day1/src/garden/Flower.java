package garden;

public class Flower {
    String name;
    int waterneed = 5;
    int currentwater = 0;
    float absorbtion = 0.75f;
    public Flower(String name){
        this.name=name;
    }
    public void drinkwater(int water){
        currentwater+=water*absorbtion;
    }
}
