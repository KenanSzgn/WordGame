/**
 * Projektname:            Wordgame
 * Programmname:
 * Version: 				1.0
 * Erstellungsdatum:		14.06.2019
 * Autor:   				Kenan Sezgin
 **/
public class Data { //test
    private String[] fragen = new String[14];
    private String[] antworten = new String[14];

    public Data(String[] fragen, String[] antworten) {
        this.fragen = fragen;
        this.antworten = antworten;

        fragen[0] = "Kleinste, aus einem oder mehreren Lauten gebildete Einheit innerhalb einer Wortform";
        antworten[0] = "Silbe";
        fragen[1] = "angenehmer, feiner Geruch";
        antworten[1] = "Duft";
        fragen[2] = "nach innen gewölbt";
        antworten[2] = "Konkav";
        fragen[3] = " Dünner Mensch";
        antworten[3] = "Abgemagert";
        fragen[4] = "pikante, dickflüssige Sose zum Würzen";
        antworten[4] = "Ketchup";
        fragen[5] = "mit freudiger Bereitwilligkeit, Vergnügen";
        antworten[5] = "Gerne";
        fragen[6] = "den Intellekt betreffend; verstandesmäsig, geistig";
        antworten[6] = "Intellektuell";
        fragen[7] = " Person, die einen Mord begangen hat";
        antworten[7] = "Mörder";
        fragen[8] = "Aßber das gewohnte MaÃŸ hinausgehend";
        antworten[8] = "AuÃŸergewÃ¶hnlich";
        fragen[9] = "sich (in einer bestimmten Weise) verhalten, betragen";
        antworten[9] = "benehmen";
        fragen[10] = "philosophische Disziplin oder Lehre, die das hinter der sinnlich erfahrbaren, natÃ¼rlichen Welt Liegende, die letzten GrÃ¼nde und ZusammenhÃ¤nge des Seins behandelt";
        antworten[10] = "metaphysik";
        fragen[11] = "Einrichtungsgegenstand, mit dem ein Raum ausgestattet ist";
        antworten[11] = "Möbel";
        fragen[12] = "für ein Individuum spezifische, relativ konstante Weise des FÃ¼hlens, Erlebens, Handelns und Reagierens";
        antworten[12] = "Temperament";
        fragen[13] = " weder Lust noch Unlust empfindend oder erkennen lassend";
        antworten[13] = "gleichgültig";
    }

    public String[] getFragen() {
        return fragen;
    }

    public void setFragen(String[] fragen) {
        this.fragen = fragen;
    }

    public String[] getAntworten() {
        return antworten;
    }

    public void setAntworten(String[] antworten) {
        this.antworten = antworten;
    }


    //TÃ¼rkische Fragen und Antworten
//	fragen[0] = "tek nefeste Ã§Ä±kan ses";
//	antworten[0] = "hece";
//	fragen[1] = "gÃ¼zel koku";
//	antworten[1] = "itir";
//	fragen[2] = "yakÄ±ÅŸÄ±klÄ± delikanlÄ±";
//	antworten[2] = "civan";
//	fragen[3] = " Ã§ok zayÄ±f insanlara yakÄ±ÅŸtÄ±rÄ±lan bir tabir";
//	antworten[3] = "Ã§Ä±rpÄ±";
//	fragen[4] = "ismine ait rengi olan bir tÃ¼r sos";
//	antworten[4] = "hardal";
//	fragen[5] = "seve seve anlamÄ±nda bir sÃ¶z";
//	antworten[5] = "hayhay";
//	fragen[6] = "kÃ¶tÃ¼lÃ¼k ve zeka iÃ§eren";
//	antworten[6] = "ÅŸeytani";
//	fragen[7] = " cana kÄ±yan, insan Ã¶ldÃ¼ren";
//	antworten[7] = "canavar";
//	fragen[8] = "eski dilde benzerlerinden Ã¼stÃ¼n olan";
//	antworten[8] = "mÃ¼stesna";
//	fragen[9] = "kiÅŸiyi davranÄ±ÅŸÄ± sebebiyle iyi dÃ¼ÅŸÃ¼nÃ¼lmeyenler arasÄ±na koymak";
//	antworten[9] = "mimlemek";
//	fragen[10] = "somut yasalara baÄŸlÄ± olmayan bilim dalÄ±";
//	antworten[10] = "metafizik";
//	fragen[11] = "deÄŸersiz eski eÅŸya";
//	antworten[11] = "pÄ±lÄ±pÄ±rtÄ±";
//	fragen[12] = "mizaÃ§ Ã¶zellikleri";
//	antworten[12] = "cibilliyet";
//	fragen[13] = "pervasÄ±zca, sonunu dÃ¼ÅŸÃ¼nmeden ileriye atÄ±lmak";
//	antworten[13] = "bodoslamak";

}
