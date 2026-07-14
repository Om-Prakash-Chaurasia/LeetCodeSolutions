class Solution {
    public double myPow(double x, int n) {
        if(n < 0) {
            x = 1 / x;
            n = -n;
        }

        return solve(x, n);
    }

    private double solve(double x, int n) {
        if(n == 0) return 1;

        double halfPow = solve(x, n/2);

        if(n%2 == 0) return halfPow * halfPow;
        else return halfPow * halfPow * x;
    }
}