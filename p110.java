/** Half of the string to lower case and remaining half to uppercase**/
public class p110 {
	public static void cap(String s) {
		int mid = s.length()/2;
		System.out.println(s.substring(0,mid).toLowerCase()+s.substring(mid).toUpperCase());
	}

	public static void main(String[] args) {
		String s ="helloworld";
		cap(s);

	}

}
