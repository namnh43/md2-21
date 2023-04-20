package structural.adapter.number;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(Arrays.asList(1,2,3,10,5,9,7));
        CollectionUtilAdapter adapter = new CollectionUtilAdapter();
        System.out.println(adapter.findMax(set));
    }
}
