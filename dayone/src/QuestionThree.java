import java.util.Scanner;

public class QuestionThree {

    static void printArray(int[] arr){
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static int[] insertIntoArray(int[] arr, int index, Scanner sc) throws ArithmeticException, ArrayIndexOutOfBoundsException {
        System.out.println("enter a number");
        int num1 = sc.nextInt();

        System.out.println("enter the seccond number");
        int num2 = sc.nextInt();
        try {
            arr[index] = num1 / num2;
            return insertIntoArray(arr, index + 1, sc);


        } catch (ArithmeticException ae) {
            System.out.println(ae.getMessage());
            return insertIntoArray(arr, index, sc);

        } catch (ArrayIndexOutOfBoundsException ai) {
            System.out.println(ai.getMessage());
            printArray(arr);
        }
        return arr;
    }
}