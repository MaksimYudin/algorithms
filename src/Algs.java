import java.util.*;

public class Algs {
    public static void main(String[] args) {

        //myAbstractClass.staticMsg();
        MyClass myClass = new MyClass();
        myClass.msgNonAbstract();



//        extendsNonStaticTest();
//        extendsStaticTest();

        //BubbleSort.sort();
        //InsertSort.sort2();
        //ShellSort.sort();

        int[] array = {10, 4, -4, 19, 3, 1, -1, 8};
        //MergeSort.mergeSort(array, array.length);
        //MergeSort.mergeSort2(array, 0, array.length);
        //QuickSort.quickSort(array, 0, array.length - 1);
//        for (int i = 0; i < array.length; i++)
//            System.out.println(array[i]);

//        int k = 5;
//        int[] input = { 4, 3, 2, 5, 4, 3, 5, 1, 0, 2, 5 };
//        int[] c = CountSort.sort(input, k);
//        for (int i = 0; i < c.length; i++)
//            System.out.println(c[i]);

//        StringExamples se = new StringExamples();
//        System.out.println(se.reverseRecursive("javax"));
//        System.out.println(se.revers1("javax"));
//        System.out.println(se.revers2("javax"));
//        System.out.println(se.revers3("javax"));

//        int[] arr = {1, 2, 4, 6, 8, 9, 11, 14, 16, 22, 28, 33, 44};
//        BinarySearch bs = new BinarySearch();
//        System.out.println(String.valueOf(bs.binarySerach(arr, 14)));
//        System.out.println(String.valueOf(bs.binarySearchRecursive(arr, 14, 0, arr.length - 1)));

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

    public static void extendsStaticTest() {
        System.out.println("static");
        Test2 t2 = new Test2();
        t2.msgShow();

        Test1 t3 = t2;
        t3.msgShow();

        Test1 t4 = new Test2();
        t4.msgShow();

        Test1 t1 = new Test1();
        t1.msgShow();
    }

    public static void extendsNonStaticTest() {
        System.out.println("non static");
        Test2 t2 = new Test2();
        t2.msgShowNonStatic();

        Test1 t1 = new Test1();
        t1.msgShowNonStatic();

        Test1 t3 = t2;
        t3.msgShowNonStatic();
    }
}

class Test1 {
    public static String str = "test1 field";
    public static void msgShow() {
        System.out.println("Test1 static");
    }

    public void msgShowNonStatic() {
        System.out.println("Test1 non static");
    }
}

class Test2 extends Test1 {
    public static String str = "test2 field";
    public static void msgShow() {
        System.out.println("Test2 static");
        //super.msgShow();
    }

    public void msgShowNonStatic() {
        System.out.println("Test2 non static");
        //super.msgShow();
    }
}

abstract class MyAbstractClass {
    abstract void msg();
    static void staticMsg() {
        System.out.println("into abstract class");
    }

    void msgNonAbstract() {
        System.out.println("non static non abstract");
    }
}

class MyClass extends MyAbstractClass {

    @Override
    void msg() {
        System.out.println("ddd");
    }

    public static void staticMsg() {
        System.out.println("into myClass");
    }
}
