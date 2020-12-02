import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Play {

    public static String playWithComputer(ComputerUser computerUser) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tipWordsArrayList = new ArrayList<>();
        System.out.println("Adj meg egy tippet!");
        String tipWord = sc.nextLine();

        if (tipWord.length() == 5) {
            tipWordsArrayList.add(tipWord);
        }
        while (!(tipWord.length() == 5)) {
            System.out.println("A tippelt szó nem helyes.(Csak 5 betűs szavakkal futtatható a játék).");
            System.out.println("Adj meg egy tippet!");
            tipWord = sc.nextLine();
            if (tipWord.length() == 5) {
                tipWordsArrayList.add(tipWord);
            }
        }
        System.out.println(tipWordsArrayList);
        System.out.println(computerUser.answerTheTip(tipWord));
        while (!(computerUser.answerTheTip(tipWord) == 5)) {
            System.out.println("Adj meg egy tippet!");
            tipWord = sc.nextLine();
            if (tipWord.length() == 5) {
                if (tipWordsArrayList.contains(tipWord)) {
                    System.out.println(computerUser.answerTheTip(tipWord));
                    System.out.println("Ezt a szót már tippelted, s nem talált, szóval tippelj újat");
                } else {
                    tipWordsArrayList.add(tipWord);
                }
            }
            while (!(tipWord.length() == 5)) {
                System.out.println("A tippelt szó nem helyes.(Csak 5 betűs szavakkal futtatható a játék).");
                System.out.println("Adj meg egy tippet!");
                tipWord = sc.nextLine();
                if (tipWord.length() == 5) {
                    if (tipWordsArrayList.contains(tipWord)) {
                        System.out.println(computerUser.answerTheTip(tipWord));
                        System.out.println("Ezt a szót már tippelted, s nem talált, szóval tippelj újat");
                    } else {
                        tipWordsArrayList.add(tipWord);
                    }
                }
            }

            System.out.println(tipWordsArrayList);
            System.out.println(computerUser.answerTheTip(tipWord));
        }
        return "A gondolt szó a \"" + tipWord + "\" volt";
    }

    public static String playOneTurnWithComputer(ComputerUser computerUser,ArrayList<String> tipWordsArrayList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adj meg egy tippet!");
        String tipWord = sc.nextLine();

        if (tipWord.length() == 5) {
            if (tipWordsArrayList.contains(tipWord)) {
                System.out.println(computerUser.answerTheTip(tipWord));
                System.out.println("Ezt a szót már tippelted, s nem talált, szóval kapsz még egy tipp lehetőséget");
                tipWord = sc.nextLine();

            } else {
                tipWordsArrayList.add(tipWord);
            }
        }
        while (!(tipWord.length() == 5)) {
            System.out.println("A tippelt szó nem helyes.(Csak 5 betűs szavakkal futtatható a játék).");
            System.out.println("Adj meg egy tippet!");
            tipWord = sc.nextLine();
            if (tipWord.length() == 5) {
                if (tipWordsArrayList.contains(tipWord)) {
                    System.out.println(computerUser.answerTheTip(tipWord));
                    System.out.println("Ezt a szót már tippelted, s nem talált, szóval kapsz még egy tipp lehetőséget");
                    tipWord = sc.nextLine();

                } else {
                    tipWordsArrayList.add(tipWord);
                }
            }
        }
        System.out.println(tipWordsArrayList);
        System.out.println(computerUser.answerTheTip(tipWord));
        if (computerUser.answerTheTip(tipWord) == 5) {
            System.out.println(" A felhasználó győzött.  A gondolt szó a \" " + tipWord + "\" volt");
            System.exit(1);
            return "A játéknak vége.";

        }
//        while (!(computerUser.answerTheTip(tipWord) == 5)) {
//            System.out.println("Adj meg egy tippet!");
//            tipWord = sc.nextLine();
//            if (tipWord.length() == 5) {
//                if (tipWordsArrayList.contains(tipWord)){
//                    System.out.println(computerUser.answerTheTip(tipWord));
//                    System.out.println("Ezt a szót már tippelted, s nem talált, szóval tippelj újat");
//                }else{
//                    tipWordsArrayList.add(tipWord);
//                }}

//            if (!(tipWord.length() == 5)) {
//            while (!(tipWord.length() == 5)) {
//                System.out.println("A tippelt szó nem helyes.(Csak 5 betűs szavakkal futtatható a játék).");
//                System.out.println("Adj meg egy tippet!");
//                tipWord = sc.nextLine();
//                if (tipWord.length() == 5) {
//                    if (tipWordsArrayList.contains(tipWord)){
//                        System.out.println(computerUser.answerTheTip(tipWord));
//                        System.out.println("Ezt a szót már tippelted, s nem talált, szóval tippelj újat");
//                    }else{
//                        tipWordsArrayList.add(tipWord);
//                    }}


//            System.out.println(tipWordsArrayList);
//            System.out.println(computerUser.answerTheTip(tipWord));
        else {
            return "Nem talált, a következő körben újra tippelhetsz.";
        }
    }
}
