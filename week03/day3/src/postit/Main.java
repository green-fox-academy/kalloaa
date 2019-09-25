package postit;

public class Main {
    public static void main(String[] args) {
//        Create a few example post-it objects:
//
//        an orange with blue text: "Idea 1"
//        a pink with black text: "Awesome"
//        a yellow with green text: "Superb!"

        PostIt post = new PostIt("orange","Idea1","blue");
        PostIt post2 = new PostIt("Pink","Awesome","black");
        PostIt post3 = new PostIt("yellow","Superb!","green");
    }
}
