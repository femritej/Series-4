// This program has an infinite loop (on purpose).

public class InfiniteLoopBug {
    public static void main(String[] args) {

        int count = 1;

        while (count <= 5) {
            System.out.println(count);
            // BUG: missing count++
        }
    }
}
