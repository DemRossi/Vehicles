package generics;

public class PairOfPairs {
    public static void main(String[] args) {
        Pair<String, Integer> score1 = new Pair<>("Will", 60);
        System.out.println("-------Pair of String and Integer-------");
        System.out.println(score1.a + " : " + score1.b );

//        score1.a = 60;
//        score1.b = "Will";

        Pair<String, String> stringsPair = new Pair<>("This", "That");
        System.out.println("-------Pair of String and String-------");
        System.out.println(stringsPair.a + " : " + stringsPair.b );
        stringsPair.b = "Will";
        System.out.println(stringsPair.a + " : " + stringsPair.b );
    }
}
