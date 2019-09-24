import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {
        CountTheLines("file.txt");
    }
    public static int CountTheLines(String file){
        int counter =0;
        try{
            Path filePath = Paths.get(file);
            List<String> lines = Files.readAllLines(filePath);
            for (String i:lines) {
                counter++;

            }
        }
        catch (Exception e){
        }
        return counter;
    }
}
