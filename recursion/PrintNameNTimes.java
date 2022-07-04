package recursion;

public class PrintNameNTimes {
    public static void main(String[] args) {
       // printName(5);
        printTillN(10);
        //printFromN(10);
    }

    private static void printFromN(int n) {
        if(n<1)
            return;
        System.out.println(n);
        printFromN(n-1);
    }

    private static void printTillN(int n) {
        if(n<1)
            return;
        printTillN(n-1);
        System.out.println(n);
    }

    private static void printName(int i) {
        System.out.println("Aarti "+i);
        if(i==1)
            return;
        printName(--i);
    }
}
