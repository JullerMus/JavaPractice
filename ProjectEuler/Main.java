import java.util.*;
public class Main{

	public static void main(String[] args) {
		MultiplesThreeOrFive mult = new MultiplesThreeOrFive();
		EvenFibonacciNumbers fibo = new EvenFibonacciNumbers();
		LargestPrimeFactor larg = new LargestPrimeFactor();
		LargestPalindromeProduct lp = new LargestPalindromeProduct();
		//mult.fetchMultiples();

		//larg.findPrime(600851475143.0); //Printer de primtal der går op i input.
		lp.fillPalindromeList();
	}
}