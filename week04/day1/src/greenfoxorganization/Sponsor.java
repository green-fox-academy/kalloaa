package greenfoxorganization;

public class Sponsor extends Person {
    String company;
    int hiredStudents = 0;

    public void hire(){
        hiredStudents++;
    }
    public void getGoal(){
        System.out.println("Hire brilliant junior software developers.");
    }
    public void  introduce(){
        System.out.println("Hi, I'm " + name + ",  a" + age + " year old " + gender + " who represents " + company + " and hired " + hiredStudents + " so far.");
    }
    public Sponsor(String name, int age, String gender, String company){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.company = company;
    }
    public Sponsor(){
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
        this.company = "Google";
        this.hiredStudents = 0;
    }

}
