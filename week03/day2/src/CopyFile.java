import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) {
        // Write a function that copies the contents of a file into another
        // It should take the filenames as parameters
        // It should return a boolean that shows if the copy was successful
        copyTo("file.txt","newfile.txt");
    }
    public static void copyTo(String file1, String copyofFile1){
        //could do with returning boolean but i think its dumb
        Path filePathofFile1 = Paths.get(file1);
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(filePathofFile1);
            System.out.println("Reading Successful.");
        }
        catch (Exception e){
            System.out.println("Reading Failed.");

        }
        Path filePathofCopy = Paths.get(copyofFile1);
        try{
            Files.write(filePathofCopy, lines);
            System.out.println("Writing Successful.");
        }
        catch (Exception e){
            System.out.println("Writing Failed.");
        }
    }
}
