public class BubbleSort {

    public static void sort() {

        int[] array = {10, 15, -2, 7, 35, -4, 22};
        // 1
        for (int i = 0; i < array.length; i++) {
            for (int j = (i + 1); j < array.length; j++) {
                if (array[i] > array[j])
                    shift(array, i, j);
            }
        }

        // 1.1
        // {10, 15, -2, 7, 35, -4, 22}
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (array[i] > array[i + 1])
                    shift(array, i, i + 1);
            }
        }

//        for (int i: array) {
//            System.out.println(i);
//        }

        int[] array2 = {10, 15, -2, 7, 35, -4, 22};
        // 2
        int lastIndex = array2.length - 1;
        for (int i = 0; i < array2.length; i++) {
            int max = array2[0];
            int maxIndex = 0;
            for (int j = 0; j < lastIndex; j++) {
                if (array2[maxIndex] < array2[j]) {
                    //max = array2[j];
                    maxIndex = j;
                }
            }
            shift(array2, maxIndex, lastIndex--);
        }

        // 2.2
        int[] array3 = {10, 15, -2, 7, 35, -4, 22};
        for (int lastUnsortedIndex = array3.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            int maxIndex = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (array3[i] > array3[maxIndex])
                    maxIndex = i;
            }
            shift(array3, lastUnsortedIndex, maxIndex);
        }

        for (int i: array3) {
            System.out.println(i);
        }

    }

    private static void shift(int[] array, int i, int j) {

        if (i == j)
            return;

        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
