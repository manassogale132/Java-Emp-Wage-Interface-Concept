package EmpWageInterface;

import java.util.Random;
import java.util.Scanner;

public class companies implements empwageinterface {

	@Override
	
	public void comp1() {
		
		for(int j=0;j<=4;j++) {
		Scanner scan=new Scanner(System.in);
		System.out.println("-----------------------------------------------------------------");
		System.out.println("-:Enter a Company name:-");
		String comp1=scan.nextLine();
		System.out.println("1-Enter Full Wage");
		int fwage=scan.nextInt();
		System.out.println("2-Enter Half Wage");
		int hwage=scan.nextInt();
		System.out.println("3-Enter No Wage");
	    int nowage=scan.nextInt();
	    
	    int sum=0;
	    
	    System.out.println("-----------------------------------------------------------------");
	    System.out.println("Wages are in Dollars '$'");
	    System.out.println("          ");
	    System.out.println("Fwage="+fwage+"    "+"(Present)");         
	    System.out.println("Hwage="+hwage+"     "+"(Partime)");        
	    System.out.println("NOwage="+nowage+"     "+"(Absent)");  
	    System.out.println("         ");
	    System.out.println("Working Days="+20);
	    System.out.println("         ");
	    System.out.println("-----------------------------------------------------------------");

	    
        System.out.println("Day No:"+"     "+"Wage"+"     "+"TotalWage");
        System.out.println("         ");
        
        for(int i=0;i<=20;i++) {
        Random rand = new Random();
        int input = rand.nextInt(3);
        
       switch(input) {
       
       case 2:
    	   sum=sum+fwage;
       	   System.out.println("Day "+i+"        "+ fwage+"        "+sum);
       	   break;
       case 0:
    	   sum=sum+nowage;     
       	   System.out.println("Day "+i+"        "+ nowage+"        "+sum);
       	   break;
       case 1:
    	   sum=sum+hwage;  
           System.out.println("Day "+i+"        "+ hwage+"        "+sum);
       	   break;
       default:
    	   System.out.println("No such case");
    	   break;   
    	   
       }
      
}
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Total Wage of day :"+comp1+":"+sum+"$");
        
	}
}
}

		
	
	
	
	



