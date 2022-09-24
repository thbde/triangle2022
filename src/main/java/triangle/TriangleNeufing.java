package triangle;

public class TriangleNeufing implements Triangle{
    @Override
    public TriangleResult getTriangleResultForLengths(int... lengths) {
        if (lengths == null){
            return TriangleResult.UNKNOWN;
        }

        if (lengths.length != 3) {
            return TriangleResult.UNKNOWN;
        }

        if (! allLengthGTZero(lengths)) {
            return TriangleResult.UNKNOWN;
        }

        final int a = lengths[0];
        final int b = lengths[1];
        final int c = lengths[2];

        if (a == b && a == c){
            return TriangleResult.TRIANGLE_EQUILATERAL;
        }

        if ((a == b && a != c) ||
            (a != b && b == c) ||
            (a == c && b != c)) {
            return TriangleResult.TRIANGLE_ISOSCELES;
        }

        return TriangleResult.TRIANGLE_NOT_EQUAL;
    }

    private boolean allLengthGTZero(int ... lengths){
        for (int value : lengths){
            if (value <= 0)
                return false;
        }
        return true;
    }
}
