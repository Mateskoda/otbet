import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TryToGuessComputersWord {
//    Írj programot, amivel ötbetűzni lehet!
    //    A program gondoljon egy öt betűs szóra, és a vele játszó ember
//    adhasson tippeket, a program pedig válaszoljon a tippekre a játék
//    szabályai szerint számokkal. Ha az játékos kitalálta a szót,
//    a program írja ki, hogy 5, és fejeződjön be a játék
//    (vagy ajánljon fel egy újabb játékot)!
    public static void tryToGuessCW( ArrayList<String> words) throws FileNotFoundException {
        //     the computer imagine one word and we try to guess
        ArrayList<String> fiveLetterWords = new ArrayList<>();
        Scanner sc = new Scanner(new File("szavak.txt"));
        for (int i = 0, j = 0; sc.hasNextLine(); i++) {
            String line = sc.nextLine();
//            char [] chars = line.toCharArray();
            if (line.length() == 5) {
//                System.out.println(j++);
                fiveLetterWords.add(line);
            }
        }

        ComputerUser computerUser = new ComputerUser("ComputerUser", words.get(new Random().nextInt(words.size())));
        System.out.println(computerUser.getImaginedWord());
        System.out.println(Play.playWithComputer(computerUser));


    }
}
