package greenfoxorganization;

public class Student extends Person {
    String previousOrganization;
    int skippeddays = 0;

    public void getgoal(){
        System.out.println("Be a junior software developer.");
    }
    public void introduce(){
        System.out.println("Hi, I'm " + name + ",  a " + age + " year old " + gender+ " from " + previousOrganization + " who skipped " +  skippeddays + " days.");
    }
    public void skipDays(int numberOfDays){
        skippeddays+=numberOfDays;
    }
    public Student(String name, int age, String gender, String previousOrganization){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.previousOrganization=previousOrganization;
    }
    public Student(){
        this.name = "Jane Doe";
        this.age = 30;
        this.gender= "female";
        this.skippeddays=0;
        this.previousOrganization="the School of Life";
    }
}
