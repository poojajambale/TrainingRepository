import java.util.Scanner;
public class EvenNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a last number series.");
		int num = sc.nextInt();
		System.out.println("\nEven numbers are: ");
		
		for(int i = 1; i<=num; i++) {
			if (i%2==0) {
				System.out.println(i);
			}
		
		}
		
	}

}
