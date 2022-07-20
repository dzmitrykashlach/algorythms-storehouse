package algorythmchallenge;

import org.junit.Assert;
import org.junit.Test;

public class Integer2RomanTest {


    // 100 test cases
    @Test
    public void test3421() {
        Integer2Roman integer2Roman = new Integer2Roman();
        Assert.assertEquals("MMMCDXLI", integer2Roman.intToRoman(3441));
    }


    @Test
    public void test3521() {
        Integer2Roman integer2Roman = new Integer2Roman();
        Assert.assertEquals("MMMDXXI", integer2Roman.intToRoman(3521));
    }

    @Test
    public void test3721() {
        Integer2Roman integer2Roman = new Integer2Roman();
        Assert.assertEquals("MMMDCCXXI", integer2Roman.intToRoman(3721));
    }

    @Test
    public void test3921() {
        Integer2Roman integer2Roman = new Integer2Roman();
        Assert.assertEquals("MMMCMXXI", integer2Roman.intToRoman(3921));
    }

    // 10 test cases
    @Test
    public void test3221() {
        Integer2Roman integer2Roman = new Integer2Roman();
        Assert.assertEquals("MMMCCXXI", integer2Roman.intToRoman(3221));
    }

    @Test
    public void test3241() {
        Integer2Roman integer2Roman = new Integer2Roman();
        Assert.assertEquals("MMMCCXLI", integer2Roman.intToRoman(3241));
    }


    @Test
    public void test3251() {
        Integer2Roman integer2Roman = new Integer2Roman();
        Assert.assertEquals("MMMCCLI", integer2Roman.intToRoman(3251));
    }

    @Test
    public void test3271() {
        Integer2Roman integer2Roman = new Integer2Roman();
        Assert.assertEquals("MMMCCLXXI", integer2Roman.intToRoman(3271));
    }

    @Test
    public void test3291() {
        Integer2Roman integer2Roman = new Integer2Roman();
        Assert.assertEquals("MMMCCXCI", integer2Roman.intToRoman(3291));
    }

    // 1000 test cases
    @Test
    public void test2131() {
        Integer2Roman integer2Roman = new Integer2Roman();
        Assert.assertEquals("MMCXXXI", integer2Roman.intToRoman(2131));
    }

    // 1 test cases
    @Test
    public void test2132() {
        Integer2Roman integer2Roman = new Integer2Roman();
        Assert.assertEquals("MMCXXXII", integer2Roman.intToRoman(2132));
    }

    @Test
    public void test2134() {
        Integer2Roman integer2Roman = new Integer2Roman();
        Assert.assertEquals("MMCXXXIV", integer2Roman.intToRoman(2134));
    }

    @Test
    public void test2135() {
        Integer2Roman integer2Roman = new Integer2Roman();
        Assert.assertEquals("MMCXXXV", integer2Roman.intToRoman(2135));
    }

    @Test
    public void test2138() {
        Integer2Roman integer2Roman = new Integer2Roman();
        Assert.assertEquals("MMCXXXVIII", integer2Roman.intToRoman(2138));
    }

    @Test
    public void test2139() {
        Integer2Roman integer2Roman = new Integer2Roman();
        Assert.assertEquals("MMCXXXIX", integer2Roman.intToRoman(2139));
    }

    @Test
    public void test3444() {
        Integer2Roman integer2Roman = new Integer2Roman();
        Assert.assertEquals("MMMCDXLIV", integer2Roman.intToRoman(3444));
    }

    @Test
    public void test3999() {
        Integer2Roman integer2Roman = new Integer2Roman();
        Assert.assertEquals("MMMCMXCIX", integer2Roman.intToRoman(3999));
    }
}
