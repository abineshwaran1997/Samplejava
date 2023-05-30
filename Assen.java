import java.util.*;
public class Assen {
     public static void main(String[] args) {
		Scanner o=new Scanner(System.in);
		System.out.println("enter the a value u");
		int u=o.nextInt();
		System.out.println("enter the a value a");
		int a=o.nextInt();
		System.out.println("enter the a value t");
		int t=o.nextInt();
		double distance;
		distance=(u*t)+(a*t*t )/2;
		System.out.println(distance);
	}
}
