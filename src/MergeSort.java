public class MergeSort {
    // do descending
    public static void mergeSort(int[] array, int n) {
        if (n == 1)
            return;

        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++)
            l[i] = array[i];

        for (int i = mid; i < n; i++)
            r[i - mid] = array[i];

        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(array, l, r, mid, n - mid);
    }

    // {10, 4, -4, 19, 3, 1, -1}

    public static void merge(int[] a, int[] l, int[] r, int left, int right) {

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j])
                a[k++] = l[i++];
            else
                a[k++] = r[j++];
        }

        while (i < left)
            a[k++] = l[i++];

        while (j < right)
            a[k++] = r[j++];

    }

    public static void mergeSort2(int[] input, int start, int end) {
        if (end - start < 2)
            return;

        int mid = (end + start) / 2;
        mergeSort2(input, start, mid);
        mergeSort2(input, mid, end);
        merge2(input, start, mid, end);
    }

    public static void merge2(int[] input, int start, int mid, int end) {
        if (input[mid - 1] <= input[mid])
            return;

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);
    }
}
