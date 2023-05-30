import java.util.Scanner;

public class Strswtic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner abce=new Scanner(System.in);
			System.out.println(" enter  string");
			String ase=abce.next();
			switch(ase)
			{
				case "fall":
					System.out.println("fall sem");
					break;
				case "winter":
					System.out.println("winter sem");
					break;
				case "inter":
					System.out.println(" inter sem");
					break;
				default:
					System.out.println("invaled choice");
			}
	}

}
