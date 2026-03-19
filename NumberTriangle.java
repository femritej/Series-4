// This program prints a number triangle.

public class NumberTriangle {
    public static void main(String[] args) {

        for (int row = 1; row <= 5; row++) { // number of rows
            for (int col = 1; col <= row; col++) { // columns depend on row
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}

