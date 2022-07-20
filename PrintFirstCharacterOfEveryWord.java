public class PrintFirstCharacterOfEveryWord {
		public static void main(String args[]) {
		String s = " Hello world";
		char[] a = s.toCharArray();
		System.out.println(a[0]);
		for(int i =0;i<a.length;i++) {
			if (a[i] != ' ') {
				if(i==0) {
					System.out.println(a[i]);
					}
				else if(a[i-1] == ' ') System.out.print(a[i]+",");
					}
				}
			}
}

