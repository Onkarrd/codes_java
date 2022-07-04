package recursion;

public class SumOfNums {
    public static void main(String[] args) {
        //System.out.println(doSum(10));
        System.out.println(doSum2(100));
    }

    private static int doSum2(int n) {
        if(n==0)
            return 0;
        return n + doSum2(n-1);
    }

    private static int doSum(int n) {
        int sum = 0;
        return sum(n, sum);
    }

    private static int sum (int n, int sum) {
        if(n <1)
            return sum;
        sum +=n;
        return sum(n-1,sum);
    }
}
