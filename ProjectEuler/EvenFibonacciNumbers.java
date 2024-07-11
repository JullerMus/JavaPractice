import java.util.*;

/**
 * Problem: https://projecteuler.net/problem=2
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms. 
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 */

public class EvenFibonacciNumbers{
	/**
	 * Arraylist containing all numbers of fibonacci sequence less than 4 million
	 */
	ArrayList<Integer> fib = new ArrayList<>();
	/**
	 * Arraylist containing all even numbers of fibonacci sequence less than 4 million
	 */
	ArrayList<Integer> evenFib = new ArrayList<>();
	// Tests the upper bound of the addFibonacciNumbers() method.
	int limit;

	/**
	 * 
	 */
	public void addFibonacciNumbers(){
		int a = 1;
		int b = 1;
		
		while(limit <= 4000000){
			int c = a+b;
			a = b;
			b = c;
			//System.out.println(c);
			fib.add(c);
			limit = c;

		}
		System.out.println( "Size of fibonacci arraylist: " + fib.size());

	}

	public void fillEvenFib(){
		for(Integer i : fib){
			if(i % 2 == 0){
				evenFib.add(i);
			}
		}
		System.out.println("Size of evens fibanacci arraylist: " + evenFib.size());
	}


	public void sumEvenFib(){
		int evenSum = 0;
		for(Integer i : evenFib){
			evenSum = evenSum + i;
		}
		System.out.println("Sum of even Fibonacci numbers: " + evenSum);
	}

}