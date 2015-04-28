import java.util.Random;


public class Main {
	static String[] fname = { "Joel", "Joshua", "Magic", "Kevin", "Thomas", "Francis"};
	static String[] lname = { "Aro", "Alcoran", "Tan", "Tran", "Balani", "Mora", "Nguyen"};
	
	public static void main(String args[]) {
		Random randFName = new Random();
		Random randLName = new Random();
		
		int rfn = randFName.nextInt(5) + 0;
		int rln = randLName.nextInt(6) + 0;
		
		System.out.println(fname[rfn] + " " + lname[rln]);
	}
}
