package generics;

public class Pair<A, B> {
    public A a;
    public B b;

    protected Pair (){}

    public Pair (A a, B b){
        this.a = a;
        this.b = b;
    }
}
