public class SavingsAccount {
    int balance;

    public SavingsAccount(int initialBalance){
        balance = initialBalance;
    }
    //methods
    public void checkBalance(){
        System.out.println("Hello!");
        System.out.println("Your balance is " + balance);
    }

    public void deposit(int amountToDeposit) {
        int newBalance = balance + amountToDeposit;
        balance = newBalance;
        System.out.println("You just deposited " + amountToDeposit);
    }

    public int withdraw(int amountToWithdraw){
        int newBalance = balance - amountToWithdraw;
        balance = newBalance;
        System.out.println("You just withdrew " + amountToWithdraw);
        return amountToWithdraw;
    }


    public static void main(String[] args){
        SavingsAccount savings = new SavingsAccount(2000);

        //Check balance:
        savings.checkBalance();
        //System.out.println("Hello!");
        //System.out.println("Your balance is "+savings.balance);

        //Withdrawing:
        savings.withdraw(300);
        //int afterWithdraw = savings.balance - 300;
        //savings.balance = afterWithdraw;
        //System.out.println("You just withdrew "+300);

        //Check balance:
        savings.checkBalance();
        //System.out.println("Hello!");
        //System.out.println("Your balance is "+savings.balance);

        //Deposit:
        savings.deposit(600);
        //int afterDeposit = savings.balance + 600;
        //savings.balance = afterDeposit;
        //System.out.println("You just deposited "+600);

        //Check balance:
        savings.checkBalance();
        //System.out.println("Hello!");
        //System.out.println("Your balance is "+savings.balance);

        //Deposit:
        savings.deposit(600);
        //int afterDeposit2 = savings.balance + 600;
        //savings.balance = afterDeposit2;
        //System.out.println("You just deposited "+600);

        //Check balance:
        savings.checkBalance();
        //System.out.println("Hello!");
        //System.out.println("Your balance is "+savings.balance);

    }
}
