import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class ComputerGuessesToo {
    public static void computerGuessesToo(ArrayList<String> words) throws FileNotFoundException {
        ComputerUser computerUser = new ComputerUser("ComputerUser", words.get(new Random().nextInt(words.size())));
        Scanner sc = new Scanner(System.in);
        System.out.println("Add meg a felhasználónevedet a játékhoz!");
        String userName = sc.nextLine();
        System.out.println("Add meg, milyen 5 betű szóra gondoltál( az \"sz\", \"ty\", \"cs\",... 2 betűnek számít");
        String imaginedWord = sc.nextLine();
        while (!(words.contains(imaginedWord))){
            System.out.println("Gondolj másik szóra, mert ezt a szót a számítógép nem ismeri, így nincs eséle kitalálni");
            imaginedWord = sc.nextLine();
        }
        UserPlayer userPlayer = new UserPlayer(userName, imaginedWord);
        System.out.println(computerUser.getImaginedWord());
        ArrayList<String> tipWordsOfUser = new ArrayList<>();
        ArrayList<String> tipWordsOfComputer = new ArrayList<>();
        int k = 0;
        HashMap<Integer,ArrayList<String>> notContainedChars=new HashMap();
        HashMap<Integer,ArrayList<String>> containedChars=new HashMap();
        for (int i = 0; i <= 3; i++) {
            System.out.println(i+1 + " . kör");
            //tryToGuessCW(computerUser, tipWordsOfUser);
            computerGuess(words, computerUser, userPlayer,i,k,notContainedChars,containedChars,tipWordsOfComputer,tipWordsOfUser);
        }
    }

    //    A program maga is tudjon találgatni.
//    A találgatás legyen véletlenszerű (de a tippek valódi,
//    létező ötbetűs magyar szavak legyenek)!
//    A program tudjon találgatni valamilyen értelmes stratégia mentén.
//    Néhány ötlet stratégiákhoz:
//    Először szűrjük ki a gyakori magánhangzókat, pl. olyan szavakkal, mint eleve, veled (ha mindkettőre 0 a válasz, akkor a feladványban biztos nincs e).
//    Keressük végig az összes magánhagzót a fentihez hasonló módszerrel.
//    Ha egy tippre 0-s választ kaptunk, az azt jelenti, hogy tudjuk: a keresett feladvány egyik betűje sem egyezik meg a tipp valmely betűjével, vagyis a feladvány minden egyes karakterének lehetséges halmaza eggyel kisebb lesz.
//    Ha egy tippre 0-tól különböző választ kapunk, akkor próbáljuk meg megfelelő szavakkal kideríteni, hogy melyik az egyező betű. Pl., ha a borod-ra a válasz 1, a porod-ra pedig 0, akkor tudjuk, hogy a feladvány első betűje b.
//    Ezen a ponton valószínűleg érdemes valami olyan struktúrát felépíteni, ahol a keresett feladvány minden egyes karakterének betűk egy listája felel meg (a lehetséges betűk) és tippekre kapott válaszok hatására ezek a listák szűkülnek, vagy a lista egyes elemei valószínűbbé vállnak.
    public static void tryToGuessCW(ComputerUser computerUser, ArrayList<String> tipWordsArrayList) throws FileNotFoundException {
        System.out.println(Play.playOneTurnWithComputer(computerUser, tipWordsArrayList));
    }

    public static void computerGuess(ArrayList<String> words, ComputerUser computerUser, UserPlayer userPlayer, int i, int k, HashMap<Integer, ArrayList<String>> notContainedChars, HashMap<Integer, ArrayList<String>> containedChars, ArrayList<String> tipWordsOfComputer, ArrayList<String> tipWordsOfUser) throws FileNotFoundException {
        //     the userPlayer imagine one word and the computer try to guess
      //ComputerGuessStrategy.computerGuessStepByStep(words,computerUser,userPlayer,i);
      //ComputerGuessStrategy.computerGuessRandom(words,computerUser,userPlayer);

      ComputerGuessStrategy.computerGuessiv(words,computerUser,userPlayer,i,notContainedChars,containedChars,  tipWordsOfComputer, tipWordsOfUser);
      //ComputerGuessStrategy.computerGuessMateStrategy(words,computerUser,userPlayer,k,hashMap);

            }


}



