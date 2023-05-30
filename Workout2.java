import java.util.*;
public class Workout2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obc=new Scanner(System.in);
		char ac=obc.next().charAt(0);
		int d,pa;
		switch(ac) {
		case '1':
			System.out.println("pizza and burger");
			System.out.println("enter pp and pb val");
			int pp=obc.nextInt();
			int pb=obc.nextInt();
			d=(pp+pb)*10/100;
			pa=(pp+pb)-d;
			System.out.println("final discoument amouint pizza and buger"+ pa);
			break;
		case '2':
			System.out.println("pizza and tea");
			System.out.println("enter pp and pt val");
			int paa=obc.nextInt();
			int pt=obc.nextInt();
			d=(paa+pt)*10/100;
			pa=(paa+pt)-d;
			System.out.println("final discoument amouint pizza and tea"+ pa);
			break;
		case '3':
			System.out.println("tea and burger");
			System.out.println("enter ptt and pbb val");
			int ptt=obc.nextInt();
			int pbb=obc.nextInt();
			d=(ptt+pbb)*10/100;
			pa=(ptt+pbb)-d;
			System.out.println("final discoument amouint tea and buger"+ pa);
			break;
		default:
			System.out.println(" place a order plz");
		}
		}

}
