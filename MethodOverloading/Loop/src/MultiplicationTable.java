
public class MultiplicationTable {
	
	public static void table(int num) {
	System.out.println("Multiplication Table of "+num+" is: ");
		int ans = 0;
		for (int i = 1; i<=10; i++) {
			ans = num * i;
			System.out.println(ans);
		}
		
	}
	public static void main(String[] args) {
		MultiplicationTable table = new MultiplicationTable();
		table.table(5);
	}

}
