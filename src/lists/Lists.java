package lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        System.out.println("---------ArrayList---------");
        List<String> stringList = new ArrayList<>();
        stringList.add("Dit ");
        stringList.add("is ");
        stringList.add("een ");
        stringList.add("test!");

        System.out.println("Size:" + stringList.size());
        System.out.println(stringList);
        stringList.add("Nieuwe ");
        stringList.add("test!");
        System.out.println(stringList);
        stringList.remove(4);
        System.out.println(stringList);
        stringList.add(4, "Nieuwe ");
        System.out.println(stringList);
        stringList.remove("test!"); // Removes first "test!"
        System.out.println(stringList);

        printListItems(stringList);

        System.out.println("---------LinkedList---------");
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast("Daniel");
        linkedList.addFirst("Marko");
        linkedList.add(1,"Polo");
        linkedList.add(2,"Test");

        System.out.println(linkedList);
        printListItems(linkedList);

        System.out.println("---------Collecting Primitive Values---------");
        List<Integer> intList = new ArrayList<>();
        intList.add(5);
        intList.add(4);

        // Unboxing is niet meer nodig -> autoboxing
        int y = intList.get(0).intValue() + intList.get(1).intValue();
        int z = intList.get(0) + intList.get(1);
        System.out.println("Unboxing: " + y);
        System.out.println("Auto-boxing: " + z);

        List<Number> numList = new ArrayList<>();
        numList.add(5);
        numList.add(4.5);

        // Voorbeeld uit cursus, maar werkt niet: 103_Presentation_70/103_Chap10_70 -> p21
         int t = (Integer) numList.get(0);

//        Number t = numList.get(0);
        System.out.println(t);

        System.out.println("---------xxxAll methods---------");
        List<String> listToAdd = new ArrayList<>();
        String s = "bla";
        listToAdd.add(s);
        listToAdd.add("test");
        listToAdd.add("iets");
        listToAdd.add("anders");

        List<String> listToRemove = new ArrayList<>();
        listToRemove.add(s);
        listToRemove.add("iets");

        List<String> allMethodsList = new ArrayList<>(listToAdd);
        System.out.println(allMethodsList);

        // Why not working
        allMethodsList.removeAll(listToRemove);
        System.out.println(allMethodsList);

    }

    public static void printListItems(List<String> list){
        for (String item : list ) {
            System.out.println(item);
        }
    }
}
