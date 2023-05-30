import java.util.*;
public class Prime {
	public static void main(String...args){
		Scanner pre=new Scanner(System.in);
		System.out.println("enter number");
		int number=pre.nextInt();
		int prime=1,i;
		for(i=2;i<number/2;i++) {
			if((number%i) ==0)
			{
				prime=0;
			}
		}
		if(prime == 1) {
			System.out.println("PRIME");
		}
		else {
			System.out.println("Not prime");
		}
	}
}
