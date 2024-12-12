package week_two.day_four.src.linked_list;

import java.util.Comparator;


public class CustomLinkedListed<T> {

    NodeDemo head;
    NodeDemo<T> tail;

    public void setSize(int size) {
        this.size = size;
    }

    private int size = 0;

    public int getSize() {
        return size;
    }

    public void add(T data) {
        NodeDemo newNode = new NodeDemo(data);


        if (head == null) {
            head = newNode;
        } else {
            NodeDemo current = head;
            while (current.next != null) {
                current = current.next;

            }
            current.next = newNode;
        }
    }

    public void insert(int index, T data) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("invalis index");
        }
        NodeDemo newNode = new NodeDemo(data);
        if (index == 0) {
            newNode.next = head;
            head = newNode;

        }


        NodeDemo current = head;
        int currentIndex = 0;
        while (current != null && currentIndex < index - 1) {
            current = current.next;
            currentIndex++;
        }
        if (current == null) {
            throw new IndexOutOfBoundsException("invalid index");
        }
        newNode.next = current.next;
        current.next = newNode;
    }


    public void delete(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("invalis index");
        }

        if (index == 0) {
            head = head.next;

        }


        NodeDemo current = head;
        int currentIndex = 0;
        while (current != null && currentIndex < index - 1) {
            current = current.next;
            currentIndex++;
        }
        if (current == null || current.next == null) {
            throw new IndexOutOfBoundsException("invalid index");
        }

        current.next = current.next.next;
    }

    public void deleteRange(int start, int end) {

        if (start < 0 || end < 0 || start > end) {
            throw new IndexOutOfBoundsException("Invalid index range");
        }


        NodeDemo current = head;
        int index = 0;


        while (current != null && index < start - 1) {
            current = current.next;
            index++;
        }


        if (current == null || current.next == null) {
            throw new IndexOutOfBoundsException("Invalid start index or end index");
        }


        NodeDemo temp = current.next;
        int deleteIndex = start;
        while (temp != null && deleteIndex <= end) {
            temp = temp.next;
            deleteIndex++;
        }


        current.next = temp;
    }

    public void removeAll(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index cannot be negative");
        }

        NodeDemo current = head;
        int currentIndex = 0;


        while (current != null && currentIndex < index) {
            current = current.next;
            currentIndex++;
        }


        if (current == null) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        current.next = null;
    }

    public void removeAllInstances(T data) {
        if (head == null) {
            return;
        }


        while (head != null && head.getData() == data) {
            head = head.next;
        }

        NodeDemo current = head;
        while (current != null && current.next != null) {
            if (current.next.getData() == data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

    }

    public void getValueAtIndex(int index) {

        if (index < 0) {
            throw new IndexOutOfBoundsException("Index cannot be negative");
        }

        NodeDemo current = head;
        int currentIndex = 0;

        while (current != null) {
            if (currentIndex == index) {

                System.out.println(current.getData());
            }
            current = current.next;
            currentIndex++;
        }


        throw new IndexOutOfBoundsException("Index exceeds list size");
    }

    public void display() {
        NodeDemo current = head;
        while (current != null) {
            System.out.print(current.getData() + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }


    public NodeDemo<T> getHead() {
        return head;
    }


    public NodeDemo<T> getTail() {
        return tail;
    }

    public void addTail(T data) {
        NodeDemo<T> newNode = new NodeDemo<>(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }


    public T removeHead() {
        if (head == null) {
            throw new IllegalStateException("List is empty.");
        }
        T data = (T) head.getData();
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return data;
    }


    public void addHead(T data) {
        NodeDemo<T> newNode = new NodeDemo<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }


    public T removeHeadForStack() {
        if (head == null) {
            throw new IllegalStateException("List is empty.");
        }
        T data = (T) head.getData();
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return data;
    }

    public int size() {
        return size;
    }

    public boolean contains(T value) {
        NodeDemo current = head;
        while (current != null) {
            if (current.getData().equals(value)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public boolean containsAll(T... values) {
        if (values.length == 0) {
            return false;
        }

        for (T value : values) {
            if (!contains(value)) {
                return false;
            }
        }
        return true;
    }

    public void clear() {
        head = null;
    }


    public NodeDemo mergeSort(NodeDemo head, Comparator<T> comparator) {
        if (head == null || head.next == null) {
            return head;
        }

        NodeDemo middle = getMiddle(head);
        System.out.println("Splitting at middle: " + middle.getData());

        NodeDemo nextToMiddle = middle.next;
        middle.next = null;

        NodeDemo left = mergeSort(head, comparator);
        NodeDemo right = mergeSort(nextToMiddle, comparator);


        return merge(left, right, comparator);
    }

    public void sort(Comparator<T> comparator) {
        if (head == null || head.next == null) {
            return;
        }
        head = mergeSort(head, comparator);
    }

    public NodeDemo getMiddle(NodeDemo head) {
        if (head == null || head.next == null) {
            return head;
        }

        NodeDemo slow = head;
        NodeDemo fast = head;

        while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public NodeDemo merge(NodeDemo left, NodeDemo right, Comparator<T> comparator) {
        NodeDemo dummy = new NodeDemo(null);
        NodeDemo current = dummy;

        while (left != null && right != null) {
            if (comparator.compare((T) left.getData(), (T) right.getData()) <= 0) {
                current.next = left;
                left = left.next;
            } else {
                current.next = right;
                right = right.next;
            }
            current = current.next;
        }

        if (left != null) {
            current.next = left;
        } else if (right != null) {
            current.next = right;
        }

        return dummy.next;
    }
}