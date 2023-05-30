import java.util.Scanner;
public class Probem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner asdf=new Scanner(System.in);
			int n=asdf.nextInt();
			//int b=asdf.nextInt();
			for( int a=1;a<=n;a++)
			{
				for(int b=1;b<=a;b++)
				{
					System.out.print(a);
				}
				System.out.println();
			}
	}

}