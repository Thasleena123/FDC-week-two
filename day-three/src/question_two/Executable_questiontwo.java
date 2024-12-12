public class Executable_questiontwo {
    public static void main(String[] args) throws InvalidAmountException {
        BankSystem bankSystem1 = new BankSystem(2345, "thasleena", 67);
        BankSystem bankSystem2 = new BankSystem(456, "joel", 45);
        try {
            bankSystem1.depositeamount(-23);
        } catch (InvalidAmountException iae) {
            System.out.println(iae.getMessage());
        }
        try {
            bankSystem1.withDraw(567);
        } catch (InSufficientFundException isf) {
            System.out.println(isf.getMessage());
        }
        try {
            bankSystem1.TransferFund(45, bankSystem1);
        } catch (InSufficientFundException e) {
            System.out.println(e.getMessage());
        }
    }

}

