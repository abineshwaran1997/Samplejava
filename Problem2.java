import java.util.*;
public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner acc=new Scanner(System.in);
			int n=acc.nextInt();
			int val,sum=0;
			int temp=n;
			do {
				val=n%10;
				sum=sum+(val*val*val);
				System.out.println(sum);
				n=n/10;
				System.out.println(n);
				
			}while(n>0);
			if(temp==sum)
			{
				System.out.println("amstrong");
			}
			else {
				System.out.println("npot a amstrong");
			}
	}

}
