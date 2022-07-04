package arrays;

public class FrequencyOfNum {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 2, 3, 3, 3, 3, 4, 5, 6, 6, 6, 6, 6, 6, 7, 8, 9, 9, 99, 100, 100 };
        int num = 7, count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num)
                count++;
        }
        System.out.println(num + " occurred " + count + " times");
    }

}
