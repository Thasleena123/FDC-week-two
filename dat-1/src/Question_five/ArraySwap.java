package Question_five;

public class ArraySwap{

    public static <T> void swap(T[] array, int index1, int index2) {

        if (index1 < 0 || index2 < 0 || index1 >= array.length || index2 >= array.length) {
            System.out.println("Index out of bounds");
            return;
        }


        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}






