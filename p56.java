/**Missing number in an array of shuffled order**/
public class p56 {

	public static void main(String[] args) {
		int[] arr = new int[]{1,2,3,4,5,6,7,9};
        int len =arr.length;
        int[] miss = new int[len+2];
        for (int i=0;i<len;i++) {
        	int tem = arr[i];
        	miss[tem]++;
        }System.out.println("the missing number in an array is ");
        for(int j=1;j<miss.length;j++) {
        	if(miss[j]==0) {
        		System.out.print(j);
        	    break;
        	}
        }
	}

}
