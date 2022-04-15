package Day5Assignments;

import java.util.Scanner;

public class LeafYear {

	public static void main(String[] args) {
		

		int year;
		System.out.println("Enter the 4 digit year.");
		System.out.println("Enter the year : :");
		
		Scanner scan = new Scanner(System.in);
		year = scan.nextInt();
		
		if (year >= 1000);
			if (((year % 4 == 0) && (year % 100!=0) || (year % 400 == 0)))
				System.out.println(year+" is Leaf year");
			else
				System.out.println(year+" is not a Leaf year");
			
	}
}
