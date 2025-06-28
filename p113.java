/**Reverse odd position based on the input **/
public class p113 {
	public static String rev(String s) {
		String rev = "";
		for(int i=s.length()-1;i>=0;i--) {
			rev+=s.charAt(i);
		}return rev;
	}

	public static void main(String[] args) {
		String s ="I love programming in python language";
		String arr[]=s.split(" ");
		for(int i=1;i<arr.length;i=i+2) {
			arr[i]=rev(arr[i]);
		}System.out.println(String.join(" ",arr));

	}

}
