package algorythmchallenge;

public class PrimitivesUnitTest {

    public void whenModifyingPrimitives_thenOriginalValuesNotModified() {

        int x = 1;
        int y = 2;

        // Before Modification
        System.out.println(x);
        System.out.println(y);

        modify(x, y);

        // After Modification
        System.out.println(x);
        System.out.println(y);
    }

    public void modify(int x1, int y1) {
        x1 = 5;
        y1 = 10;
    }

    public static void main(String[] args) {
        PrimitivesUnitTest primitivesUnitTest = new PrimitivesUnitTest();
        primitivesUnitTest.whenModifyingPrimitives_thenOriginalValuesNotModified();
    }
}