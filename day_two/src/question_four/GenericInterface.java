package question_four;

import java.util.ArrayList;

public interface GenericInterface<T> {
    void add(T item);

    public T get(int index);
}

