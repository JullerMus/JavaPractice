import java.util.*;
public class Main{

	public static void main(String[] args) {
		MultiplesThreeOrFive mult = new MultiplesThreeOrFive();
		EvenFibonacciNumbers fibo = new EvenFibonacciNumbers();

		//mult.fetchMultiples();

		//System.out.println(mult.sumListOfMultiples());
		fibo.addFibonacciNumbers();
		fibo.fillEvenFib();
		System.out.println(fibo.sumEvenFib());


	}
}