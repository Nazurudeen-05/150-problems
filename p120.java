/** Given a string s of lowercase English letters, the task is to find the first nn-
repeating character. If there is no such character, return '$'.**/
public class p120 {

	public static void main(String[] args) {
		String s = "aabcdd";
		String nonrepeated="";
		for(int i=0;i<s.length();i++) {
			String tem=s.substring(i,i+1);
			boolean b=false;
			for(int j=0;j<s.length();j++) {
				if(i!=j&&tem.equals(s.substring(j,j+1))) {
					b=true;
					break;
				}
			}if(!b) {
				nonrepeated+=tem;
				break;
			}
		}if(!nonrepeated.isEmpty())
			System.out.println(nonrepeated);
		else
			System.out.println("$");

	}

}
