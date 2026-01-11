package coordinate.main;

import java.util.ArrayList;
import java.util.List;

public class Memory {
    public List<Object> tape = null;

    public Memory() {
        this.tape = new ArrayList<Object>();
    }

    public Object get(int index) {
        if (this.tape.get(index) == null) {
            coordinate.Error.throwError(0);
        }
        return this.tape.get(index);
    }

    public Object set(Object index, Object item) {
        if ((int) index >= this.tape.size()) {
            while ((int) index >= this.tape.size()) {
                this.tape.add(null);
            }
        }
        this.tape.set((int) index, item);
        return item;
    }

    public void push(Object item) {
        for (int n = 0; n < this.tape.size(); n++) {
            if (this.tape.get(n) == null) {
                this.tape.set(n, item);
                return;
            }
        }
        this.tape.add(item);
    }
}