package question_two;


public class BankSystem {
    int accountNumber;
    String accountHoldername;
    double balance;

    public BankSystem(int accountNumber, String accountHoldername, double balance) {
        this.accountNumber = accountNumber;
        this.accountHoldername = accountHoldername;
        this.balance = balance;
    }

    public void depositeamount(double amount) throws  InvalidAmountException {
        if (amount < 0) {
            throw new InvalidAmountException("you have an -ve amount");
        } else {
            System.out.println("currentbalance=" + (balance + amount));

        }

    }
    public void withDraw(double  amount) throws InSufficientFundException{
        if(balance<amount){
            throw  new InSufficientFundException("you dont have enough balance");

        }else{
            System.out.println("current balance ="+(balance-amount));
        }
    }
    public void TransferFund(double amount ,BankSystem toAccount) throws InSufficientFundException, InvalidAmountException {
        if(balance<amount){
            throw  new InSufficientFundException("there is no enoughf money");


        }
        else{
            toAccount.depositeamount(amount);
        }
    }


}