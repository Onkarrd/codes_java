package arrays.sortings;

public class Sorting012 {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 2, 0, 1, 2, 2, 1, 1, 0, 0, 0, 0, 1, 2 };
        sortArrayByCounting(arr);
        System.out.println("");
        sortArrayBySwapping(arr);
        System.out.println("");
        sortArrayBySwapping2(arr);
    }

    private static void sortArrayByCounting(int[] arr) {
        int output[] = new int[arr.length];
        int zero = 0, one = 0, two = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                zero++;
            else if (arr[i] == 1)
                one++;
            else
                two++;
        }
        for (int i = 0; i < zero; i++)
            output[i] = 0;
        for (int i = zero; i < zero + one; i++)
            output[i] = 1;
        for (int i = zero + one; i < arr.length; i++)
            output[i] = 2;

        for (int i = 0; i < output.length; i++)
            System.out.print(" " + output[i]);
    }

    private static void sortArrayBySwapping(int[] a) {
        int n = a.length;
        int i = 0;
        int two = n - 1;
        while (i <= two) {
            if (a[two] == 2)
                two--;
            else {
                if (a[i] == 2) {
                    a[i] = a[two];
                    a[two] = 2;
                    two--;
                    i++;
                } else {
                    i++;
                }
            }
        }
        i = 0;
        int one = two;
        while (i <= one) {
            if (a[one] == 1)
                one--;
            else {
                if (a[i] == 1) {
                    a[i] = a[one];
                    a[one] = 1;
                    one--;
                    i++;
                } else {
                    i++;
                }
            }
        }
        for (int idx = 0; idx < a.length; idx++)
            System.out.print(" " + a[idx]);
    }

    private static void sortArrayBySwapping2(int[] a) {
        int low = 0, mid = 0, high = a.length - 1;
        while (mid <= high) {
            if (a[mid] == 0) {
                swap(a, a[low], a[mid]);
                mid++;
                low++;
            } else if (a[mid] == 2) {
                swap(a, a[high], a[mid]);
                mid++;
                high--;
            } else {
                mid++;
            }
        }
        for (int idx = 0; idx < a.length; idx++)
            System.out.print(" " + a[idx]);
    }

    private static void swap(int[] a, int i, int i1) {
        int temp = a[i];
        a[i] = a[i1];
        a[i1] = temp;
    }
}
