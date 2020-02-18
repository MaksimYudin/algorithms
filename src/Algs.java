import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Algs {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 8, 9, 11, 14, 16, 22, 28, 33, 44};
        BinarySearch bs = new BinarySearch();
        System.out.println(String.valueOf(bs.binarySerach(arr, 14)));
        System.out.println(String.valueOf(bs.binarySearchRecursive(arr, 14, 0, arr.length - 1)));
//        String str = "";
//        System.out.printf(String.valueOf(10));

//        int n = 50;
//        long[] mem = new long[n + 1];
//        Arrays.fill(mem, -1);
//
//        System.out.println(fibNaiveMem(n, mem));
//        //System.out.println(calcFibonachiRecursive(50));
//        System.out.println(fibFast(50));
    }

    // Вычисление числа фибоначчм
    private static long fibNaive(int n) {
        if (n <= 1)
            return n;

        return fibNaive(n - 1) + fibNaive(n - 2);
    }
    // 0, 1, 1, 2, 3, 5, 8, 13
    private static long fibFast(int n) {
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

    private static long fibNaiveMem(int n, long[] mem) {
        if (mem[n] != -1)
            return mem[n];

        if (n <= 1)
            return n;

        long value = fibNaiveMem(n - 1, mem) + fibNaiveMem(n - 2, mem);
        mem[n] = value;
        return value;
    }
}
