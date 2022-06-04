package PostalCodes;

import java.util.*;

public class Gemeentes {
    String[] names = buildNamesArray();
    SortedSet<String> set = new TreeSet<>();

    public static void main(String[] args) {
        Gemeentes g = new Gemeentes();
        g.arrayToSet();
        g.printElementsInSet();
        System.out.println();
        g.printSet();

        System.out.println();

        Iterator<String> i = g.set.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }
    }


    private void arrayToSet(){
        Collections.addAll(set, names);
    }

    private void printElementsInSet(){
        for (String name : names ) {
            System.out.println("name : " + name);
        }
    }

    private void printSet(){
        System.out.println(Arrays.toString(names));
    }

    private String[] buildNamesArray() {
        String[] gemeentes = new String[10];

        gemeentes[0] = "Stabroek";
        gemeentes[1] = "Lint";
        gemeentes[2] = "Berchem";
        gemeentes[3] = "Rumst";
        gemeentes[4] = "Malle";
        gemeentes[5] = "Rijkevorsel";
        gemeentes[6] = "Tienen";
        gemeentes[7] = "Landen";
        gemeentes[8] = "Oostende";
        gemeentes[9] = "Nazareth";

        return gemeentes;
    }


}
