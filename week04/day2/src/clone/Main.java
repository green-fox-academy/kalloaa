package clone;

public class Main {
    public static void main(String[] args) {
        Person joe = new Person("Joe",20,"BME");
        Person cloneOfJoe = new Person();
        joe.Clone(cloneOfJoe);

    }
}
