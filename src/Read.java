import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Read {
    static int cntOf5LetterWords=0;

    public int getCntOf5LetterWords() {
        return cntOf5LetterWords;
    }

    public static ArrayList readFile(String textname) throws FileNotFoundException {
        ArrayList <String> fiveLetterWords = new ArrayList<>();
        Scanner sc =  new Scanner(new File(textname));
        for (int i = 0,j=0; sc.hasNextLine() ; i++) {
            String line = sc.nextLine();
//            char [] chars = line.toCharArray();
if (line.length()==5){
//    System.out.println(j++);
    fiveLetterWords.add(line);
}
cntOf5LetterWords = j;
        }
return fiveLetterWords;
    }
}
