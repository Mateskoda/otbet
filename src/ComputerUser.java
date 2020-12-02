import java.util.ArrayList;

public class ComputerUser
extends Player{
        char[] characterArray ;

    public ComputerUser(String name,String imWord) {
            super.name=name;
            super.imaginedWord= imWord;
            characterArray = imWord.toCharArray();

        }

        @Override
        public void tipOneWord(int i, ArrayList<String> words) {
            System.out.println("A számítógép tippje " + words.get(i));
        }

        @Override
        public int answerTheTip(String word) {
           char [] charsOfTip = word.toCharArray();
           int cnt = 0;
            for (int i = 0; i <5 ; i++) {
                if (charsOfTip[i]==characterArray[i]){
                    cnt++;
                }
            }

            return cnt;
        }
    }

