public class Continents {

    private int continent;


     public Continents(int aContinentNumber){
         this.continent = aContinentNumber;
     }

     //getters
     public int getContinent(){
         return this.continent;
     }

     //setters
    public void setContinent(int aContinentNumber){
         this.continent = aContinentNumber;
    }

    //methods
    public void findLargestCityOnContinent(){
        switch(getContinent()){
            case 1:
                System.out.println("North America: Mexico City, Mexico");
                break;
            case 2:
                System.out.println("South America: Sao Paulo, Brazil");
                break;
            case 3:
                System.out.println("Europe: Moscow, Russia");
                break;
            case 4:
                System.out.println("Africa: Lagos, Nigeria");
                break;
            case 5:
                System.out.println("Asia: Shanghai, China");
                break;
            case 6:
                System.out.println("Australia: Sydney, Australia");
                break;
            case 7:
                System.out.println("Antarctica: McMurdo Station, US");
                break;
            default:
                System.out.println("Undefined Continent!");
                break;
        }
    }

    public static void main(String[] args) {
        System.out.println("Please enter a number between 1 - 7 to find the largest city on each continent");
        Continents city1 = new Continents(1);
        city1.findLargestCityOnContinent();
        city1.setContinent(2);
        city1.findLargestCityOnContinent();
        city1.setContinent(3);
        city1.findLargestCityOnContinent();
        city1.setContinent(4);
        city1.findLargestCityOnContinent();
        city1.setContinent(5);
        city1.findLargestCityOnContinent();
        city1.setContinent(6);
        city1.findLargestCityOnContinent();
        city1.setContinent(7);
        city1.findLargestCityOnContinent();
        city1.setContinent(8);
        city1.findLargestCityOnContinent();
        city1.setContinent(1);
        city1.findLargestCityOnContinent();


    }

}
