class Solution {
    public int climbStairs(int n) { // n=2
        int num = 0;
        int a = 1, b = 1;
        for (int i = 0; i < n - 1; i++) {
            num = a; // num=1
            a = a + b; // a=2
            b = num; // b=1

        }
        return a;
    }
}