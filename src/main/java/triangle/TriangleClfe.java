package triangle;

public class TriangleClfe implements Triangle
{
    @Override
    public TriangleResult getTriangleResultForLengths(int... lengths)
    {
        if (lengths.length != 3)
        {
            return TriangleResult.UNKNOWN;
        } else if (lengths[0] < 0 || lengths[1] < 0 || lengths[2] < 0)
        {
            return TriangleResult.UNKNOWN;
        } else if (lengths[0] != lengths[1] && lengths[1] != lengths[2])
        {
            return TriangleResult.TRIANGLE_NOT_EQUAL;
        } else if ((lengths[0] == lengths[1] && lengths[1] != lengths[2]) || (lengths[1] == lengths[2] && lengths[0] != lengths[1]) || (lengths[0] == lengths[2] && lengths[1] != lengths[2]))
        {
            return TriangleResult.TRIANGLE_ISOSCELES;
        } else return TriangleResult.TRIANGLE_EQUILATERAL;
    }
}
