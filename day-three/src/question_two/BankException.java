package question_two;

public class BankException extends Exception {
    public BankException(String message) {
        super(message);
    }
}
     class InvalidAmountException extends BankException {
         public InvalidAmountException(String message) {
             super(message);
         }
     }
        class InSufficientFundException extends BankException {
            public InSufficientFundException(String message) {
                super(message);
            }
        }


