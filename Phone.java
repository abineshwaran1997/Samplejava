package jva;
import java.util.*;
public class Phone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner odde=new Scanner(System.in);
		char gd=odde.next().charAt(0);
		if(gd=='A' || gd=='B' || gd=='C') {
			System.out.println(2);}
		else if(gd=='G' || gd=='H' || gd=='I')	{
				System.out.println(4);
		}
		else if(gd=='M' || gd=='N' || gd=='O') {
			System.out.println(6);
		}
		else if(gd=='T' || gd=='U' || gd=='V') {
			System.out.println(8);
		}
		else if(gd=='D' || gd=='E' || gd=='F') {
			System.out.println(3);
		}
		else if(gd=='J' || gd=='K' || gd=='L') {
			System.out.println(5);
		}
		else if(gd=='P' || gd=='R' || gd=='S') {
			System.out.println(7);
		}
		else if(gd=='W' || gd=='X'  || gd=='Y') {
			System.out.println(9);
		}
		else if(gd=='Q' || gd=='Z') {
			System.out.println(gd+" no digit on the telephone");
		}
		else {
			System.out.println("invalid characters");
		}
	}

}
