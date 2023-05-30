
public class Oprat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a=10;
			int b=20;
			int c=30;
			System.out.println(a<b);
			System.out.println(a<=b);
			System.out.println(a>=b);
			System.out.println(a==b);
			System.out.println(a!=b);
			System.out.println(a>b && a>c);
			System.out.println(a>b || a>c);
			int d=10;
			int e=d++;
			System.out.println(d+" "+e);
			e=++d;
			System.out.println(d+" "+e);
			System.out.println(d++ + e++);
			System.out.println(++d + ++e);
			/*a=10;
			b=a++ +1;
			System.out.println(a+" "+b);*/
			c=(a>b)?a:b;
			System.out.println(c);
			a=5;
			 b=3;
			System.out.println(a&b);
			System.out.println(a|b);
			System.out.println(~a);
			System.out.println(a<<2);
			System.out.println(a>>2);
			
			
			
	}

}
