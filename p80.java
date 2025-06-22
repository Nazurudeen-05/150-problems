/** Leaders in an Array.**/
public class p80 {
	public static void lead(int[] ar) {
		int n = ar.length;
		int max = ar[n-1];
		
		int[] fin = new int[n];
		int index=0;
		fin[index++]=max;
		for(int i=n-1;i>=0;i--) {
			if(ar[i]>max) {
				max=ar[i];
				fin[index++]=max;
			}
		}for(int i=index-1;i>=0;i--) {
			System.out.print(fin[i]+" ");
		}
	}

	public static void main(String[] args) {
		int[] ar = {16,17,4,3,5,2};
		lead(ar);

	}

}
