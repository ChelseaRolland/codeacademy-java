package album;
//Java Bean Test

public class Album {
    private long id;
    private String artist;
    private String name;
    private String releaseDate;
    private String genre;
    private double sales;

    //Constructors
    public Album() {}

    public Album(long aId, String aArtist, String aName, String aReleaseDate, String aGenre, double aSale) {
        this.id = aId;
        this.artist = aArtist;
        this.name = aName;
        this.releaseDate = aReleaseDate;
        this.genre = aGenre;
        this.sales = aSale;
    }

    //getters & setters

    public long getId() {
        return this.id;
    }

    public void setId(long aId) {
        this.id = aId;
    }

    public String getArtist() {
        return this.artist;
    }

    public void setArtist(String aArtist) {
        this.artist = aArtist;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String aName) {
        this.name = aName;
    }

    public String getReleaseDate() {
        return this.releaseDate;
    }

    public void setReleaseDate(String aReleaseDate) {
        this.releaseDate = aReleaseDate;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String aGenre) {
        this.genre = aGenre;
    }

    public double getSales() {
        return this.sales;
    }

    public void setSales(double aSales) {
        this.sales = aSales;
    }
}
