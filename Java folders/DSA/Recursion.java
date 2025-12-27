public class Recursion {

    static void fun(int n) {
        if (n > 0) {
            System.out.println(n);
            fun(n - 1);
        }
    }

    static int sum(int x) {
        if (x > 0) {
            return sum(x - 1) + x;
        }
        return 0;
    }

    public static void main(String[] args) {
        int x = 4;
        fun(x);
        int res = sum(5);
        System.out.println(res);
    }
}