package animal;

public class Animal {
    int Hunger;
    int Thirst;
    public Animal(){
        Hunger=50;
        Thirst=50;
    }
    public void eat(){
        this.Hunger--;
    }
    public void drink(){
        this.Thirst--;
    }
    public void play(){
        this.Hunger++;
        this.Thirst++;
    }

}
