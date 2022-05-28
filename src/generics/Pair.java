package generics;

public class Pair<A, B> {
    // Heeft het nut om die generic fields hier private te zetten??
    // Is public logischer, of hangt het af van de use case??
    private A a;
    private B b;

    protected Pair (){}

    public Pair (A a, B b){
        this.a = a;
        this.b = b;
    }

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }
}
