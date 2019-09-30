package greenfoxorganization;

public class Mentor extends Person {
    String level;

    public void getGoal() {
        System.out.println("Educate brilliant junior software developers.");
    }
    public void introduce(){
        System.out.println("Hi, I'm " + name + ",  a " + age + " year old " + gender+ " level " + level + " mentor.");
    }
    public  Mentor(){
        this.name = "Jane Doe";
        this.age = 30;
        this.gender= "female";
        this.level = "intermediate";
    }
    public Mentor(String name, int age, String gender, String level){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.level = level;
    }

}
