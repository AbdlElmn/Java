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

    // sum of n using rec.

    static int sumOfnum(int n) {
        if (n == 1)
            return 1;
        return (n + sumOfnum(n - 1));

    }

    static int facto(int n) {
        if (n == 1)
            return 1;
        return (n * facto(n - 1));

    }

    static int power(int n, int x) {
        if (x == 1)
            return n;
        if (x == 0)
            return 1;

        return (n * (power(n, x - 1)));
    }

    static double taylor(double x, int n) {
        if (n == 0)
            return 1;

        return (taylor(x, n - 1) + (Math.pow(x, n)) / (facto(n)));
    }

    static int fab(int n) {
        if (n == 1)
            return 1;
        if (n == 0)
            return 0;

        return (fab(n - 1) + fab(n - 2));
    }

    static void printFibTerms(int n) {
        printFibTermsRec(n, 0);
    }

    static void printFibTermsRec(int n, int i) {
        if (i == n)
            return;
        System.out.print(fab(i) + " ");
        printFibTermsRec(n, i + 1);
    }

    static int nCr(int n, int r) {
        if (r == 0 || r == n)
            return 1;

        return nCr(n - 1, r - 1) + nCr(n - 1, r);
    }

    public static void main(String[] args) {
        int x = 4;
        fun(x);
        int res = sum(5);
        System.out.println(res);

        System.out.println("Sum of a Natural Num using recursion");
        int sumRes = sumOfnum(15); // 15+14+13+.....+1
        System.out.println(sumRes);

        System.out.println("Facto of a Num using recursion");
        int factoRes = facto(5); // 5*4*3*2*1
        System.out.println(factoRes);

        System.out.println("Power of a Num using recursion");
        int pwrRes = power(5, 3);
        System.out.println(pwrRes);

        // taylor series
        System.out.println("taylor using recursion");
        double taylorRes = taylor(1, 3);
        System.out.println(taylorRes);

        System.out.println("Fabonacci using recursion");
        int n = 8;
        printFibTerms(n);

        System.out.println("");
        System.out.println("nCr using recursion");
        System.out.println(nCr(5, 3));
    }
}