import java.util.Scanner;
public class CompareString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String str = sc.next();
		//String name = pooja;
		 
		if (str.equalsIgnoreCase("pooja")) {
			System.out.println("Welcome");
		}
		
		else {
			System.out.println("Invalid!!!");
		}
		
	}

}
