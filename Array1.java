package Whatyou;
import java.util.*;
public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner od=new Scanner(System.in);
			int a[]=new int[5];
			int avg,i;
			int sum=0;
			for(i=0;i<a.length;i++) {
				//System.out.println("a[i] "+a[i]);
				a[i]=od.nextInt();
				sum=sum+a[i];
			}
			avg=sum/a.length;
			System.out.println("Sum "+sum);
			System.out.println("Avg "+avg);
	}

}
