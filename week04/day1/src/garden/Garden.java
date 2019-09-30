package garden;

import java.util.ArrayList;

public class Garden {
    ArrayList<Flower> flowers;
    ArrayList<Tree> trees;
    int numberOfThirstyPlants;
    public Garden(){
        flowers = new ArrayList<>();
        trees = new ArrayList<>();
    }
    public void addTree(Tree tree){
        trees.add(tree);
        numberOfThirstyPlants++;
    }
    public void addFlower(Flower flower){
        flowers.add(flower);
        numberOfThirstyPlants++;
    }
    public void checkThirst(){
        int temp =trees.size()+flowers.size();
        for (int i = 0; i < trees.size() ; i++) {
            if(trees.get(i).waterneed < trees.get(i).currentwater) {
               temp--;
            }
        }
        for (int i = 0; i < flowers.size() ; i++) {
            if(flowers.get(i).waterneed > flowers.get(i).currentwater) {
                temp--;
            }
        }
        numberOfThirstyPlants=temp;
    }
    public void waterPlants(int water){
        checkThirst();
        System.out.println("watering with " + water);
        for (int i = 0; i < trees.size() ; i++) {
            if(trees.get(i).waterneed > trees.get(i).currentwater) {
                trees.get(i).drinkwater(water/numberOfThirstyPlants);
            }
            if(trees.get(i).waterneed > trees.get(i).currentwater) {
                System.out.println(trees.get(i).name + " tree needs water");
            }
            else {
                System.out.println(trees.get(i).name + " tree doesn't need water water");
            }
        }
        for (int i = 0; i < flowers.size() ; i++) {
            if(flowers.get(i).waterneed > flowers.get(i).currentwater) {
                flowers.get(i).drinkwater(water/numberOfThirstyPlants);
            }
            if(flowers.get(i).waterneed > flowers.get(i).currentwater) {
                System.out.println(flowers.get(i).name + "flower needs water");
            }
            else {
                System.out.println(flowers.get(i).name + " flower doesn't need water");
            }



        }


    }
}
