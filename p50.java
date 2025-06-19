/**Pattern Programs**/
public class p50 {

	public static void main(String[] args) {
		String[] arr = new String[] {"E","D","C","B","A"};
		for(int i=0;i<=4;i++) {
			for(int j=0;j<=4;j++) {
				if(j<i)
					System.out.print(" ");
				else
					System.out.print(arr[j]);
			}System.out.println();
		}

	}

}
