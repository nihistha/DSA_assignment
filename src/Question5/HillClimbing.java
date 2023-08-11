package Question5;

import java.util.Random;

public class HillClimbing {

    // Define the function to be optimized (you can replace this with your own function)
    public static double evaluate(double x) {
        return -x * x + 5 * x; // Example function: f(x) = -x^2 + 5x
    }

    // Hill Climbing algorithm
    public static double hillClimbing(double initialX, double stepSize, int maxIterations) {
        double currentX = initialX;
        double currentEval = evaluate(currentX);

        for (int i = 0; i < maxIterations; i++) {
            double newX = currentX + stepSize; // Move to a neighboring solution
            double newEval = evaluate(newX);

            if (newEval > currentEval) {
                currentX = newX;
                currentEval = newEval;
            } else {
                // If no improvement, break the loop
                break;
            }
        }

        return currentX;
    }

    public static void main(String[] args) {
        double initialX = 0.0; // Starting point
        double stepSize = 0.1; // Step size for moving to neighboring solutions
        int maxIterations = 100; // Maximum number of iterations

        double result = hillClimbing(initialX, stepSize, maxIterations);
        System.out.println("Optimal solution: x = " + result);
        System.out.println("Optimal value: f(x) = " + evaluate(result));
    }
}