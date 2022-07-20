import java.util.*;
public class UniqueCharacters {

	public static void main(String[] args) {
		Set<Character> set1 = new HashSet<>();
		String a = "abdsbasbdjsjbda";
		for(int i=0;i<a.length();i++) {
			set1.add(a.charAt(i));
		}
		System.out.println(set1.size());
		System.out.println(set1);
	}

}
