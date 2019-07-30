import java.util.*;
import java.util.Collections;

/**
 * Projektname:            Wordgame
 * Programmname:
 * Version: 				1.0
 * Erstellungsdatum:		14.06.2019
 * Autor:   				Kenan Sezgin
 **/
public class Actions extends Data {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    Scanner in = new Scanner(System.in);
    int points = 0;
    int i;
    // take the same length for the temp Array like the answer array
    String[] temp = new String[getAntworten()[i].length()];

    public Actions(String[] fragen, String[] antworten) {
        super(fragen, antworten);
    }

    // create a random number
    public ArrayList<Integer> zufallsZahlen(int i) {
        for (int k = 0; k < getAntworten()[i].length(); k++) {
            numbers.add(k);
        }
        // mix the numbers
        Collections.shuffle(numbers);
        System.out.println("    Zufallszahl: " + numbers);
        return numbers;
    }

    public void buchstabenNehmen(int i, int k) {
        // take the character at the index from the number which you get from the first index
        // of the numbers ArrayList and put it to "s"
        String s = "";
        s = String.valueOf(getAntworten()[i].charAt(numbers.get(k)));
        // take the "s" and put it to the temp array at the same index from above
        temp[numbers.get(k)] = s;
        for (int j = 0; j < temp.length; j++) {
            // print tempArray
            System.out.print(temp[j] + "|");
        }
    }

    public boolean aufloesen(int i) {
        System.out.println("Geben Sie die Antwort ein.");
        String antwort = in.next();
        if (antwort.equals(getAntworten()[i])) {
            System.out.println("Die Lösung ist korrekt: " + getAntworten()[i]);
            return true;
        } else {
            System.out.println("Die Lösung ist falsch. Versuchen Sie es erneut.");
            return false;
        }
    }

    public void punkte(int k){
        // points: points equel to the length of the word multiplied with 100 and than minus the characters
        // you taked as a hint
        points = (getAntworten()[i].length() * 100) -(k *(100));
    }
}

//int z;
//z = ((int) (Math.random() * getAntworten()[i].length()));

// public static int[] shuffle(int[] arr) {
//        Objects.requireNonNull(arr);
//        Random rand = ThreadLocalRandom.current();
//        for (int i = arr.length - 1; i > 0; i--) {
//            int idx = rand.nextInt(i);
//            int t = arr[i];
//            arr[i] = arr[idx];
//            arr[idx] = t;
//        }
//        return arr;
//    }

////Zeige zufï¿½lligen Buchstaben vom AntwortenArray.
//	public int buchstabenNehmen(int i) {
//
//		System.out.println("lenge des Strings an der Stelle i: " + getAntworten()[i].length());
//
//		// Zufallszahl
//		int z;
//		z = ((int) (Math.random() * getAntworten()[i].length()));
//
//		for(int p = 0; p < sammleZZ.length; p++) {
//
//			sammleZZ[i] = z;
//		}
//
//		if(sammleZZ[i] <= )
//
//
//		// Packe den char an die gleiche Stelle ins tempArray wie das AntwortArray
//		temp[z] = String.valueOf(getAntworten()[i].charAt(z));
//
//		// Zeige Inhalt vom Array
//		for (int j = 0; j < temp.length; j++) {
//
//			System.out.println(temp[j]);
//		}
//
//		// Ich muss das temp Array noch fï¿½llen. ggf mit einer for Schleife
//
//		System.out.println("Geben Sie b fï¿½r einen neuen Buchstaben ein oder l wenn Sie auflï¿½sen mï¿½chten.");
//		String entscheidung = in.nextLine();
//		if (entscheidung.equals("b")) {
//			buchstabenNehmen(i);
//
//		} else if (entscheidung.equals("l")) {
//			System.out.println("Fertig mit Buchstaben nehmen.");
//		}
//
//		return i;
//	}

//// Speichere die einzelnen Charakter(Buchstaben) vom Antwort-String (von der
//// Stelle a) in eine ArrayListe (in die Stelle c)
//public void speichereBuchstabenInArrayListeUndMischeSie(int a, int c) {
//	arrayList.add(getAntworten()[a].charAt(c));
//
//	// Gehe zum nï¿½chsten Buchstaben
//	c++;
//
//	// Soll ich hier lieber eine While Schleife vewenden anstatt einer If Anweisung.
//	// Wann While-Schleife wann If-Anweisung
//	if (c >= getAntworten()[a].length()) {
//		// Mische die Reihenfolge der ArrayListe
//		Collections.shuffle(arrayList);
//
//		System.out.println("Inhalt der Arrayliste" + arrayList);
//
//	} else {
//		// Rufe die Methode nochmal auf fï¿½r den nï¿½chsten Buchstaben
//		speichereBuchstabenInArrayListeUndMischeSie(a, c);
//	}
//}

//	public void buchstabenAusgeben() {
//
//		if (arrayList.size() > 0) {
//
//			// Gebe Buchstaben an der Stelle b aus.
//			System.out.println("Gelen harf: " + arrayList.get(0));
//
//			// Lï¿½sche den Buchstaben den du schon gezeigt hast.
//			arrayList.remove(0);
//		} else {
//
//			System.out.println("Alle Buchstaben schon genommen. ");
//		}
//
//	}

//public char buchstabenNehmen(int i) {
//
////	int min = 0;
////	int max = getAntworten()[i].substring(beginIndex, endIndex);
//	// Bekomme zufï¿½llige Stelle von dem String
//	//char c = getAntworten()[i].charAt((int) Math.random() * getAntworten()[i].length());
//
//
//	//Zufallsgenerator: Gibt eine Zahl zwischcen 0 und der Lï¿½nge des Strings in dem Array aus.
//	int x = generator.nextInt(getAntworten()[i].length());
//	//Gebe einen zufï¿½lligen Buchstaben vom String aus
//	char c = getAntworten()[i].charAt(x);
//
//	// (int) Math.random() * 1
//	// ob.getAntworten()[i].length()
//
//	return c;
//}
// zufallszahl = (int)(Math.random() * 10) + 1;
// String s = "Ene mene Maus";
// char c = s.charAt(0);
// System.out.println(c); // E