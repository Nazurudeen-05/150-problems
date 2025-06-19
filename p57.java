/**Second largest number in an array**/
public class p57 {

	public static void main(String[] args) {
		int[] arr = new int[] {657,78,379,284,574};
          int max =0 ;
          int max2 =0;
          for(int i=0;i<arr.length;i++) {
        	  if(arr[i]>max) {
        		  max2=max;
        		  max=arr[i];
        	  }else if(arr[i]>max2 && arr[i]!=max) {
        		  max2=arr[i];
        	  }
          }System.out.println("first largest number in array "+ max);
          System.out.println("second largest number in array "+ max2);
	}

}
