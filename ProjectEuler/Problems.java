/**
 * Collection of solved problems from projecteuler.com, startign with problem 6
 */
public class Problems{
    /**
     * Problem 6: Sum Square Difference
     * Find the difference between the sum of squares of the first one hundred natural numbers and the square sum.
     */
    public void sumSquareDifference(){
        int sumOfSquares = 0;
        int squareOfSums = 0;
        for(int i = 1; i <= 100; i++){
            sumOfSquares = sumOfSquares + i*i;
            squareOfSums = squareOfSums + i;
        }
        squareOfSums = squareOfSums * squareOfSums;
        System.out.println("Sum of squares = " + sumOfSquares);
        System.out.println("Square of sums = " + squareOfSums);
        System.out.println("Sum square difference = " + (squareOfSums - sumOfSquares));
    }
}