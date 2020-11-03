import java.util.Arrays;

public class Classroom {

    public static void main(String[] args) {
        String[] students = {"Sade", "Alexus", "Sam", "Koma"};
        double[] mathScores = new double[4];
        //Sade's grade
        mathScores[0] = 94.5;
        //Sam's grade
        mathScores[2] = 76.8;

        //Printing out a statement with the arrays length
        System.out.println("The number of students in the class is " + students.length + ".");
    }
}
