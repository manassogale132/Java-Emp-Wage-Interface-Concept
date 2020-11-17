package EmpWageInterface;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("-Employee Wage Builder-");
		
		//Taking input from user.
		//Making separate object for each company i.e(company 1,company 2,company 3) using interface.
		
        empwageinterface company1=new companies();
        company1.comp1();                                         //1st Company
        
        empwageinterface company2=new companies();
        company2.comp1();                                         //2nd Company
        
        empwageinterface company3=new companies();
        company3.comp1();                                         //3rd Company
       
        
}
}

