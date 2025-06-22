/** distinct values**/
public class p86 {
	public static boolean exists(int val,int[] n) {
		for(int num : n) {
			if(num==val)
				return true;
		}return false;
	}
	public static boolean exists(int val,int end,int[] n) {
		for(int i=0;i<end;i++) {
			if(n[i]==val)
				return true;
		}return false;
	}

	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		int[] b = {3,4,5,6};
		int[] c = {6,7,8};
		int count = 0;
		for(int i=0;i<a.length;i++) {
			int val = a[i];
			if(!exists(val,b)&&!exists(val,c)&&!exists(val,i,a))
				count++;
		}
		for(int i=0;i<b.length;i++) {
			int val = b[i];
			if(!exists(val,a)&&!exists(val,c)&&!exists(val,i,b))
				count++;
		}
		for(int i=0;i<c.length;i++) {
			int val = c[i];
			if(!exists(val,b)&&!exists(val,a)&&!exists(val,i,c))
				count++;
		}
		System.out.println(count);

	}

}
