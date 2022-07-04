package random;

public class Fibonacci {

    public int fib(int num) {
        int sum = 0;
        if (num == 0 || num == 1)
            return num;
        int f1 = 0;
        int f2 = 1;
        for (int i = 1; i < num; i++) {
            sum = f1 + f2;
            f1 = f2;
            f2 = sum;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new Fibonacci().fib(6));
    }
}
