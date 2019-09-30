package garden;

public class Main {
    public static void main(String[] args) {
        Garden theGarden = new Garden();
        Tree purple = new Tree("purple");
        Tree orange = new Tree("orange");
        Flower blue = new Flower("blue");
        Flower yellow = new Flower("yellow");
        theGarden.addFlower(blue);
        theGarden.addFlower(yellow);
        theGarden.addTree(purple);
        theGarden.addTree(orange);
        theGarden.waterPlants(40);
        theGarden.waterPlants(70);

    }
}
