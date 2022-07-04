package arrays.sortings;

//User function Template for Java
public class QuickSort {
    void quickSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int p = partition(arr, low, high);
        quickSort(arr, low, p - 1);
        quickSort(arr, p + 1, high);
    }

    int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int leftP = low;
        int rightP = high;
        while (leftP < rightP) {
            while (arr[leftP] <= pivot && leftP < rightP) {
                leftP++;
            }
            while (arr[rightP] >= pivot && leftP < rightP) {
                rightP--;
            }
            swap(arr, leftP, rightP);
        }
        swap(arr, leftP, high);
        return leftP;
    }

    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {

        int[] numbers = { 35, 78, 35, 80, 89, 83, 39, 42, 81 };

        /*
         * for (int i = 0; i < numbers.length - 1; i++) { numbers[i] = new Random().nextInt(100); }
         */

        System.out.println("Before :");
        printArray(numbers);
        new QuickSort().quickSort(numbers, 0, numbers.length - 1);
        System.out.println("After :");
        printArray(numbers);

    }

    private static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            System.out.println(numbers[i]);
        }
    }

}