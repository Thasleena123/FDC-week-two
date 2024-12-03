package questions;

public class Box<T> {
    public T value;

    public Box(T value) {
        this.value = value;
    }


    public void setValue() {
        System.out.println(value);
    }

    public T getValue() {
        return value;

    }

    public void distplayType() {
        System.out.println("the type inside the class is" + value.getClass().getName());
    }

}
