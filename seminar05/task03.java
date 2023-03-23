import java.util.Arrays;

// 3*. Реализовать алгоритм пирамидальной сортировки (HeapSort).
public class task03 {
    public static void main(String[] args) {
        int[] array = new int[]{12, 34, 73, 45, 49, 87, 92, 6, 14, 78, 22, 9, 62, 90, 17};
        heapSort(array);
        System.out.println(Arrays.toString(array));


    }

    static public void heapSort(int[] arr) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            getTree(arr, i, n);

        }
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;

            getTree(arr, 0, i);
        }


    }

    private static void getTree(int[] col, int i, int len) {
        int left = i * 2 + 1;
        int right = i * 2 + 2;
        int largest = i;

        if ((left < len) && (col[left] > col[largest])) {
            largest = left;
        }

        if ((right < len) && (col[right] > col[largest])) {
            largest = right;
        }

        if (i != largest) {
            int temp = col[i];
            col[i] = col[largest];
            col[largest] = temp;
        }

        getTree(col, largest, len);

    }
}
