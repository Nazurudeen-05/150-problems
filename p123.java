/**Delete all the common elements of two string and concatenate both **/
public class p123 {

	public static void main(String[] args) {
		String a ="aaaa";
		String b="bbbbaac";
		for(int i=0;i<a.length();i++) {
			if(!b.contains(a.substring(i,i+1)))
				System.out.print(a.charAt(i));
		}for(int i=0;i<b.length();i++) {
			if(!a.contains(b.substring(i,i+1)))
				System.out.print(b.charAt(i));
		}

	}

}
