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
        for (int index = 0; index < length; index++) {
            if ((input[index] == LEFT_BRACKET & input[index + 1] == LEFT_BRACKET)
                    | (input[index] == RIGHT_BRACKET & input[index + 1] == RIGHT_BRACKET)) {
                currentChain = 0;
                continue;
            }
            if (input[index] == LEFT_BRACKET & input[index + 1] == RIGHT_BRACKET) {
                currentChain+=2;
                index ++;
            }
            maxChain = Math.max(currentChain, maxChain);
        }
        return maxChain;
    }
}
