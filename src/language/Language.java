package language;

import java.util.ArrayList;

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

    public void getInfo(){
        System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + regionsSpoken + ".");
        System.out.println("The language that follows the word order: " + wordOrder);
    }

    public static void main(String[] args){
        Language icelandic = new Language("Icelandic", 1500000, "Iceland", "subject-verb-object");
        icelandic.getInfo();

        Mayan mayan = new Mayan("Ki'che'", 100000);
        mayan.getInfo();

        SinoTibetan chinese = new SinoTibetan("Chinese", 1000000);
        chinese.getInfo();
        SinoTibetan burmese = new SinoTibetan("Burmese", 12345678);
        burmese.getInfo();

        ArrayList<Language> languages = new ArrayList<Language>();
        languages.add(icelandic);
        languages.add(mayan);
        languages.add(chinese);
        languages.add(burmese);

        System.out.println("=============");

        for (Language lang : languages) {
            System.out.println("------------");
            lang.getInfo();
        }
    }

}
