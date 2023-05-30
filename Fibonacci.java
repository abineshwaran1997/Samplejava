import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner fab=new Scanner(System.in);
			int fabn;
			System.out.println("enter count");
			int i,num1=0;
			int num2=1;
			int count=fab.nextInt();
			for(i=0;i<count;i++)
			{
			fabn=num1+num2;
			num1=num2;
			num2=fabn;
			System.out.print(fabn+" ");	

	       }
	}
}