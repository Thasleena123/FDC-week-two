package week_two.day_four.src.linked_list;

public class ExecutableCustomLinkedList {
    public static void main(String[] args) {
        CustomLinkedListed<Integer> list = new CustomLinkedListed<>();
        list.add(7);
        list.add(2);
        list.add(8);
        list.add(1);
        list.add(4);

        System.out.println("Original List:");
        list.display();

        System.out.println("Sorting in Ascending Order:");
        list.sort((a, b) -> a - b);
       list.display();


        System.out.println("Sorting in Descending Order:");
        list.sort((a, b) -> b - a);
        list.display();
        System.out.println("\nStack Operations:");
        CustomStack<Integer> stack = new CustomStack<>(5,list);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top element (peek): " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack size: " + stack.size());


        System.out.println("\nQueue Operations:");
        CustomQueue<Integer> queue = new CustomQueue<>(5);
        queue.enqueue(100);
        queue.enqueue(200);
        queue.enqueue(300);
        System.out.println("Front element (peek): " + queue.peek());
        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Queue size: " + queue.size());
    }
}



