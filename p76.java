import java.util.Arrays;

/** Insert an element in an array**/
public class p76 {

	public static void main(String[] args) {
		int[] arr = {10,20,40,50};
		int pos =3;
		int ele=30;
		int[] con = new int[arr.length+1];
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(j==pos-1) {
				con[j]=ele;
				j++;
				i--;
				
			}else {
				con[j]=arr[i];
				j++;
			}
		}System.out.println(Arrays.toString(con));

	}

}
