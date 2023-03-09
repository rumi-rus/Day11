package exercise6;

import java.util.Scanner;



public class browserCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserHistory browser=new BrowserHistory("Google");
		int option;
		Scanner sc = new Scanner(System.in);
		do {
	        System.out.println("\nTHE MENU:");
	        System.out.println("1.Vsit a url\n2.Move Backward\n3.Move forward");
	        System.out.println("4.get url at a position\n5.Exit\n--------------------------\n Enter the option");
	        option= sc.nextInt();
	        System.out.println("--------------------------");
	        if(option==1) {
	        	String str;
	        	Scanner s = new Scanner(System.in);
	        	System.out.println("Enter the string to visit");
	        	str= s.nextLine();
	        	try {
	        	browser.visit(str);
	        	}
	        	catch(InvalidURLException E){
	        		System.out.println(E);
	        	}
	        }
	        else if(option==2) {
	        	int a;
	        	String str;
	        	Scanner s = new Scanner(System.in);
	        	System.out.println("Enter the steps to go backward");
	        	a= s.nextInt();
	        	try {
	        	System.out.println("The url is "+browser.back(a));
	        	}
                catch(NoHistoryFoundException h) {
                	System.out.println(h);
                }
	        	catch(InvalidPositionException i) {
	        		System.out.println(i);
	        	}
	        		        }
	        else if(option==3) {
	        	int a;
	        	String str;
	        	Scanner s = new Scanner(System.in);
	        	System.out.println("Enter the steps to go forward");
	        	a= s.nextInt();
	        	try {
	        	System.out.println("The url is "+browser.forward(a));
	        	}
	        	catch(NoHistoryFoundException H) {
	        		System.out.println(H);
	        	}

	        		    }
	        else if(option==4){ 
	        	int a;
	        	String str;
	        	Scanner s = new Scanner(System.in);
	        	System.out.println("Enter the position");
	        	a= s.nextInt();
	        	try {
	        	System.out.println("The url is "+browser.get(a));
	        	}
	        	catch(InvalidPositionException In) {
	        		System.out.println(In);
	        	}
	        	catch(IndexOutOfBoundsException I) {
	        		System.out.println(I);
	        		
	        	}

	                   }  
	        else {
	        	System.exit(0);
	        }
		    }while(true);


	}

}
