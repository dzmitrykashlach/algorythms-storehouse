package algorythmchallenge;

/*
https://leetcode.com/problems/longest-valid-parentheses/
 */
public class LongestValidParentheses {
    private char LEFT_BRACKET = '(';
    private char RIGHT_BRACKET = ')';

    public int longestValidParentheses(String s) {
        int maxChain = 0;
        int currentChain = 0;
        char[] input = s.toCharArray();
        int length = s.length() - 1;
        int index = 0;
        for (char c : input) {
            if (c == LEFT_BRACKET) {
                index++;
                continue;
            } else {
                while (index < length) {
                    // check next ")"
                    if (input[index + 1] == RIGHT_BRACKET) {
                        currentChain++;
                        index+=2;
                    }else{
//                        TODO - what if brackets chain has ended ?
                    }
                }
            }
        }
        return maxChain;
    }
}
