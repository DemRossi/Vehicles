package Algorithms;

import javax.swing.plaf.basic.BasicLookAndFeel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Numbers {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1,2,3,4,5,6,7,8,9);
        printList("Start", numbers);

        Collections.reverse(numbers);
        printList("Reverse", numbers);

        Collections.shuffle(numbers);
        printList("Shuffle", numbers);

        Collections.swap(numbers, 7, 2 );
        printList("Swap", numbers);

        System.out.println("Minimum : " +  Collections.min(numbers));

        System.out.println("Maximum : " +  Collections.max(numbers));

        Collections.sort(numbers);
        printList("Sort", numbers);

        numbers.addAll(Collections.nCopies(3,3));
        printList("Expanded", numbers);

        System.out.println("Frequency of 3 : " +  Collections.frequency(numbers, 3));

        Collections.replaceAll(numbers, 3, 9);
        printList("Replaced", numbers);

        System.out.println("Frequency of 3 : " +  Collections.frequency(numbers, 3));
        System.out.println("Frequency of 9 : " +  Collections.frequency(numbers, 9));

        Collections.sort(numbers, Collections.reverseOrder());
        printList("Descending", numbers);

        System.out.printf("%s : %s%n", "Position of 4", Collections.binarySearch(numbers, 4) );
    }

    private static  void printList(String algorithmName, List<Integer> numbers){
        System.out.printf("%s : %s%n", algorithmName, numbers );
    }

}
