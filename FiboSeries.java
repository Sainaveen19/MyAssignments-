package week1.day2;

public class FiboSeries {

	public static void main(String[] args) {
		int range=8, firstNum=0, secNum=1;
		System.out.println("Fibo Series :" +firstNum +secNum);
		
		for(int i=1; i<range; i++) {
			int sum=firstNum+secNum;
			firstNum=secNum;
			secNum=sum;
			
			System.out.println(sum);
					
			
		}

	}

}
