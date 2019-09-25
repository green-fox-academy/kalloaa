import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {
    public static void main(String[] args) {
        // Create a method that decrypts the duplicated-chars.txt
        DoubledRemover("Doubledtext.txt");

    }
    public static void DoubledRemover(String doubledfile){
        Path filePath = Paths.get(doubledfile);
        List<String> lines = new ArrayList<>();
        try {
            int counter = 0;
            lines = Files.readAllLines(filePath);
//            System.out.println("Reading Successful.");
//            String temp[] = (String[]) lines.toArray();
//            for (int i = 0; i <lines.size() ; i++) {
//               char chartemp[] = temp[i].toCharArray();
//                for (int j = 0; j <chartemp.length ; j++) {
//                    if(j%2==0){
//                        chartemp[j]='';
//                    }
//
//                }
//
//            }

        }
        catch (Exception e){
            System.out.println("Reading Failed.");

        }
        Path filePathofFixed = Paths.get("fixedDoubledtext.txt");
        try{
            Files.write(filePathofFixed, lines);
            System.out.println("Writing Successful.");
        }
        catch (Exception e){
            System.out.println("Writing Failed.");
        }

    }
}
