// This program counts from 1 to 5 using a while loop.

public class WhileBasic {
    public static void main(String[] args) {

        int count = 1; // start value

        while (count <= 5) { // loop runs while this is true
            System.out.println("Count: " + count);
            count++; // update step (VERY important!)
        }
    }
}
