package employee;

//JavaBean Test
public class Salary {
    private long empNo;
    private String fromDate;
    private int salary;
    private String toDate;

    //Constructors
    public Salary () {}
    public Salary (long aEmpNo, String aFromDate, int aSalary, String aToDate){
        this.empNo = aEmpNo;
        this.fromDate = aFromDate;
        this.salary = aSalary;
        this.toDate = aToDate;
    }

    //getters & setters

    public long getEmpNo() {
        return this.empNo;
    }

    public void setEmpNo(long aEmpNo) {
        this.empNo = aEmpNo;
    }

    public String getFromDate() {
        return this.fromDate;
    }

    public void setFromDate(String aFromDate) {
        this.fromDate = aFromDate;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int aSalary) {
        this.salary = aSalary;
    }

    public String getToDate() {
        return this.toDate;
    }

    public void setToDate(String aToDate) {
        this.toDate = aToDate;
    }
}
