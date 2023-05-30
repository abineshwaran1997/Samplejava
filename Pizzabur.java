import java.util.*;
public class Pizzabur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner valu=new Scanner(System.in);
			System.out.println(" enter choice");
			int a=valu.nextInt();
			int b=valu.nextInt();
			int c=(a+b)*10/100;
			int d=a+b;
			int ans=d-c;
			int ab=valu.nextInt();
			switch(ab) {
			     case 1:
			    	 System.out.println(" final amount"+ans);
			    	 break;
			     default:
			    	 System.out.println(" vailed amount");
			    		 
			}
			
	}

}
