package jva;
import java.util.*;
public class SimpleInte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner asdf=new Scanner(System.in);
			int principal=asdf.nextInt();
			int rate=asdf.nextInt();
			int time=asdf.nextInt();
			double SI;
			SI=(principal*rate*time)/100;
			System.out.println("Simple Intrest "+SI);
	}

}
