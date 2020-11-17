package EmpWageInterface;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("-Employee Wage Builder-");
		
		//Making separate object for each company.
		
		empwageinterface company1=new companies();
        company1.comp1();

}
}
