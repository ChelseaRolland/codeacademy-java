package language;

public class Mayan extends Language {
    Mayan(String languageName, int speakers){
        super(languageName, speakers, "Central America", "verb-object-subject");
    }

  @Override
  public void getInfo(){
      System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + regionsSpoken + ".");
      System.out.println("The language that follows the word order: " + wordOrder);
      System.out.println("Fun Fact: Ki'che' is an ergative language.");
  }

}
