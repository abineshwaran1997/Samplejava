import java.util.Scanner;

public class Cons4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner oc = new Scanner(System.in);
		System.out.println(" enter the value");
		int a= oc.nextInt();
		int b= oc.nextInt();
		int c= oc.nextInt();
		
		if(a>b) {
			if(a>c) {
				System.out.println("a is larg");
				
			}
			else
			{
				System.out.println("c is large");
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println("b is larg");
			}
			else {
				System.out.println("c is larg");
			}
		}

	}

}
