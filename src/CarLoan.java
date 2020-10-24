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
    public int getCarLoan(){
        return this.carLoan;
    }
    public int getLoanLength(){
        return this.loanLength;
    }
    public int getInterestRate(){
        return this.interestRate;
    }
    public int getDownPayment(){
        return this.downPayment;
    }

    //setters
    public void setCarLoan (int aCarLoan) {
        this.carLoan = aCarLoan;
    }
    public void setLoanLength (int aLoanLength) {
        this.loanLength = aLoanLength;
    }
    public void setInterestRate (int aInterestRate) {
        this.interestRate = aInterestRate;
    }
    public void setDownPayment (int aDownPayment) {
        this.downPayment = aDownPayment;
    }

    //methods
    public int remainingBalance(){
        return getCarLoan() - getDownPayment();
    }
    public int loanLengthToMonths(){
        return getLoanLength() * 12;
    }
    public double monthlyBalance(){
        return remainingBalance() / loanLengthToMonths();
    }
    public double monthlyInterest(){
        return (monthlyBalance() * getInterestRate()) / 100;
    }
    public double monthlyPayment(){
        return monthlyBalance() + monthlyInterest();
    }

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

        CarLoan corolla = new CarLoan(10000, 3, 5, 2000);
        System.out.println("corolla.remainingBalance() = " + corolla.remainingBalance());
        System.out.println("corolla.monthlyBalance() = " + corolla.monthlyBalance());
        System.out.println("corolla.monthlyInterest() = " + corolla.monthlyInterest());
        System.out.println("corolla.monthlyPayment() = " + corolla.monthlyPayment());

    }

}
