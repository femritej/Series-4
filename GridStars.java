// This program prints a 3x4 grid of stars.

public class GridStars {
    public static void main(String[] args) {

        for (int row = 1; row <= 3; row++) { // outer loop: rows
            for (int col = 1; col <= 4; col++) { // inner loop: columns
                System.out.print("*");
            }
            System.out.println(); // move to next line
        }
    }
}
