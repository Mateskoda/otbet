import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class ComputerGuessStrategy {

    public static void computerGuessStepByStep(ArrayList<String> words, ComputerUser computerUser, UserPlayer userPlayer, int i) throws FileNotFoundException {
        //     the userPlayer imagine one word and the computer try to guess step by step from the words array
        for (int j = 0; j < 1; j++) {
            computerUser.tipOneWord(i, words);
            System.out.println(userPlayer.answerTheTip(words.get(i)));
            if (userPlayer.answerTheTip(words.get(i)) == 5) {
                System.out.println("A számítógép győzött.  A gondolt szó a " + words.get(i) + "\" volt. " + "A játéknak vége.");
                System.exit(1);
            }
        }
    }

    public static void computerGuessRandom(ArrayList<String> words, ComputerUser computerUser, UserPlayer userPlayer) {
        for (int j = 0; j < 1; j++) {
            int i = new Random().nextInt(words.size());
            computerUser.tipOneWord(i, words);
            System.out.println(userPlayer.answerTheTip(words.get(i)));
            if (userPlayer.answerTheTip(words.get(i)) == 5) {
                System.out.println("A számítógép győzött.  A gondolt szó a " + words.get(i) + "\" volt. " + "A játéknak vége.");
                System.exit(1);
            }

        }

    }

    public static void computerGuessiv(ArrayList<String> words, ComputerUser computerUser, UserPlayer userPlayer, int i, HashMap<Integer, ArrayList<String>> notContainedChars, HashMap<Integer, ArrayList<String>> containedChars, ArrayList<String> tipWordsOfComputer, ArrayList<String> tipWordsOfUser) throws FileNotFoundException {
        //     the userPlayer imagine one word and the computer try to guess step by step from the words array
        String tipWord = null;
        int cnta = 0;
        int cnte = 0;
        int cnti = 0;
        int cnto = 0;
        int cntö = 0;
        int cntu = 0;
        int cntá = 0;
        int cnté = 0;
        int cntí = 0;
        int cntó = 0;
        int cntő = 0;
        int cntú = 0;
        int cntű = 0;
        int cntü = 0;
        if (i<47){
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
                tipWord = "apáca";
                break;
            case 16:
                tipWord = "álcáz";
                break;
            case 17:
                tipWord = "báláz";
                break;
            case 18:
                tipWord = "hajrá";
                break;
            case 19:
                tipWord = "ábécé";
                break;
            case 20:
                tipWord = "épség";
                break;
            case 21:
                tipWord = "félév";
                break;
            case 22:
                tipWord = "hídív";
                break;
            case 23:
                tipWord = "írott";
                break;
            case 24:
                tipWord = "jóízű";
                break;

            case 25:
                tipWord = "alibí"; // csalás :)
                break;
            case 26:
                tipWord = "szóló";
                break;
            case 27:
                tipWord = "omlós";
                break;
            case 28:
                tipWord = "ónízű";
                break;
            case 29:
                tipWord = "hódít";
                break;
            case 30:
                tipWord = "nyújt";
                break;
            case 31:
                tipWord = "kifúj";
                break;
            case 32:
                tipWord = "súlyú";
                break;
            case 33:
                tipWord = "sűrűn";
                break;
            case 34:
                tipWord = "szűke";
                break;
            case 35:
                tipWord = "űrlap";
                break;
            case 36:
                tipWord = "tömör";
                break;
            case 37:
                tipWord = "ütött";
                break;
            case 38:
                tipWord = "öblös";
                break;
            case 39:
                tipWord = "ődöng";
                break;
            case 40:
                tipWord = "ütőmű";
            case 41:
                tipWord = "körző";
                break;
            case 42:
                tipWord = "kőzet";
                break;
            case 43:
                tipWord = "lefőz";
                break;
            case 44:
                tipWord = "tütüt";
                break;
            case 45:
                tipWord = "üdülő";
                break;
            case 46:
                tipWord = "fondü";
                break;

            default:
                tipWord = "Invalid month";
                break;
        }

        if (userPlayer.answerTheTip(tipWord) == 0) {
            for (int j = 0; j <5 ; j++) {
                notContainedChars.putIfAbsent(j,new ArrayList<>());
                notContainedChars.gettipWord.toCharArray()[0]
            }
            switch (i) {
                case 0:
                case 1:
                case 2:
                    System.out.println("üres");
                    cnta++;

                    break;

                case 3:case 4:
                    cnte++;
                    break;
                case 5: case 6: case 7:
                    cnti++;
                    break;
                case 9:
                    cntu++;
                    cntú++;
                    break;
                case 8:case 10: case 11:
                    cntu++;
                    break;
                case 12: case 13: case 14:
                    cnto++;
                    break;
                case 15: case 16: case 17: case 18:
                    cntá++;
                    break;
                case 19:
                    cntá++;
                    cnté++;
                    break;
                case 20: case 21:
                    cnté++;
                    break;
                case 22: case 23:
                    cntí++;
                    break;
                case 24:
                    cntű++;
                    cntí++;
                    break;

                case 25:
                    cntí++;
                    break;
                case 26: case 27: case 28: case 29:
                    cntó++;
                    break;
                case 30: case 31: case 32:
                    cntú++;
                    break;
                case 33: case 34: case 35:
                    cntű++;
                    break;
                case 36: case 37: case 38:
                    cntö++;
                case 39:
                    cntő++;
                    cntö++;
                case 40: case 41: case 42: case 43:
                    cntő++;
                    break;
                case 44: case 45: case 46:
                    cntü++;
                    break;
                default:
                    tipWord = "Invalid";
                    break;
            }
        }}

        //computerUser.tipOneWord(i, words);
        System.out.println(tipWord);
        System.out.println(userPlayer.answerTheTip(tipWord));
        if (userPlayer.answerTheTip(tipWord) == 5) {
            System.out.println("A számítógép győzött.  A gondolt szó a " + tipWord + "\" volt. " + "A játéknak vége.");
            System.exit(1);
        }
    }

    public static void computerGuessMateStrategy(ArrayList<String> words, ComputerUser computerUser, UserPlayer userPlayer, int k, HashMap<Integer, ArrayList<String>> hashMap) {
        for (int j = 0; j < 1; j++) {
            String tipword = null;
            for (int i = 0; i < 10; i++) {
            }
            System.out.println(tipword);
            System.out.println(userPlayer.answerTheTip(tipword));
            if (userPlayer.answerTheTip(tipword) == 5) {
                System.out.println("A számítógép győzött.  A gondolt szó a " + tipword + "\" volt. " + "A játéknak vége.");
                System.exit(1);
            }

        }
    }
}
