package triangle;

public class Triangle_klja1001 implements Triangle {

    @Override
    public TriangleResult getTriangleResultForLengths(int... lengths) {
        if (lengths == null || lengths.length !=3 ) {
			return TriangleResult.UNKNOWN;
		}
		final int a = lengths[0];
		final int b = lengths[1];
		final int c = lengths[2];
        if(a<=0 || b<=0 || c<=0){
            return TriangleResult.UNKNOWN;
        }
        if (a == b && b == c) {
            //gleichseitig
			return TriangleResult.TRIANGLE_EQUILATERAL;
		}
		if ((a == b && b != c) || (a != b && b == c) || (a == c && c != b)) {
            //gleichschenklig
			return TriangleResult.TRIANGLE_ISOSCELES;
		}
        if (a != b && b != c && c != a){
		    return TriangleResult.TRIANGLE_NOT_EQUAL;
        }
        return TriangleResult.UNKNOWN;
    }
}
