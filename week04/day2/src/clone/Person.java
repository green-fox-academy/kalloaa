package clone;

public class Person implements Cloneable {
    String Name;
    int Age;
    String StudiedAt;

    public Person(String Name, int Age, String StudiedAt) {
        this.Name = Name;
        this.Age = Age;
        this.StudiedAt = StudiedAt;
    }

    public Person() {
        this.Name = null;
        this.Age = 0;
        this.StudiedAt = null;
    }

    @Override
    public void Clone(Person copy) {
        copy.Name = this.Name;
        copy.Age = this.Age;
        copy.StudiedAt = this.StudiedAt;

    }
}
