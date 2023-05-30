package jva;
import java.util.*;
public class Squaresum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner pp=new Scanner(System.in);
		System.out.println("Positive or negative number ");
		int N=pp.nextInt();
		int sum=0;
		if(N>1) {
			
			for(int i=1;i<=N;i++) {
				int add=i*i;
				sum=sum+add;
			}
			System.out.println("Square of sum integer "+sum);
		}
		else {
			System.out.println("Enter positive number");
		}
	}

}
