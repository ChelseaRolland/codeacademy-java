package language;

public class SinoTibetan extends Language{
    public SinoTibetan(String languageName, int numSpeakers){
        super(languageName, numSpeakers,"Asia", "subject-object-verb");
        if (this.name.equalsIgnoreCase("Chinese") || this.name.contains("Chinese")){
            this.wordOrder = "subject-verb-object";
        }
    }
}
