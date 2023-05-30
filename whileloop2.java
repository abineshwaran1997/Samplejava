
public class whileloop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int a=1;
		int b=1;
		while(a<=10) 
		{
			while(b<=10) 
			{
				System.out.println(a+"*"+b+"="+a*b);
				b=b+1;
			}
			a++;
		}
	}

}
