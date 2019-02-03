package chizhenko;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String myStr;
		int numb = 0;
		
		System.out.println("¬ведите число в двоичном формате:");
		myStr = sc.nextLine();
		sc.close();
		StringBuilder sb = new StringBuilder(myStr);
		sb.reverse();
		
		numb = returnNumber(sb.toString());
		
		System.out.println(numb);

	}
	
	 public static int returnNumber(String pNumb) {
		
		 int numb = 0;
		 int number = 0;
		 int pow = 0;
		 
		for (int i=0; i<pNumb.length(); i++) {
			pow = (int) Math.pow(2, i);
			numb = Character.getNumericValue(pNumb.charAt(i));
			number = number + numb * pow;
			
		}
		
	return number;
			
	}


}
