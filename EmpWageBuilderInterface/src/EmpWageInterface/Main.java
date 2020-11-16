package EmpWageInterface;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("-Employee Wage Builder-");
		
		//Making separate object for each company.
		
		empwageinterface company1=new companies();
        company1.comp1();
        
        empwageinterface company2=new companies();
        company2.comp2();

        empwageinterface company3=new companies();
        company3.comp3();

}
}
