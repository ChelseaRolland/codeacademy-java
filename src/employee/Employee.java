package employee;

//JavaBean Test
public class Employee {
    private long id;
    private String birthDate;
    private String firstName;
    private String lastName;
    private char gender;
    private String hireDate;

    //Constructors
    public Employee() {}

    public Employee(long aId, String aBirthDate, String aFirstName, String aLastName, char aGender, String aHireDate) {
        this.id = aId;
        this.birthDate = aBirthDate;
        this.firstName = aFirstName;
        this.lastName = aLastName;
        this.gender = aGender;
        this.hireDate = aHireDate;
    }

    //getters & setters

    public long getId(){
        return this.id;
    }

    public void setId(long aId) {
        this.id = aId;
    }

    public String getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(String aBirthDate) {
        this.birthDate = aBirthDate;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public void setFirstName(String aFirstName) {
        this.firstName = aFirstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setLastName(String aLastName) {
        this.lastName = aLastName;
    }

    public char getGender(){
        return this.gender;
    }

    public void setGender(char aGender) {
        this.gender = aGender;
    }

    public String getHireDate(){
        return this.hireDate;
    }

    public void setHireDate(String aHireDate) {
        this.hireDate = aHireDate;
    }
}
