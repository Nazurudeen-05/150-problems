/**Total Number of Words in a given string **/
public class p98 {

	public static void main(String[] args) {
		String s = "12hijii34";
		int c =0;
		for(int i=0;i<s.length();i++) {
			if(Character.isLetter(s.charAt(i)))
				c++;
		}
		System.out.println("The total number of words :" + c);

	}

}
