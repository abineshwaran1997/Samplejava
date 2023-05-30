import java.util.*;

public class Cons5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ac = new Scanner(System.in);
		System.out.println(" enter the value");
		String a= ac.next();
		String b=ac.next();
		
		if(a.equals("pizza") && b.equals("burger"))
		{
			System.out.println(" Pizza and burger10%");
		}
		else if(a.equals("pizza") && b.equals("tea"))
		{
			System.out.println("Pizza and tea 10%");
		}
		else if(a.equals("tea")&& b.equals("burger"))
		{
			System.out.println("tea bur");
		}
		else {
			System.out.println("inval");
		}
		}

	}


