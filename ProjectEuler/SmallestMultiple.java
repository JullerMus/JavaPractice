/**
 *https://projecteuler.net/problem=5
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisble by all the numbers from 1 to 20?
 * Answer: 232792560
 */
public class SmallestMultiple {
    /**
     * Finds the smallest integer, according to the problem
     * @param n the upper limit of the divisble interval
     * @return The smallest number divisble by all numbers in the interval 1 to n
     */
    public int findSmallestMultiple(int n) {
        // The lower bound of the divisble interval
        int limit = 1;
        // THe smallest integer to be returned
        int smallestNumber = 1;
        // Returns smallest integere if counter equals 20
        int counter = 0;
        while(limit <= n){
            if(smallestNumber % limit == 0){
                counter++;
                limit++;
                if(counter == n){
                    System.out.println(smallestNumber);
                    return smallestNumber;
                }
            }
            else{
                smallestNumber++;
                limit = 1;
                counter = 1;
            }
        }
        return smallestNumber;
    }
}