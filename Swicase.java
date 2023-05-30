import java.util.Scanner;

public class Swicase {
	public static void main(String[] args)
	{
		Scanner abc =new Scanner(System.in);
		System.out.println(" Enterr the value");
		int ac=abc.nextInt();
		switch(ac)
		{
		case 1:
			System.out.println("Admin team");
			break;
		case 2:
			System.out.println("Manager team");
			break;
		case 3:
			System.out.println("Palcement shell team");
			break;
		default:
			System.out.println(" call any one2");
		}
	}

}
