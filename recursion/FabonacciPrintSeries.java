package recursion;

public class FabonacciPrintSeries {
    public static void main(String[] args) {
        printFab(6);
    }

    private static int printFab(int i) {
        if(i<=1)
        {
            System.out.println(" "+i);
            return i;
        }
        int sum = printFab(i-1)+ printFab(i-2);
        System.out.println(" "+sum);
        return sum;
    }
}
