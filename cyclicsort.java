import java.util.Arrays;

public class cyclicsort {

    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 7, 5, 6, 4};
        csort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void csort(int arr[]) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }

    static void swap(int arr[], int from, int to) {
        int temp = arr[from];
        arr[from] = arr[to];
        arr[to] = temp;
    }
}
