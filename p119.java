/** Reverse sentence**/
public class p119 {

	public static void main(String[] args) {
		String s = "Programming is fun";
		String arr[]=s.split(" ");
		for(int i=arr.length-1;i>=0;i--)
			System.out.print(arr[i]+" ");

	}

}
