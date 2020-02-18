public class BinarySearch {
    public int binarySerach(int[] arr, int value) {
        int low = 0;
        int high = arr.length;

        while (low <= high) {
            int middle = low + (high - low) / 2;

            if (value > arr[middle])
                low = middle + 1;
            else if (value < arr[middle])
                high = middle - 1;
            else
                return middle;
        }
        return -1;
    }

    public int binarySearchRecursive(int[] arr, int value, int low, int high) {
        int middle = low + (high - low) / 2;

        if (low == high) {
            if (arr[low] == value)
                return low;
            else
                return -1;
        }

//        if (low == high &&
//            arr[low] != value)
//            return -1;

        if (value > arr[middle])
            low = middle + 1;
        else if (value < arr[middle])
            high = middle - 1;
        else
            low = high = middle;

        return binarySearchRecursive(arr, value, low, high);

    }
}
