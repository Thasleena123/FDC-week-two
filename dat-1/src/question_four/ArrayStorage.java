package question_four;

import java.util.ArrayList;

public class ArrayStorage<T> implements GenericInterface<T> {
    ArrayList<T> storage = new ArrayList<>();

    @Override
    public void add(T item) {
        storage.add(item);
    }

    @Override
    public T get(int index) {
        if (index >= 0 && index < storage.size()) {
            return storage.get(index);

        } else {
           throw new IndexOutOfBoundsException("index out of range");
        }

    }
}


