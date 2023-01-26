import java.util.*;

public class MainHashTable {

    public static void main(String[] args) {
        System.out.println(" Hash table: ");
        String sentence = "To be or not to be";
        String paragraph = "paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situation";
        HashtableUC m = new HashtableUC();
        m.frequencySentenceCalculations(sentence);
        m.frequencyParagraphCalculation(paragraph);
        m.removeAvoidableWord(paragraph);
    }
}
