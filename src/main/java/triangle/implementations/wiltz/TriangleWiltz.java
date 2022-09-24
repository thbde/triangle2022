package triangle.implementations.wiltz;

import triangle.Triangle;
import triangle.TriangleResult;

import java.util.Objects;

public class TriangleWiltz implements Triangle {

    @Override
    public TriangleResult getTriangleResultForLengths(final int... lengths) {
        // case: no values there
        if (lengths == null) {
            return TriangleResult.UNKNOWN;
        }

        // case: one or more values are 0 or less
        for (int i : lengths) {
            if(i <= 0) {
                return TriangleResult.UNKNOWN;
            }
        }

        // case: number of values is more or less than three
        if(lengths.length != 3) {
            return TriangleResult.UNKNOWN;
        }

        final int a = lengths[0];
        final int b = lengths[1];
        final int c = lengths[2];

        // case: triangle is not equal (a != b != c)
        if(!Objects.equals(a,b) && !Objects.equals(b,c)) {
            return TriangleResult.TRIANGLE_NOT_EQUAL;
        } else if (compareThreeValues(a,b,c)) {
            return TriangleResult.TRIANGLE_ISOSCELES;
        } else if (Objects.equals(a,b) && Objects.equals(a,c)) {
            return TriangleResult.TRIANGLE_EQUILATERAL;
        } else {
            return TriangleResult.UNKNOWN;
        }

    }

    public static boolean compareThreeValues(int a, int b, int c) {
        if (Objects.equals(a,b) && !Objects.equals(a,c)) {
            return true;
        } else if (Objects.equals(b,c) && !Objects.equals(a,c)) {
            return true;
        } else if (Objects.equals(a,c) && !Objects.equals(a,b)) {
            return true;
        }

        return false;
    }

}
