package coordinate.main;

import java.util.ArrayList;

public class IncLoop {
    private ArrayList<Double> loops;

    IncLoop() {
        this.loops = new ArrayList<Double>();
    }

    public void set(int index, Double item) {
        this.loops.add(index, item);
    }

    public int id() {
        return this.loops.size();
    }

    public double latest() {
        return this.loops.get(0);
    }

    public double get(int id) {
        return this.loops.get(id);
    }

    public void crement(int id, double inc) {
        this.loops.set(id, this.loops.get(id) + inc);
    }

    public double remove(int index) {
        double g = this.loops.get(index);
        this.loops.remove(index);
        return g;
    }
}
