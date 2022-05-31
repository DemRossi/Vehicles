package generics;

import java.util.List;

public class Pair<A>{
    // Heeft het nut om die generic fields hier private te zetten??
    // Is public logischer, of hangt het af van de use case??
    private A a;
    private A b;

    protected Pair (){}

    public Pair (A a, A b){
        this.a = a;
        this.b = b;
    }

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }

    public A getB() {
        return b;
    }

    public void setB(A b) {
        this.b = b;
    }
}
