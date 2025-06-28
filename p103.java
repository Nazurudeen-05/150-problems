/**Program to remove the palindromic string from the given input string**/

public class p103 {
	public static boolean pa(String t) {
		String rev = "";
		for(int i = t.length()-1;i>=0;i--) {
			rev+=t.charAt(i);
		}return t.equals(rev);
	}

	public static void main(String[] args) {
		String s = "In India Malayalam is best with dad and mom";
		String out = "";
		String arr[]=s.split(" ");
		for(int i=0 ;i<arr.length;i++) {
			if(!pa(arr[i].toLowerCase()))
				out+=arr[i]+" ";
		}System.out.println(out);

	}

}
