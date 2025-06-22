/** Adding the number from the String input**/
public class p99 {

	public static void main(String[] args) {
		String s = "12hijii453";
		int sum = 0;
		for(int i=0;i<s.length();i++) {
			if(Character.isDigit(s.charAt(i))){
			     int tem = s.charAt(i)-'0';
			     sum+=tem;
		    }
		}
		System.out.println(sum);

	}

}
