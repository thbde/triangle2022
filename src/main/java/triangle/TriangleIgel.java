package triangle;

public class TriangleIgel implements Triangle {
    
    @Override
    public TriangleResult getTriangleResultForLengths(int... lengths) {
        if (lengths == null || lengths.length !=3) {
			return TriangleResult.UNKNOWN;
		}
		final int a = lengths[0];
		final int b = lengths[1];
		final int c = lengths[2];
        if (a <= 0 || b <= 0 || c <= 0) {
            return TriangleResult.UNKNOWN;
        }
		if (a == b && b == c) {
			return TriangleResult.TRIANGLE_EQUILATERAL;
		}
		if ((a == b && b != c) || (b == c && c != a) || (a == c && c != b)) {
			return TriangleResult.TRIANGLE_ISOSCELES;
		}
        if (a != b && b != c && c != a) {
            return TriangleResult.TRIANGLE_NOT_EQUAL;
        }
        return TriangleResult.UNKNOWN;
	}
}

