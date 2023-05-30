package Whatyou;
import java.util.*;
public class Array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner as=new Scanner(System.in);
		int le=as.nextInt();
		int b[]=new int[le];
		
		int i;
		for(i=0;i<le;i++)
		{
			b[i]=as.nextInt();
			System.out.println("elts"+b[i]);
		}
		int max=b[0];
		int min=b[0];
		for(i=0;i<le;i++) {
			if(max<b[i]) 
				max=b[i];
			if(min>=b[i]) 
				min=b[i];
		}
		System.out.println(" max "+max);
		System.out.println("mim "+min);
	}

}
