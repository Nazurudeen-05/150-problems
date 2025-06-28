/** Longest substring without repeating characters**/
public class p116 {

	public static void main(String[] args) {
		String s = "abcdefabcbb";
        String out = "";
        for(int i=0;i<s.length();i++) {
        	String tem=s.substring(i,i+1);
        	for(int j=i+1;j<s.length();j++) {
        		if(!tem.contains(s.substring(j,j+1)))
        			tem+=s.substring(j,j+1);
        		else
        			break;
        	}out=out.length()<tem.length()?tem:out;
        }System.out.println(out.length());
	}

}
