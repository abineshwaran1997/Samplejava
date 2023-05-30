import java.util.*;
public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner asdf=new Scanner(System.in);
			int a=asdf.nextInt();
			int b=asdf.nextInt();
			for(a=1;a<=10;a++)
			{
				for(b=1;b<=10;b++)
				{
					System.out.print(a+"*"+b+"="+a*b+"\t");
				}
				System.out.println();
			}
	}

}
