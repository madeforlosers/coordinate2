package coordinate.main;

public class Summation {
    private double[] sumlist = { 0, 0, 0 };
    public boolean running = false;

    public Summation() {
        this.sumlist[0] = 0;
        this.sumlist[1] = 0;
        this.sumlist[2] = 0;
    }

    public void setItem(int index, int item) {
        this.sumlist[index] = item;
    }

    public void setItem(int index, double item) {
        this.sumlist[index] = item;
    }

    public double getItem(int index) {
        return this.sumlist[index];
    }

    public void clear() {
        this.running = false;
        this.sumlist[0] = 0;
        this.sumlist[1] = 0;
        this.sumlist[2] = 0;
    }

}
