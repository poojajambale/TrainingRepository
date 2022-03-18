
public class Decode {

	 public static String decode(String s) {
		 s = s.replaceAll("[aeiouAEIOU]", "");
		 return s;
	 }
	public static void main(String[] args) {
		String ans = decode("Pooja Jambale");
		System.out.println(ans);
	}

}
