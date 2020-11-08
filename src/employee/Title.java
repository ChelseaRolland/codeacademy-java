package employee;

//JavaBean Test
public class Title {

    private long empNo;
    private String title;
    private String fromDate;
    private String toDate;

    //Constructors
    public Title () {}
    public Title (long aEmpNo, String aTitle, String aFromDate, String aToDate){
        this.empNo = aEmpNo;
        this.title = aTitle;
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

    public String getFromDate() {
        return this.fromDate;
    }

    public void setFromDate(String aFromDate) {
        this.fromDate = aFromDate;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String aTitle) {
        this.title = aTitle;
    }

    public String getToDate() {
        return this.toDate;
    }

    public void setToDate(String aToDate) {
        this.toDate = aToDate;
    }

}
