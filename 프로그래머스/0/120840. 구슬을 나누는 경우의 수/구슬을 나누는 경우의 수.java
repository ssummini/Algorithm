import java.math.BigInteger;

class Solution {
    public int solution(int balls, int share) {
        BigInteger a = BigInteger.ONE;
        BigInteger b = BigInteger.ONE;
        BigInteger c = BigInteger.ONE;

        for (int i = 1; i <= balls; i++) {
            a = a.multiply(BigInteger.valueOf(i));
        }

        for (int i = 1; i <= balls - share; i++) {
            b = b.multiply(BigInteger.valueOf(i));
        }

        for (int i = 1; i <= share; i++) {
            c = c.multiply(BigInteger.valueOf(i));
        }

        BigInteger result = a.divide(b.multiply(c));
        return result.intValue();
    }
}
