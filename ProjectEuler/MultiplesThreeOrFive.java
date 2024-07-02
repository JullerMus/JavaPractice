import java.util.*;

/**
 * Problem: https://projecteuler.net/problem=1
 * Find the multiples of 3 or 5, in the interval [1;1000].
 * */

public class MultiplesThreeOrFive{

	ArrayList<Integer> listOfMultiples = new ArrayList<>();

	public void fetchMultiples(){
		for(int i = 3; i <= 1000; i++){
			if((i % 3) == 0 || (i % 5) == 0){
				listOfMultiples.add(i);
			}
		}
	}

	public int sumListOfMultiples(){
		int sum = 0;
		for (Integer i : listOfMultiples){
			sum = sum + i;
		}
		return sum;
	}
}