import java.util.*;
public class Main{

	public static void main(String[] args) {
		int n = 5;
		ArrayList<Double> alist = new ArrayList<>();
		alist.add(2.0);
		alist.add(4.0);
		alist.add(8.0);

		Sum s = (x,y) -> x+y; //Declaring a reference of the functional interface, using a lambda expression. This is not instantiation.
		
		AverageOfDoubles aod = (arrlist) -> {
			double sum = 0.0;
			for(Double d : arrlist){
				sum = sum + d;
			}
			return sum/arrlist.size();
		};

		Factorial fac = (number) ->{
			int i = number;
			while(i >= 2){
				number = number * (i-1);
				i--;
			}
			return number;
		};

		//System.out.print(s.sum(2.0,2.0)); //calling the lambda
		//System.out.println(aod.averageOfDoubles(alist));
		System.out.println(fac.factorial(n));



	}
}