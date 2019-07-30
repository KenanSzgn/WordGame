import java.util.ArrayList;
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
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Actions ob1 = new Actions(fragen, antworten);
        Scanner in = new Scanner(System.in);
        int i = 0; // to iterate trough the wordlist "anworten"
        int k = 0; // to iterate trough the characters in a word

        boolean questionIsSame = true;
        // if i < 15 than get to the next question
        while (i < 15) {
            ob1.zufallsZahlen(i);
            System.out.println(ob1.getFragen()[i]);
            questionIsSame = true;
            while (questionIsSame) {
                String entscheidung;
                System.out.println("\nGeben Sie b für einen neuen Buchstaben ein oder l wenn Sie auflösen möchten.");
                entscheidung = in.nextLine();
                if (entscheidung.equals("b")) {
                    ob1.buchstabenNehmen(i, k);
                    k++;
                    ob1.punkte(k);

                } else if (entscheidung.equals("l")) {
                    ob1.aufloesen(i);
                    System.out.println("punkte = " + ob1.points);
                    questionIsSame = false;
                    // to clear the position of the index, set index 0
                    k = 0;
                    // overwrite the temp array whit space for the new hints
                    for(int b = 0; b < ob1.temp.length; b++){
                        ob1.temp[b] = " ";
                    }
                    // clear the numbers arraylist for the new numbers
                    ob1.numbers.clear();
                }
            }
            i++;
        }
    }
}
//test