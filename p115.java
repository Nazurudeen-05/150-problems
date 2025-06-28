/** Longest palindrome substring**/
public class p115 {
	public static boolean palindrome(String s) {
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev+=s.charAt(i);
		}return s.equals(rev)?true:false;
	}

	public static void main(String[] args) {
		String s = "babad";
		String max="";
		for(int i=0;i<s.length();i++) {
			String tem ="";
			for(int j=i+1;j<s.length();j++) {
				if(palindrome(s.substring(i,j+1))) 
					tem=s.substring(i,j+1);	
			}max=tem.length()>=max.length()?tem:max;
		}System.out.println(max);
	}

}
