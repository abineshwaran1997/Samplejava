package Whatyou;
import java.util.*;
public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner zx=new Scanner(System.in);
		int len=zx.nextInt();
		int a[]=new int[len];
		int i,sum=0;
		for(i=0;i<len;i++) {
			a[i]=zx.nextInt();
			if(a[i]%2==0) {
				System.out.println("even array "+a[i]);
				sum=sum+a[i];
			}
		}
		System.out.println(" sum  "+sum);
	}

}
