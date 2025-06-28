/** Program to encrypt the given string**/
public class p108 {
	public static void Encrypt(String s) {
		String en = "";
		for(int i=0;i<s.length();i++) {
			int count=1;
			en+=s.charAt(i);
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j))
					count++;
				else {
					i=j-1;
				    break;
				}
			}if(count>1)
				en+=count+"";
		}System.out.println(en);
	}

	public static void main(String[] args) {
		String s = "aaabccccddaaaaab";
		Encrypt(s);

	}

}
