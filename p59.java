import java.util.Arrays;

/**Remove all duplicates in an array sample input and output**/
public class p59 {

	public static void main(String[] args) {
		int[] arr = new int[] {5,5,6,7,8,0,1,1,8};
		int[] count = new int[10];
		for(int i : arr) {
			count[i]++;
		}String s = "";
        for(int j=0;j<count.length;j++) {
        	if(count[j]>=1) {
        		s+=j+",";
        	}
        }
        System.out.println(Arrays.toString(s.split(",")));
	}

}
