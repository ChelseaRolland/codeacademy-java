package bookLibrary;
//JavaBean Test

public class Author {
    private long id;
    private String firstName;
    private String lastName;

    //Constructor
    public Author(){}
    public Author(long aId, String aFirstName, String aLastName){
        this.id = aId;
        this.firstName = aFirstName;
        this.lastName = aLastName;
    }

    //getters and setters

    public long getId() {
        return this.id;
    }

    public void setId(long aId) {
        this.id = aId;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String aFirstName) {
        this.firstName = aFirstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String aLastName) {
        this.lastName = aLastName;
    }
}
