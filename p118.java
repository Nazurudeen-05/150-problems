/** First Repeated character in a string**/
public class p118 {

	public static void main(String[] args) {
		String s = "ababa";
		String frepeated="";
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					frepeated +=s.charAt(i);
					break;
				}
			}if(frepeated!=null)
				break;
		}System.out.println(frepeated);

	}

}
