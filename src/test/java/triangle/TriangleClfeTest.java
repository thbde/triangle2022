package triangle;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;


public class TriangleClfeTest {

    public static final Triangle triangle = new TriangleClfe();

    @Test
    public void testGetTriangleResultForLengthsNotEqual() {
        final int[] input = { 5, 6, 7 };
        final TriangleResult expected = TriangleResult.TRIANGLE_NOT_EQUAL;
        final TriangleResult result = triangle.getTriangleResultForLengths(input);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testGetTriangleResultForLengthsNotEqualVariables() {
        final int a = 5;
        final int b = 6;
        final int c = 7;
        final TriangleResult expected = TriangleResult.TRIANGLE_NOT_EQUAL;
        final TriangleResult result = triangle.getTriangleResultForLengths(a, b, c);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testGetTriangleResultForLengthsNotEqual2() {
        final int[] input = { 50, 70, 90 };
        final TriangleResult expected = TriangleResult.TRIANGLE_NOT_EQUAL;
        final TriangleResult result = triangle.getTriangleResultForLengths(input);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testGetTriangleResultForLengthsIsosceles() {
        final int[] input = { 2, 2, 3 };
        final TriangleResult expected = TriangleResult.TRIANGLE_ISOSCELES;
        final TriangleResult result = triangle.getTriangleResultForLengths(input);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testGetTriangleResultForLengthsIsosceles2() {
        final int[] input = { 50, 50, 80 };
        final TriangleResult expected = TriangleResult.TRIANGLE_ISOSCELES;
        final TriangleResult result = triangle.getTriangleResultForLengths(input);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testGetTriangleResultForLengthsEquiliteral() {
        final int[] input = { 1, 1, 1 };
        final TriangleResult expected = TriangleResult.TRIANGLE_EQUILATERAL;
        final TriangleResult result = triangle.getTriangleResultForLengths(input);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testGetTriangleResultForLengthsEquiliteral2() {
        final int[] input = { 42, 42, 42 };
        final TriangleResult expected = TriangleResult.TRIANGLE_EQUILATERAL;
        final TriangleResult result = triangle.getTriangleResultForLengths(input);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testGetTriangleResultForLengthsUnknown() {
        final int[] input = { -5, 6, 7 };
        final TriangleResult expected = TriangleResult.UNKNOWN;
        final TriangleResult result = triangle.getTriangleResultForLengths(input);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testGetTriangleResultForLengthsError() {
        final int[] input = { 5, 6, 7, 8 };
        final TriangleResult expected = TriangleResult.UNKNOWN;
        final TriangleResult result = triangle.getTriangleResultForLengths(input);
        assertThat(result).isEqualTo(expected);
    }

}
