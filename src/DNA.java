public class DNA {
    public static void main(String[] args) {
        //DNA Sequencing

        //  -. .-.   .-. .-.   .
        //    \   \ /   \   \ /
        //   / \   \   / \   \
        //  ~   `-~ `-`   `-~ `-

        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";

        //String dna = dna1;
        //String dna = dna2;
        String dna = dna3;

        //System.out.println("dna1.length() = " + dna1.length());
        //System.out.println("dna2.length() = " + dna2.length());
        //System.out.println("dna3.length() = " + dna3.length());
        //System.out.println("dna.length() = " + dna.length());

        int dnaStart = dna.indexOf("ATG");
        int dnaStop =  dna.indexOf("TGA");


        //System.out.println("dna1.indexOf(\"ATG\") = " + dna1.indexOf("ATG"));
        //System.out.println("dna2.indexOf(\"ATG\") = " + dna2.indexOf("ATG"));
        //System.out.println("dna3.indexOf(\"ATG\") = " + dna3.indexOf("ATG"));

        //System.out.println("dna1.indexOf(\"TGA\") = " + dna1.indexOf("TGA"));
        //System.out.println("dna2.indexOf(\"TGA\") = " + dna2.indexOf("TGA"));
        //System.out.println("dna3.indexOf(\"TGA\") = " + dna3.indexOf("TGA"));

        if (dnaStart != -1 && dnaStop != -1 && (dnaStop - dnaStart) % 3 == 0) {
            String protein = dna.substring(dnaStart, dnaStop+3);
            System.out.println("protein = " + protein);
        } else {
            System.out.println("No protein");
        }
    }
}
