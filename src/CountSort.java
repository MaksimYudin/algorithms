import java.util.Arrays;

public class CountSort {
    private static int[] countElements(int[] input, int k) {
        int[] c = new int[k + 1];
        Arrays.fill(c, 0);

        for (int i : input) {
            c[i] += 1;
        }

        for (int i = 1; i < c.length; i++) {
            c[i] += c[i - 1];
        }

        return c;
    }

    public static int[] sort(int[] input, int k) {
        int[] c = countElements(input, k);

        int[] sorted = new int[input.length];
        for (int i = input.length - 1; i >= 0; i--) {
            int current = input[i];
            sorted[c[current] - 1] = current;
            c[current] -= 1;
        }

        return sorted;
    }
}
