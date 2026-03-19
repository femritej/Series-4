// This program prints a 5x5 multiplication table.

public class MultiplicationTable {
    public static void main(String[] args) {

        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                System.out.print((row * col) + "\t");
            }
            System.out.println();
        }
    }
}
