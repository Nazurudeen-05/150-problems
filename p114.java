/** Split a string on hyphens**/
public class p114 {

	public static void main(String[] args) {
		String s = "Emma-is-a-data-scientist";
		String arr[]=s.split("-");
		for(String t : arr) {
			System.out.println(t);
		}

	}

}
