package jva;
import java.util.*;
public class Circle1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dd=new Scanner(System.in);
	char ss=dd.next().charAt(0);
	switch(ss) {
	case 'D':
		System.out.println("radius");
		float r=dd.nextFloat();
		float dia=2*r;
		System.out.println("diameter of circle "+dia);
		break;
	case 'C':
		System.out.println("Circumference");
		float c=dd.nextFloat();
		double Circum=(2*3.14)*c;
		System.out.println("Circumference "+Circum);
		break;
	case 'A':
		System.out.println("Area");
		float rd=dd.nextFloat();
		double area=3.14*rd*rd;
		System.out.println("Area of circle "+area);
		break;
	default:
		System.out.println("D diameter,C circumference, or A area of a circle Choose correct one");
		}
	}

}
