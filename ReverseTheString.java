import java.lang.*;
import java.util.*;
public class ReverseTheString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String[] strar = str.split(" ");
		int len = str.length()-1;
		String rev = "";
		while(len>=0) {
			rev += str.charAt(len);
			len--;
		}
		System.out.println(rev);
}
}
