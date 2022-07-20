
public class RemoveSpacesInString {

	public static void main(String[] args) {
		 String s = "        Hello      world        ";
		 char[] ch = s.toCharArray();
		 int start=0,end=0;
		 for(int i=0;i<ch.length;i++) {
			 if(ch[i] != ' ') {
				 start = i;
				 break;
			 }}
		 for(int i=ch.length-1;i>0;i--) {
				 if(ch[i] != ' ') {
					 end = i;
					 break;
				 }
		 }
		 for(int i=start;i<=end;i++) {
			 System.out.print(ch[i]);
		 }

	}

}
