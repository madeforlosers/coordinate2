package coordinate.main;

import java.math.BigInteger;

public class Summation {
    private BigInteger[] sumlist = { BigInteger.ZERO, BigInteger.ZERO, BigInteger.ZERO };
    public boolean running = false;

    public Summation() {
        this.sumlist[0] = BigInteger.ZERO;
        this.sumlist[1] = BigInteger.ZERO;
        this.sumlist[2] = BigInteger.ZERO;
    }

    public void setItem(int index, BigInteger item) {
        this.sumlist[index] = item;
    }

    public BigInteger getItem(int index) {
        return this.sumlist[index];
    }

    public void clear() {
        this.sumlist[0] = BigInteger.ZERO;
        this.sumlist[1] = BigInteger.ZERO;
        this.sumlist[2] = BigInteger.ZERO;
    }

}
