package rocks.zipcode.quiz4.fundamentals.calculator;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.quiz4.fundamentals.Calculator;

/**
 * @author leon on 01/01/2019.
 */
public class SquareRootsTest {

    @Test
    public void test1() {
        // given
        test(new Double[]{1.0, 1.0, 1.0}, 1.0,1.0,1.0);
    }

    @Test
    public void test2() {
        // given
        test(new Double[]{1.0,1.0,3.0}, 1.0, 1.0, 9.0);
    }

    @Test
    public void test3() {
        // given
        test(new Double[]{1.0, 2.0, 3.0}, 1.0, 4.0, 9.0);
    }

    @Test
    public void test4() {
        // given
        test(new Double[]{2.0, 3.0, 4.0}, 4.0, 9.0, 16.0);
    }

    @Test
    public void test5() {
        // given
        test(new Double[]{5.0, 6.0, 7.0}, 25.0, 36.0, 49.0);
    }

    private void test(Double[] expected, Double... inputArray) {
        // when
        Calculator calculator = new Calculator();
        Double[] actual = calculator.squareRoots(inputArray);

        // then
        Assert.assertArrayEquals(expected, actual);
    }
}