package employee;

//JavaBean Test
public class DepartmentManager {
    private int deptNo;
    private long empNo;
    private String fromDate;
    private String toDate;

    //Constructors
    public DepartmentManager () {}
    public DepartmentManager (int aDeptNo, long aEmpNo, String aFromDate, String aToDate){
        this.deptNo = aDeptNo;
        this.empNo = aEmpNo;
        this.fromDate = aFromDate;
        this.toDate = aToDate;
    }

    //getters and setters
    public int getDeptNo() {
        return this.deptNo;
    }

    public void setDeptNo(int aDeptNo) {
        this.deptNo = aDeptNo;
    }

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

    public String getToDate() {
        return this.toDate;
    }

    public void setToDate(String aToDate) {
        this.toDate = aToDate;
    }

}
