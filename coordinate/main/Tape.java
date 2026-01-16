package coordinate.main;

import java.util.ArrayList;

/*  
 *  COORDINATE LANGUAGE
 *  by madeforlosers 2026
 *  
 *  Tape.java
 *      Main tape memory
 * 
 *  TODO:
 *      comment code more
*/

public class Tape {
    private final ArrayList<Object> data;

    public Tape() {
        this.data = new ArrayList<>();
    }

    public Object get(int index) {
        if (index < 0 || index >= this.data.size()) {
            coordinate.main.Error.throwError(0);
        }
        Object val = this.data.get(index);
        if (val == null) {
            coordinate.main.Error.throwError(0);
        }
        return val;
    }

    public void set(int index, Object item) {
        if (index < 0) {
            coordinate.main.Error.throwError(0);
        }
        while (index >= this.data.size()) {
            this.data.add(null);
        }
        this.data.set(index, item);
    }

    public void push(Object item) {
        for (int n = 0; n < this.data.size(); n++) {
            if (this.data.get(n) == null) {
                this.data.set(n, item);
                return;
            }
        }
        this.data.add(item);
    }

    public int size() {
        return this.data.size();
    }

    public ArrayList<Object> subList(int start, int end) {
        return new ArrayList<>(this.data.subList(start, end));
    }
}