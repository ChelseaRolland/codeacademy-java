package employee;

//JavaBean Test
public class DepartmentEmployee {
    private long empNo;
    private int deptNo;
    private String fromDate;
    private String toDate;

    //Constructors
    public DepartmentEmployee () {}
    public DepartmentEmployee (long aEmpNo, int aDeptNo, String aFromDate, String aToDate){
        this.empNo = aEmpNo;
        this.deptNo = aDeptNo;
        this.fromDate = aFromDate;
        this.toDate = aToDate;
    }

    //getters and setters
    public long getEmpNo() {
        return this.empNo;
    }

    public void setEmpNo(long aEmpNo) {
        this.empNo = aEmpNo;
    }

    public int getDeptNo() {
        return this.deptNo;
    }

    public void setDeptNo(int aDeptNo) {
        this.deptNo = aDeptNo;
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
