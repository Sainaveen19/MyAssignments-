package week1.day2;

public class Factorial {

	public static void main(String[] args) {
		
		int num=5;
		int var=1;
		
		for(int i=1; i<=num; i++) {
			var=var*i;
		}
		
		System.out.println("Factorial Of The Given Number :" +var);
	}
	

}
