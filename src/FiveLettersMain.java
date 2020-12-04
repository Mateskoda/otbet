import java.io.*;
import java.util.ArrayList;

public class FiveLettersMain {

    public static void main(String[] args) throws IOException {
//TryToGuessComputersWord.tryToGuessCW();
        String filename = "szavak.txt";
        String filename2 = "freedict.txt";
        ArrayList<String> words = Read.readFile(filename2);
        Writer wr = new FileWriter("fiveLetter");
        for (int i = 0; i < words.size() ; i++) {
        wr.write(words.get(i));
        wr.write("\n");
        }
        wr.close();

         ComputerGuessesToo.computerGuessesToo(words);
      //    Ötbetűs(**)
//    Az ötbetűs játék egy memória és logikai játék. A játékot két vagy
//    több játékos játszhatja. Két játékos esetén a játék a következőképpen
//    megy:
//
//   Tegyük fel, hogy Jancsi és Juliska ötbetűznek. Először Jancsi is és
//   Juliska is gondol egy öt betűs szóra (és a szavát nem árulja el a
//   másiknak). Ez a két szó lesz a feladvány. Ezután mindketten megpróbálják
//   kitalálni a másik által gondolt szót, méghozzá úgy, hogy felváltva öt
//   betűs szavakat mondanak egymásnak (ezek a tippek). A másik pedig minden
//   tippre egy 0 és 5 közötti számmal válaszol. A szám azt jelenti, hogy
//   a kitalálandó feladványban és a tippen hány karakter van pontosan
//   ugyanazon a helyen. Ha pl. Jancsi arra a szóra gondol,
//   hogy csávó és Julcsi azt a tippet mondja, hogy kelep,
//   akkor Jancsi 0-val válaszol. Ugyancsak 0 a válasz, a vacsi tippre,
//   mert bár a vacsi-ban és a csávó-ban sok azonos betű van, egyik sem
//   ugyanazon a helyen található.
//   Ha Julcsi tippje esték, akkor Jancsi válasza 1, mert a csávó és az
//   esték második karaktere is s. Ha Julcsi tippje oszló,
//   akkor Jancsi válasza 2, mivel a második (s) és az ötödik (ó)
//   karakterek egyeznek meg a két szóban.
//    Ha Julcsi valamelyik tippjére Jancsi 5-el válaszol,
//    az azt jelenti, hogy Julcsi kitalálta Jancsi feladványát
//    (hiszen a tippben és a feladványban minden karakter megegyezik).

//    A játékot az nyeri, aki hamarabb kitalálja a másik feladványát.
//    A játékot kettőnél többen is játszhatják, ilyenkor mindenki kigondol
//    egy feladványt, majd meghatározott sorrendben mondanak tippeket,
//    és minden tippre mindenki válaszol egy számmal. A játékot ilyenkor az
//    nyeri, aki a legtöbb feladványt találja ki.
//    Írj programot, amivel ötbetűzni lehet!
//    A program gondoljon egy öt betűs szóra, és a vele játszó ember
//    adhasson tippeket, a program pedig válaszoljon a tippekre a játék
//    szabályai szerint számokkal. Ha az játékos kitalálta a szót,
//    a program írja ki, hogy 5, és fejeződjön be a játék
//    (vagy ajánljon fel egy újabb játékot)!
//    Magyar szavakról listát találsz pl.
//    itt: https://sourceforge.net/projects/wordlist-hu/. A freedict
//    nevű fájlból válogathatsz ötbetűseket.
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
    }
}
