package language;

public class Language {
    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;

    //Constructor
    public Language(String aName, int aNumSpeakers, String aRegionSpoken, String aWordOrder){
        this.name = aName;
        this.numSpeakers = aNumSpeakers;
        this.regionsSpoken = aRegionSpoken;
        this.wordOrder = aWordOrder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumSpeakers() {
        return numSpeakers;
    }

    public void setNumSpeakers(int numSpeakers) {
        this.numSpeakers = numSpeakers;
    }

    public String getRegionsSpoken() {
        return regionsSpoken;
    }

    public void setRegionsSpoken(String regionsSpoken) {
        this.regionsSpoken = regionsSpoken;
    }

    public String getWordOrder() {
        return wordOrder;
    }

    public void setWordOrder(String wordOrder) {
        this.wordOrder = wordOrder;
    }
}
