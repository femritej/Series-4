// Intended: print 1 to 5
// Actual: prints 1 to 4 (off-by-one error)

public class OffByOne {
    public static void main(String[] args) {

        for (int i = 1; i < 5; i++) { // BUG: should be <= 5
            System.out.println(i);
        }
    }
}
