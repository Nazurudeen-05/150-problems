/** Program to count the characters which has lower followed by higher**/
public class p104 {

	public static void main(String[] args) {
		String s = "accept Van";
		int c =0;
		System.out.println('a'+0);
		for(int i=0;i<s.length();i++) {
			if(Character.isLetter(s.charAt(i))&&(s.charAt(i)>='A'&&s.charAt(i)<='Z')) {
				c=i+1;
				break;
			}
		}System.out.println(s.substring(c).length());

	}

}
