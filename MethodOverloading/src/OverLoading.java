
public class OverLoading {

	public int add (int a,int b) {
		return a + b;
		}
	
	public int add(int a,int b, int c) {
		return a + b + c;
		}
	
	public void add (double a,int b) {
		System.out.println(a + b);
		}
	
	public static void main(String[] args) {
		OverLoading obj = new OverLoading();
		System.out.println(obj.add(2, 3));
		System.out.println(obj.add(5, 4, 9));
		obj.add(5.5, 3);
	}

}
