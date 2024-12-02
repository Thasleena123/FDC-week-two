package question_exception1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionSample {

    public static void executeQuestion1() {

        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int result;
        System.out.println("enter two numbers");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        try {
            result = num1 / num2;
        } catch (ArithmeticException ex) {
            ex.printStackTrace();
        } finally {
            System.out.println("execution finished");
        }
    }

    public static void executeQuestion2() {
        String str = null;
        int[] numbers = {12, 1, 3, 4};
        String str1 = "abc";
        try {
            try {
                System.out.println(str.length());
            } catch (NullPointerException ex1) {
                ex1.printStackTrace();
            }
            try {
                System.out.println(numbers[5]);
            } catch (ArrayIndexOutOfBoundsException ae) {
                ae.printStackTrace();
            }
            try {
                int number = Integer.parseInt(str1);
            } catch (NumberFormatException ne) {
                ne.printStackTrace();
            }
            System.out.println(2 / 0);
        } catch (Exception e) {
            System.out.println("outer block is the generic exception handler");
        }
    }

    public static void executeQuestion3() {
        Scanner sc = new Scanner(System.in);
        int num3;
        int num4;
        int result;
        try {
            System.out.println("enter two numbers");
            num3 = sc.nextInt();
            num4 = sc.nextInt();
            result = num3 / num4;
        } catch (InputMismatchException im) {
            im.printStackTrace();

        } catch (ArithmeticException ae2) {
            ae2.printStackTrace();
        }
    }

    public static void excuteQuestion4() {

        String fileName = "otput.txt";
        String content = "This is a test message written to the file.";

        FileWriter writer = null;

        try {

            writer = new FileWriter(fileName);


            writer.write(content);

            System.out.println("Content written to file successfully.");

        } catch (IOException e) {

            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        } finally {

            if (writer != null) {
                try {
                    writer.close(); // Close the file writer
                    System.out.println("FileWriter closed successfully.");
                } catch (IOException e) {
                    System.out.println("Error closing the FileWriter.");
                    e.printStackTrace();
                }
            }
        }
    }
}





