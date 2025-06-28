/**Program to reverse either odd or even position based on the input **/
public class p106 {
	public static void reverse(String s,String pos) {
		String out="";
		int len = s.length();
		for(int i=0;i<len;i++) {
			if(pos.equals("even")) {
				if(i%2==0) {
					out+=s.charAt(len-i-1);
				}else {
					out+=s.charAt(i);
				}
			}else {
				if(i%2==1) {
					out+=s.charAt(len-i-1);
				}else {
					out+=s.charAt(i);
				}
			}
		}System.out.println("The reversed string : "+out);
	}

	public static void main(String[] args) {
		String s = "chennaicity";
		String pos = "even";
		reverse(s,pos);

	}

}
