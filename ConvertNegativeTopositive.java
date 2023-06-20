package week1.day2;

public class ConvertNegativeTopositive {

	public static void main(String[] args) {
	int number = -40;
	int newNum=number=number*(-1);
	if(number<0) {
		System.out.println("Negative Number");
	}
	else if(newNum<0) {
		System.out.println("Positive Number");
	}
	else {
		System.out.println("Therefore Number is converted into Positive" +newNum);
	}
	}
                                                             
}
