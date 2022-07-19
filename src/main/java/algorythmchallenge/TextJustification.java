package algorythmchallenge;

import java.util.*;

/*
Sample output:
"Here  is  one  more  option
 to achieve excellent result"
 */
public class TextJustification {

    public List<String>[] process(String[] words, int maxLength) {
        List<String>[] output = new ArrayList[words.length];
        int charCounter = 0;
        int lineCounter = 0;
        int curLength = 0;
        List<String> wordLine = new ArrayList<>();
        for (String word : words) {
            curLength = charCounter + 1 + word.length();
//     Case 1 exceed max length and ...
            if (charCounter > maxLength) {
                int spaceLeft = maxLength - charCounter;
                if (wordLine.size() == 1) {
                    wordLine.add(String.join("*", Collections.nCopies(maxLength - wordLine.get(0).length(), "*")));
                }else{
//                    calculate reminder to assign more spaces to empty slots on the left
                      int quatient = spaceLeft/(wordLine.size()-1);
                      int reminder = spaceLeft%(wordLine.size()-1);
                      int frontSpaces = 0;
                      int endSpaces = 0;
                }
            }
//            TODO
//            Case 1a Single word in the line. We justify left(add whitespaces to the right)
//            Case 1b Multiple words per line. We need to distribute whitespaces between all the words.
//            Calculate reminder to assign more spaces to empty slots on the left
//            Reset current line and counts;
//     Case 2
//            Case 2a
//            Case 2b
//            Last line if there are still words to be added;
        }
        return output;
    }

    public static void main(String[] args) {
        int lineLength = 24;
        String[] input = new String[]{"Here", "is", "one", "more", "option", "to", "achieve", "excellent", "result",
                "with", "perfect", "but", "yet", "unpredictable", "high", "quality"};
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
