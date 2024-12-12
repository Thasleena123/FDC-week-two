package week_two.day_four.src.linked_list;

public class CustomQueue<T> {

    private CustomLinkedListed<T> list;
    private int limit;

    public CustomQueue(int limit) {
        this.list = new CustomLinkedListed<>();
        this.limit = limit;
    }


    public void enqueue(T data) {
        if (list.size() >= limit) {
            throw new IllegalStateException("Queue limit exceeded.");
        }
        list.addTail(data);
    }


    public T dequeue() {
        if (list.size() == 0) {
            throw new IllegalStateException("Queue is empty.");
        }
        return list.removeHead();
    }


    public T peek() {
        if (list.size() == 0) {
            throw new IllegalStateException("Queue is empty.");
        }
        return list.getHead().getData();
    }


    public int size() {
        return list.size();
    }
}


