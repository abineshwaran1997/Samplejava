package jva;
import java.util.*;
public class Empolyee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner asd=new Scanner(System.in);
		System.out.println("Number of emp");
			int employee=asd.nextInt();
			int Totpay=0;
			for(int i=1;i<=employee;i++) {
				System.out.println("hours>> payment via company");
				int payadd=asd.nextInt();
				System.out.println("Working hours");
				int hours=asd.nextInt();
				int pay=hours*payadd;
				Totpay=Totpay+pay;
			}
			System.out.println("the company’s total pay for the wee "+Totpay);
	}

}
