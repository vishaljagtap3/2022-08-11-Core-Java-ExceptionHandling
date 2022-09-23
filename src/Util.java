public class Util {

    public static float calculateInterestNew(float p, int n, float r)
            throws BankingException, ArithmeticException {

        if (p <= 0 || n <= 0 || r <= 0) {
            throw new BankingException("IR Issue", p, n, r);
        }
        return (p * n * r) / 100;

    }

    public static float calculateInterest(
            float p,
            int n,
            float r
    ) {
        try {
            if (p <= 0 || n <= 0 || r <= 0) {
                throw new BankingException("IR Issue", p, n, r);
            }
            return (p * n * r) / 100;
        } catch (BankingException be) {
            System.out.println(be.getMessage());
            System.out.println(be);
        }
        return 0;
    }

}


class BankingException extends Exception {
    private float p;
    private int n;
    private float r;

    public BankingException(String message, float p, int n, float r) {
        super(message);
        this.p = p;
        this.n = n;
        this.r = r;
    }

    @Override
    public String toString() {
        return "BankingException{" +
                "p=" + p +
                ", n=" + n +
                ", r=" + r +
                '}';
    }
}