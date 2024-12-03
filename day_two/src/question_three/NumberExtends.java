package question_three;

public class NumberExtends {

    public <T extends Number> boolean compare(T numOne,T numTwo){
        return numOne.getClass().equals(numTwo.getClass());
    }
}
