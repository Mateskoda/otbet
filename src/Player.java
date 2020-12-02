import java.util.ArrayList;

public abstract class Player {
    String name;
    String imaginedWord;

    public String getName() {
        return name;
    }

    public String getImaginedWord() {
        return imaginedWord;
    }

    public abstract void tipOneWord(int i, ArrayList<String> words);
    public abstract int answerTheTip(String word);

}
