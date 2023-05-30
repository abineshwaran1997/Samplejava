import java.util.*;
public class Porb1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner obj=new Scanner(System.in);
			int n,rem,rev=0,temp;
			System.out.println("number");
			n=obj.nextInt();
			temp=n;
			do {
				rem=n%10;
				rev=rev*10+rem;
				n=n/10;
				
			}while(n!=0);
			if(temp== rev) {
				System.out.println(" palindrom");
			}
			else {
				System.out.println("Not a palindrom");
			}
	}

}
