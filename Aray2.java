package Whatyou;
import java.util.*;
public class Aray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner we=new Scanner(System.in);
		int l=we.nextInt();
		int aa[]=new int[l];
		int i;
		for(i=0;i<l;i++ ) {
			System.out.println(i+1);
			aa[i]=we.nextInt();
		}
		for(i=l-1;i>=0;i--) {
			System.out.println(aa[i]);
		}
	}

}
