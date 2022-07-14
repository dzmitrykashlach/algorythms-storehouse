package algorythmchallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/*
Sample output:
"Here  is  one  more  option
 to achieve excellent result"
 */
public class TextJustification {

    public List<String>[] process(String[] input, int length) {
        List<String>[] output = new ArrayList[input.length];
        int charCounter = 0;
        int lineCounter = 0;
        List<String> outputLine = null;
        for (String s : input) {
            if (charCounter == 0) {
                outputLine = new ArrayList<>();
                outputLine.add(s);
                charCounter = +s.length();
                continue;
            }
            if (charCounter < length && charCounter > 0) {
                outputLine.add(" " + s);
                charCounter = +s.length();
            }
            output[lineCounter] = outputLine;
            lineCounter++;
        }
        return output;
    }

    public static void main(String[] args) {
        int lineLength = 24;
        String[] input = new String[]{"Here", "is", "one", "more", "option", "to", "achieve", "excellent", "result"};
        TextJustification textJustification = new TextJustification();
        List<String>[] output = textJustification.process(input, lineLength);
        try {
            Arrays.stream(output).peek(Objects::requireNonNull).forEach(a -> {
                System.out.println();
                a.forEach(s -> {
                    System.out.print(s);
                });
            });
        } catch (NullPointerException npe) {
            System.out.println();
            System.out.println(npe);
        }
    }
}
