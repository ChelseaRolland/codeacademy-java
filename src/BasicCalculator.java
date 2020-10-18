public class BasicCalculator {
    //This is a basic arithmetic calculator, that adds, subtracts, multiplies, divides, and finds the modulus

    //Constructor
    public BasicCalculator () {}

    //methods

    //add
    public int add (int num1, int num2) {
        return num1 + num2;
    }

    //subtract
    public int subtract (int num1, int num2) {
        return num1 - num2;
    }

    //multiply
    public int multiply (int num1, int num2) {
        return num1 * num2;
    }

    //divide
    public double divide (double num1, double num2) {
        return num1 / num2;
    }

    //modulus
    public int modulo (int num1, int num2) {
        return num1 % num2;
    }

    public static void main(String [] args) {
        BasicCalculator myCalculator = new BasicCalculator();
        System.out.println("myCalculator.add(5,7) = " + myCalculator.add(5, 7));
        System.out.println("myCalculator.subtract(45,11) = " + myCalculator.subtract(45, 11));
        System.out.println("myCalculator.multiply(10,5) = " + myCalculator.multiply(10, 5));
        System.out.println("myCalculator.divide(100,20) = " + myCalculator.divide(100, 20));
        System.out.println("myCalculator.modulo(10,2) = " + myCalculator.modulo(10, 2));
    }

}
