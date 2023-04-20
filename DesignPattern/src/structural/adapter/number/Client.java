package structural.adapter.number;

import java.util.Set;

public class Client {
    private CollectionOperation collectionOperations;

    public Client(CollectionOperation collectionOperations) {
        this.collectionOperations = collectionOperations;
    }

    public void printMaxValue(Set<Integer> numbers){
        int max = collectionOperations.findMax(numbers);
        System.out.println("Max value is: " + max);
    }
}