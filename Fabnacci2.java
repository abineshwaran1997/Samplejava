
public class Fabnacci2 {
	public static void main(String[] args) {
		
		int i,num1=0;
		int num2=1;
		System.out.print(num1+" "+num2 +" ");
		int count=10;
		int fabni;
		for(i=0;i<count;i++)
		{
		fabni=num1+num2;
		num1=num2;
		num2=fabni;
		System.out.print(fabni+" ");	

       }
	}
}
