package PolynomialEvaluation;

public class PolynomialEvaluation {
    /**
     * Evaluate a polynomial in the form of a1x^n+a2x^n-1...+ax^0
     * 
     * @param coeffs An array of the coefficients in order from greatest power to
     *               least power (a1,a2,a3), including 0's for missing degrees.
     * @param x      The value of x to solve for.
     * @return The result when the specified x is plugged into the equation.
     */
    public static double evaluate(double[] coeffs, double x) {
        double result = coeffs[coeffs.length - 1] + coeffs[coeffs.length - 2] * x;
        double xPower = x;
        for (int i = 2; i < coeffs.length; i++) {
            xPower *= x;
            result += coeffs[coeffs.length - 1 - i] * xPower;
        }
        return result;
    }

    /**
     * Evaluate a polynomial in the form of a1x^n+a2x^n-1...+ax^0
     * 
     * @param coeffs An array of the coefficients in order from greatest power to
     *               least power (a1,a2,a3), including 0's for missing degrees.
     * @param x      The value of x to solve for.
     * @return The result when the specified x is plugged into the equation.
     */
    public static double hornersMethod(double[] coeffs, double x) {
        double result = coeffs[0];
        for (int i = coeffs.length - 2; i >= 0; i--) {
            result *= x;
            result += coeffs[coeffs.length - 1 - i];
        }
        return result;
    }

    /**
     * Evaluate a polynomial in the form of a1x^n+a2x^n-1...+ax^0.  The highest degree must be one less than a power of two.
     * @param coeffs An array of the coefficients in order from greatest power to least power (a1,a2,a3), including 0's for missing degrees.
     * @param x The value of x to solve for.
     * @return The result when the specified x is plugged into the equation.
     */
    public static double preProcessedCoeffs(double[] coeffs, double x){
        double k = Math.log(coeffs.length)/Math.log(2);
        double j = Math.pow(2,k-1);
        double b = coeffs[(int) (j)] - 1;
        System.out.println("x^" + j + " + " + b);
        double[] divisor = new double[(int) (coeffs.length-j+1)];
        divisor[0] = 1;
        divisor[divisor.length-1] = b;
        double[] quotient = new double[(int) (coeffs.length-j)];
        
        
        System.out.println("a");
        return b;
    }

}