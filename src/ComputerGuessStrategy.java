import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;

public class ComputerGuessStrategy {

    public static void computerGuessStepByStep(ArrayList<String> words, ComputerUser computerUser, UserPlayer userPlayer, int i) throws FileNotFoundException {
        //     the userPlayer imagine one word and the computer try to guess step by step from the words array
        for (int j = 0; j < 1; j++) {
            computerUser.tipOneWord(i, words);
            System.out.println(userPlayer.answerTheTip(words.get(i)));
            if (userPlayer.answerTheTip(words.get(i)) == 5) {
                System.out.println("A számítógép győzött.  A gondolt szó a " + words.get(i) +"\" volt. " + "A játéknak vége.");
                System.exit(1);
            }
        }
    }
    public static void computerGuessRandom(ArrayList<String> words, ComputerUser computerUser, UserPlayer userPlayer){
        for (int j = 0; j < 1; j++) {
            int i =new Random().nextInt(words.size());
            computerUser.tipOneWord(i, words);
            System.out.println(userPlayer.answerTheTip(words.get(i)));
            if (userPlayer.answerTheTip(words.get(i)) == 5) {
                System.out.println("A számítógép győzött.  A gondolt szó a " + words.get(i) +"\" volt. " + "A játéknak vége.");
                System.exit(1);
            }

        }

}
    public static void computerGuessi(ArrayList<String> words, ComputerUser computerUser, UserPlayer userPlayer, int i) throws FileNotFoundException {
        //     the userPlayer imagine one word and the computer try to guess step by step from the words array
        for (int j = 0; j < 1; j++) {
            String tipWord=null;
            switch (i) {
                case 0:
                    tipWord = "alatt";
                    break;
                case 1:
                    tipWord = "Ázsia";
                    break;
                case 2:
                    tipWord = "zavar";
                    break;
                case 3:
                    tipWord = "zenei";
                    break;
                case 4:
                    tipWord = "eleve";
                    break;
                case 5:
                    tipWord = "vitéz";
                    break;
                case 6:
                    tipWord = "alibi";
                    break;
                case 7:
                    tipWord = "intim";
                    break;
                case 8:
                    tipWord = "uncsi";
                    break;
                case 9:
                    tipWord = "újult";
                    break;
                case 10:
                    tipWord = "tutul";
                    break;
                case 11:
                    tipWord = "smafu";
                    break;
                case 12:
                    tipWord = "okozó";
                    break;
                case 13:
                    tipWord = "ohmos";
                    break;
                case 14:
                    tipWord = "no-no";
                    break;
                case 15:
                    tipWord = "vitéz";
                    break;
                case 16:
                    tipWord = "alibi";
                    break;
                case 17:
                    tipWord = "intim";
                    break;
                case 18:
                    tipWord = "uncsi";
                    break;
                case 19:
                    tipWord = "újult";
                    break;
                case 20:
                    tipWord = "tutul";
                default:
                    tipWord = "Invalid month";
                    break;

            }
        }
            computerUser.tipOneWord(i, words);
            System.out.println(userPlayer.answerTheTip(words.get(i)));
            if (userPlayer.answerTheTip(words.get(i)) == 5) {
                System.out.println("A számítógép győzött.  A gondolt szó a " + words.get(i) +"\" volt. " + "A játéknak vége.");
                System.exit(1);
            }
        }
}
