import java.util.ArrayList;
import java.util.List;

public class Algs {
    public static void main(String[] args) {
        //System.out.println(calcFibonachiRecursive(50));
        System.out.println(calcFibonachi(50));
    }

    // Вычисление числа фибоначчм
    private static long calcFibonachiRecursive(int n) {
        if (n <= 1)
            return n;

        return calcFibonachiRecursive(n - 1) + calcFibonachiRecursive(n - 2);
    }
    // 0, 1, 1, 2, 3, 5, 8, 13
    private static long calcFibonachi(int n) {
        List<Long> array = new ArrayList<>();

        array.add((long) 0);
        array.add((long) 1);

        long value = 0;
        for (int i = 2; i <= n; i++) {
            value = array.get(i - 1) + array.get(i - 2);
            array.add(value);
        }
        return array.get(n);
    }
}
