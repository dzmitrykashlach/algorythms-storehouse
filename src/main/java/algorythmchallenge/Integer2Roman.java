package algorythmchallenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Integer2Roman {
    private static List<String> mapping = new ArrayList<>();

    static {
        mapping.add("I"); // 1
        mapping.add("V"); // 5
        mapping.add("X"); // 10
        mapping.add("L"); // 50
        mapping.add("C"); // 100
        mapping.add("D"); // 500
        mapping.add("M"); // 1000
    }

    public String intToRoman(int num) {
        Stack<Integer> digits = new Stack<>();
//        split int into digits
        int digit = 0;
        while (num > 0) {
            digit = num % 10;
            digits.push(digit);
            num = num / 10;
        }
        StringBuilder roman = new StringBuilder();

        while (!digits.empty()) {
            int position = digits.size();
            digit = digits.pop();

            if (digit >= 1 & digit < 4) {
                switch (position) {
                    case 1 -> roman.append(String.join("", Collections.nCopies(digit, mapping.get(0))));
                    case 2 -> roman.append(String.join("", Collections.nCopies(digit, mapping.get(2))));
                    case 3 -> roman.append(String.join("", Collections.nCopies(digit, mapping.get(4))));
                    case 4 -> roman.append(String.join("", Collections.nCopies(digit, mapping.get(6))));
                }
            }
            if (digit == 4) {
                switch (position) {
                    case 1 -> roman.append(String.join("",mapping.get(0),mapping.get(1)));
                    case 2 -> roman.append(String.join("",mapping.get(2),mapping.get(3)));
                    case 3 -> roman.append(String.join("",mapping.get(4),mapping.get(5)));
                }

            }
            if (digit == 5) {
                switch (position) {
                    case 1 -> roman.append(mapping.get(1));
                    case 2 -> roman.append(mapping.get(3));
                    case 3 -> roman.append(mapping.get(5));
                }
            }
            if (digit > 5 & digit < 9) {
                switch (position) {
                    case 1 -> roman.append(mapping.get(1))
                            .append(String.join("", Collections.nCopies(digit-5, mapping.get(0))));
                    case 2 -> roman.append(mapping.get(3))
                            .append(String.join("", Collections.nCopies(digit-5, mapping.get(2))));
                    case 3 -> roman.append(mapping.get(5))
                            .append(String.join("", Collections.nCopies(digit-5, mapping.get(4))));
                }
            }
            if (digit == 9) {
                switch (position) {
                    case 1 -> roman.append(String.join("",mapping.get(0),mapping.get(2)));
                    case 2 -> roman.append(String.join("",mapping.get(2),mapping.get(4)));
                    case 3 -> roman.append(String.join("",mapping.get(4),mapping.get(6)));
                }
            }
        }
        return roman.toString();
    }
}
