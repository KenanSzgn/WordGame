import java.util.Scanner;

/**
 * Projektname:            Wordgame
 * Programmname:
 * Version: 				1.0
 * Erstellungsdatum:		14.06.2019
 * Autor:   				Kenan Sezgin
 **/
public class ActionsTest {
    public static void main(String[] args) {
        String[] fragen = new String[14];
        String[] antworten = new String[14];
        Actions ob1 = new Actions(fragen, antworten);
        Scanner in = new Scanner(System.in);

        int i = 0; //test
        boolean gameIsPlaying = true;
        while (gameIsPlaying){
            ob1.zufallsZahlen(i);
            System.out.println(ob1.getFragen()[i]);
            String entscheidung;
            System.out.println("\nGeben Sie b für einen neuen Buchstaben ein oder l wenn Sie auflösen möchten.");
            entscheidung = in.nextLine();
            // Every time i start buchstabenNehmen the program goes on and starts ob1.zufallsZahlen(i)
            // becouse of this i geht every time a longer list( called: number) of random numbers
            // and every time i get the random number which is on the first place of the list(called: number).
            // i have to fix this both problems
            if (entscheidung.equals("b")) {
                ob1.buchstabenNehmen(i);
            } else if (entscheidung.equals("l")) {
                ob1.aufloesen(i);
            }
        }
        i++;
    }
}
