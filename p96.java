/** Assuming that the 3 numbers are passed to the given function.Complete the
function to find and return the key.**/
public class p96 {
	public static int key(int a,int b,int c) {
		int arr[] =new int[4];
		int i=3;
		while(a!=0) {
			int tem1=a%10;
			int tem2=b%10;
			int tem3=c%10;
			if(i%2==1) {
				int max = Math.max(tem1, tem2);
				max=Math.max(max, tem3);
				arr[i]=max;
			}else {
				int min = Math.min(tem1, tem2);
				min=Math.min(min, tem3);
				arr[i]=min;
			}i--;
			a/=10;b/=10;c/=10;
		}return arr[0]*1000+arr[1]*100+arr[2]*10+arr[3];
	}

	public static void main(String[] args) {
		int a = 3521;
		int b = 2452;
		int c = 1352;
		System.out.println(key(a,b,c));

	}

}
