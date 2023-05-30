import java.util.*;
public class Rough1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner bcd=new Scanner(System.in);
			int N=bcd.nextInt();
			 if(N%2==0)
		        {
		            if( N==2 || N==4)
		            {
		                System.out.println("Not Weird");
		            }
		            else if(N==6 || N==8 || N==10 || N==12 || N==14 || N==18 || N==20)
		            {
		                System.out.println("Weird");
		            }
		            else
		            {
		            	System.out.println("Not Weird");
		        }
		        }
		        else{
		            System.out.println("Weird");
		        }
		    }
	}


