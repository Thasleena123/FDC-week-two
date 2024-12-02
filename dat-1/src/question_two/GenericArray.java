package question_two;

public class GenericArray {
    public <T> void printArry(T[]array){
        for(T arrayElements: array){
            System.out.println(arrayElements);
        }
    }
}
