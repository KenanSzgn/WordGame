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
            System.out.println(ob1.getFragen()[i]);
            String entscheidung;
            System.out.println("\nGeben Sie b für einen neuen Buchstaben ein oder l wenn Sie auflösen möchten.");
            entscheidung = in.nextLine();
            if (entscheidung.equals("b")) {
                ob1.buchstabenNehmen(i);
            } else if (entscheidung.equals("l")) {
                ob1.aufloesen(i);
            }
        }
        i++;
    }
}
