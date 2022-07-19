package algorythmchallenge;

import org.junit.Assert;
import org.junit.Test;

public class Integer2RomanTest {


    @Test
    public void test3421(){
        Integer2Roman integer2Roman = new Integer2Roman();
        Assert.assertEquals("MMMCCXLI",integer2Roman.intToRoman(3441));
    }


    @Test
    public void test3521(){
        Integer2Roman integer2Roman = new Integer2Roman();
        Assert.assertEquals("MMMCCLI",integer2Roman.intToRoman(3521));
    }

    @Test
    public void test3721(){
        Integer2Roman integer2Roman = new Integer2Roman();
        Assert.assertEquals("MMMCCLXXI",integer2Roman.intToRoman(3721));
    }

    @Test
    public void test3921(){
        Integer2Roman integer2Roman = new Integer2Roman();
        Assert.assertEquals("MMMCCXCI",integer2Roman.intToRoman(3921));
    }

/////////////////////////////////////////////////////////
    @Test
    public void test3221(){
        Integer2Roman integer2Roman = new Integer2Roman();
        Assert.assertEquals("MMMCCXXI",integer2Roman.intToRoman(3221));
    }

    @Test
    public void test3241(){
        Integer2Roman integer2Roman = new Integer2Roman();
        Assert.assertEquals("MMMCCXLI",integer2Roman.intToRoman(3241));
    }


    @Test
    public void test3251(){
        Integer2Roman integer2Roman = new Integer2Roman();
        Assert.assertEquals("MMMCCLI",integer2Roman.intToRoman(3251));
    }

    @Test
    public void test3271(){
        Integer2Roman integer2Roman = new Integer2Roman();
        Assert.assertEquals("MMMCCLXXI",integer2Roman.intToRoman(3271));
    }

    @Test
    public void test3291(){
        Integer2Roman integer2Roman = new Integer2Roman();
        Assert.assertEquals("MMMCCXCI",integer2Roman.intToRoman(3291));
    }
}
