/**Find the matching string and print it in Capitalcase **/
public class p112 {

	public static void main(String[] args) {
		String s = "apple banana mango apple grape";
		String match = "apple";
		String arr[] = s.split(" ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i].equals(match)) {
				arr[i]=arr[i].substring(0,1).toUpperCase()+arr[i].substring(1);
			}
		}System.out.println(String.join(" ",arr));

	}

}
