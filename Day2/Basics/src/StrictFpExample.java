strictfp class StrictFpExample {
    strictfp double calculate(double a, double b) {
        double sum = a + b;
        return sum; // Consistent output across platforms
    }
}