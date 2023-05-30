import java.util.Scanner;
public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner asf=new Scanner(System.in);
			int n=asf.nextInt();
			//int b=asdf.nextInt();
			for( int a=1;a<=n;a++)
			{
				for(int b=1;b<=a;b++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
	}

}
