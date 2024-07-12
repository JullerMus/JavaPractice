/**
 * Problem: https://projecteuler.net/problem=3
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143
 */

public class LargestPrimeFactor {
    /**
     * Prints the prime numbers that are divisible by the input n.
     * @param n the input to be tested for divisible primes.
     */
    public void findPrime(double n) {
        int p = 2;
        do {
            if(n % p == 0) {
                System.out.println(p);
                n = n/p;
            }
            else{
                p++;
            }
        }
        while (n>=p*p);
        System.out.println((int)n);
    }
}