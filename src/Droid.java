public class Droid {
    //Instance Fields -->Properties
    private String name;
    private int batteryLevel;

    //Methods --> Functions/Behavior
    public void performTask (String task) {
        System.out.println("Current battery levels are: " + energyReport() + "%");
        System.out.println(getName() + " is performing task: " + task);
        this.batteryLevel = energyTransfer();
        //this.batteryLevel = energyReport() - 10;
        System.out.println("Battery Levels are " + this.batteryLevel + "%");
        //System.out.println("Battery Levels are " + energyTransfer() + "%");

    }

    public String getName(){
        return this.name;
    }

//    public int getBatteryLevel () {
//        return this.batteryLevel;
//    }

    public int energyReport () {
        return this.batteryLevel;
    }

    public int energyTransfer () {
        return energyReport() - 10;
    }

    public String toString() {
        return "Hello, I'm the droid: " + getName();
    }

    //Constructor
    public Droid (String droidName) {
        this.name = droidName;
        this.batteryLevel = 100;
    }

    public static void main(String [] args) {
        Droid codey = new Droid("Codey");

        System.out.println(codey);
        codey.toString();
        codey.performTask("dancing");
        codey.performTask("reading");
        codey.performTask("singing");
    }


}
