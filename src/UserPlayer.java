import java.util.ArrayList;

public class UserPlayer extends Player{
    char[] characterArray ;

    public UserPlayer(String name,String imWord) {
        super.name = name;
        super.imaginedWord = imWord;
        characterArray = imWord.toCharArray();
    }

    @Override
    public void tipOneWord(int i, ArrayList<String> words) {

    }

    @Override
    public int answerTheTip(String word) {
        char [] charsOfTip = word.toCharArray();
        int cnt = 0;
        for (int i = 0; i <5 ; i++) {
            if (charsOfTip[i]==characterArray[i]){
                cnt++;
            }}
            return cnt;

    }
}