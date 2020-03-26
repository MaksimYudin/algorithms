public class InsertSort {

    // do recursion
    public static void sort1() {

        int[] array = {10, 4, -4, 19, 3, 1, -1};

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {
            int newValue = array[firstUnsortedIndex];

            int i;
            for (i = firstUnsortedIndex; i > 0 && array[i - 1] > newValue; i--){
                array[i] = array[i - 1];
            }
            array[i] = newValue;
        }

        for (int i : array)
            System.out.println(i);

    }

    public static void sort2() {
        int[] array = {10, 4, -4, 19, 3, 1, -1};

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {
            int newValue = array[firstUnsortedIndex];
            int location = firstUnsortedIndex - 1;

            while (location >= 0 && array[location] > newValue) {
                array[location + 1] = array[location];
                location--;
            }
            array[location + 1] = newValue;
        }

        for (int i : array)
            System.out.println(i);

    }
}
