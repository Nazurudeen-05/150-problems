/**Program to process the string with unique characters count within the
distance **/
public class p107 {
	public static void count(String s,char r) {
		int range=0;
		for(int i=s.length()-1;i>=0;i--){
			if(s.charAt(i)==r) {
				range = i;
				break;
			}
		}String unique=s.substring(0,1);
		
		for(int i=1;i<=range;i++) {
			if(!unique.contains(s.substring(i,i+1))) {
				unique+=s.charAt(i);
				
			}
		}System.out.println("the unique characters within a specifiedrange : "+unique.length());
	}

	public static void main(String[] args) {
		String s = "my name is granar";
		char range = 'a';
		count(s,range);

	}

}
