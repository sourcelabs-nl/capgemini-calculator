public class Calculator {

    public int multiply(int x, int y) {
        return x * y;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public int sum(int c, int d) {
        return c + d;
    }

    public int subtract(int first, int second) {
        return first + second;
    }

    public int maxValue(int[] values) {
        int max = 0;

        for (final int value : values) {
            if (max < value) {
                max = value;
            }
        }

        return max;
    }

    //TODO implement percentage calculation and test

    //TODO implement modulo operation and test
}
