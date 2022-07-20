package algorythmchallenge;

import org.junit.Assert;
import org.junit.Test;

public class LongestValidParenthesesTest {

    @Test
    public void twoPairs(){
        LongestValidParentheses longestValidParentheses = new LongestValidParentheses();
        Assert.assertEquals(4,longestValidParentheses.longestValidParentheses("(()())))))("));
    }

    @Test
    public void twoPairsPlusOne(){
        LongestValidParentheses longestValidParentheses = new LongestValidParentheses();
        Assert.assertEquals(4,longestValidParentheses.longestValidParentheses("(()())))())("));
    }

    @Test
    public void threePairsPlusFour(){
        LongestValidParentheses longestValidParentheses = new LongestValidParentheses();
        Assert.assertEquals(8,longestValidParentheses.longestValidParentheses("()()())))()()()()"));
    }

    @Test
    public void onePairPlusTwo(){
        LongestValidParentheses longestValidParentheses = new LongestValidParentheses();
        Assert.assertEquals(4,longestValidParentheses.longestValidParentheses("(())))()())("));
    }

    @Test
    public void onePairInTheBeginning(){
        LongestValidParentheses longestValidParentheses = new LongestValidParentheses();
        Assert.assertEquals(2,longestValidParentheses.longestValidParentheses("())))"));
    }

    @Test
    public void onePairInTheEnd(){
        LongestValidParentheses longestValidParentheses = new LongestValidParentheses();
        Assert.assertEquals(2,longestValidParentheses.longestValidParentheses(")))()"));
    }
    @Test
    public void twoPairInTheMiddle(){
        LongestValidParentheses longestValidParentheses = new LongestValidParentheses();
        Assert.assertEquals(4,longestValidParentheses.longestValidParentheses(")()())"));
    }

}
