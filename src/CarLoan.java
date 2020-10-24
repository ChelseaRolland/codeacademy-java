public class CarLoan {
    private int carLoan;
    private int loanLength;
    private int interestRate;
    private int downPayment;

    public CarLoan(int aCarLoan, int aLoanLength, int aInterestRate, int aDownPayment) {
        if (aLoanLength <= 0 || aInterestRate <= 0){
            System.out.println("Error! You must take out a valid loan");
        } else if (aCarLoan <= aDownPayment) {
            System.out.println("The car can be paid in full.");
        } else {
            int aRemainingBalance = aCarLoan - aDownPayment;
            int loanLengthInMonths = aLoanLength * 12;
            double aMonthlyBalance = aRemainingBalance / loanLengthInMonths;
            double aMonthlyInterest = (aMonthlyBalance * aInterestRate) / 100;
            double aMonthlyPayment = aMonthlyBalance + aMonthlyInterest;

            System.out.println(aMonthlyPayment);
        }
        this.carLoan = aCarLoan;
        this.loanLength = aLoanLength;
        this.interestRate = aInterestRate;
        this.downPayment = aDownPayment;
    }

    //getters

    //setters

    //methods



    public static void main(String[] args) {
        //initial info about carInfo
        //initializing the car loan fields
        int carLoan = 10000;
        int loanLength = 3;
        int interestRate = 5;
        int downPayment = 2000;

        //Conditional Statement to make sure the load information is valid
        if (loanLength <= 0 || interestRate <= 0) {
            System.out.println("Error! You must take out a valid car loan.");
        } else if(carLoan <= downPayment) {
            System.out.println("The car can be paid in full.");
        }
        //If all of the information is verified, then generate the monthly payment
        else {
            //Calculate the monthly payment
            int remainingBalance = carLoan - downPayment;
            int months = loanLength * 12;
            int monthlyBalance = remainingBalance / months;
            int interest = (monthlyBalance * interestRate) / 100;
            int monthlyPayment = monthlyBalance + interest;

            System.out.println(monthlyPayment);
        }
    }

}
