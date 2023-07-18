class Solution {
    public int addDigits(int num) {

        int x = digsum(num); // 19

        while (x >= 10) {
            x = digsum(x); // 10 //1
        }
        return x;

    }

    public int digsum(int a) {
        int dsum = 0;
        int y = 0;
        while (a > 0) {
            y = a % 10;
            a /= 10;
            dsum += y;
        }
        return dsum;
    }
}