/**
 * Created by User on 04.01.2018.
 */
import java.util.*;
import java.io.*;
public class WordCount {
    public static void main(String [] args) throws Exception {

        // Before start running on an IDEA please change file address to "src/Test.txt"

        File file = new File("./Test.txt");
        Scanner sc = new Scanner(file);

        int words = 0;
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            words += line.split(" ").length;
        }
        if(words==0){
            System.out.println("There are no words.");
        }else if (words>=2) {
            System.out.println("The file contains: " + words + " words.");
        }else{
            System.out.println("The file contains only " + words + " word.");
        }
    }
}
