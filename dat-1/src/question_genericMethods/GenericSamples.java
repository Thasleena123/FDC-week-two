package question_genericMethods;

import Question_five.ArraySwap;
import question_four.ArrayStorage;
import question_one.Box;
import question_three.NumberExtends;
import question_two.GenericArray;

import java.util.ArrayList;

public class GenericSamples {
    public static void executeQuestion1() {
        Box<Integer> intBox = new Box<>(10);
        Box<String> strBox = new Box<>("Hello");
        System.out.println(intBox.getValue());
        intBox.distplayType();
        intBox.setValue();
    }

    public static void executeQuestion2() {
        GenericArray genericArray = new GenericArray();
        Integer[] intarray = {1, 2, 3, 4, 5};
        System.out.println("integer array");
        genericArray.printArry(intarray);

        String[] strarry = {"riya", "manu", "jerry", "sam"};
        System.out.println("string array");
        genericArray.printArry(strarry);
    }

    public static void executableQuestion3() {
        NumberExtends numberExtends = new NumberExtends();
        Integer num1 = 0;
        Integer num2 = 9;

        boolean result = numberExtends.compare(num1, num2);
        System.out.println(result);
    }

    public static void executableQuestion4() {
        ArrayStorage arrayStorage = new ArrayStorage();
        ArrayList<Integer> intarray = new ArrayList<Integer>();
        intarray.add(122);
        intarray.add(23);
        intarray.add(234);
        arrayStorage.add(intarray);

        System.out.println("integer array");

        System.out.println("Item at index 0: " + intarray.get(0));
        System.out.println("Item at index 1: " + intarray.get(1));
        System.out.println("Item at index 2: " + intarray.get(2));

    }
    public static void executableQuestion5() {


        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Before swap:");
        for (int num : intArray) {
            System.out.print(num + " ");
        }


        ArraySwap.swap(intArray, 1, 3);

        System.out.println("\nAfter swap:");
        for (int num : intArray) {
            System.out.print(num + " ");
        }

    }
}
