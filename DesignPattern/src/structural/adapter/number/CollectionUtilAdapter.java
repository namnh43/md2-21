package structural.adapter.number;

import com.codegym.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CollectionUtilAdapter implements CollectionOperation{
    CollectionUtils collectionUtils;

    public CollectionUtilAdapter() {
        this.collectionUtils = new CollectionUtils();
    }

    @Override
    public int findMax(Set<Integer> numbers) {
        List<Integer> lst = new ArrayList<>(numbers);
        return collectionUtils.findMax(lst);
    }
}
