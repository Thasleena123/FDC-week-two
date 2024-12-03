import java.util.Scanner;

public class SquareRoot {


    public void squareRoot() {
        double num;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        num = sc.nextInt();
        if (num < 0) {
            throw new IllegalArgumentException("square root on negative number is not possible");
        } else {
            double squreroot = Math.sqrt(num);
            System.out.println(squreroot);
        }


    }
}