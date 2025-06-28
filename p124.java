/**Given a string of digits, remove leading zeros from it. **/
public class p124 {

	public static void main(String[] args) {
		String s = "000012345000";
		String tem=s.substring(0,1);
		for(int i=1;i<s.length();i++) {
			if(tem.equals("0")&&!s.substring(i,i+1).equals(tem)) {
				System.out.println(s.substring(i));
				break;
			}
		}
	}

}
