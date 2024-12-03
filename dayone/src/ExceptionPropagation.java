import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionPropagation {

    public void deepest() {
        throw new InputMismatchException("My Exception");
    }
    public void middle() throws InputMismatchException{
        deepest();
    }
    public void topMost(){
        try {
            middle();
        }catch (InputMismatchException e){
            System.out.println("Handled in topMost");
            System.out.println(e.getMessage());
        }

    }


    }

