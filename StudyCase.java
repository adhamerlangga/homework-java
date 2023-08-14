/**
 * Adham Erlangga Siwi
*/

public class StudyCase {
    public static void main(String[] args) {
        
        // Placeholder dari hasil 
        int multiplication = 1;
        String odd_or_even = "";
        
        // Loop sebanyak input argumen pada command line
        for (int i = 0; i < args.length; i++) {
            multiplication *= Integer.parseInt(args[i]);
        }

        // Pengecekan ganjil atau genap
        if (multiplication % 2 == 0) {
            odd_or_even = "Genap";
        }
        else if (multiplication % 2 != 0) {
            odd_or_even = "Ganjil";
        }

        System.out.println("output: \n" + multiplication + " - " + odd_or_even);
    }
}