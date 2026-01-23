package coordinate.main;

import java.util.ArrayList;

public class Func {
    private ArrayList<Integer> functionC = new ArrayList<Integer>();
    private ArrayList<Object> funcargs = new ArrayList<Object>();
    
    public int getC(int i){
        return functionC.get(i);
    }
    public Object getA(int i){
        return funcargs.get(funcargs.size()-4+i);
    }
    public void pushA(Object... a){
        for(Object j : a){
            funcargs.add(j);
        }
    }
    public void unshiftC(int a){
        functionC.add(0,a);
    }
    public int shiftC(){
        int g = functionC.get(0);
        functionC.remove(0);
        return g;
    }
    public void remArg(){
        funcargs = new ArrayList<>(funcargs.subList(funcargs.size()-4,funcargs.size()));
    }
    public int Clength(){
        return functionC.size();
    }

}
