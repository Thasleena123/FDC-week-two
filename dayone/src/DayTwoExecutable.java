import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DayTwoExecutable {
    public static void executeQuestion1() {
        SquareRoot root = new SquareRoot();
        root.squareRoot();
    }

    public static void executeQuestion2() {
        ExceptionPropagation exceptionPropagation = new ExceptionPropagation();
        exceptionPropagation.topMost();
    }

    public static void executeQuestion3() {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];


        arr = QuestionThree.insertIntoArray(arr, 0, sc);


    }
    public static void executeQuestion4() {

        String filepath="out.txt";
       try{
             QuestionFour questionFour=new QuestionFour();
             questionFour.readfile(filepath);
         }catch (FileNotFoundException ae){
             ae.printStackTrace();
         }

    }
}