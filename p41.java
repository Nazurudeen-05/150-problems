/**Pattern Programs**/
public class p41 {

	public static void main(String... args) {
		for (int i=1;i<6;i++) {
			for(int j=1;j<6;++j) {
				if(i==1 || i==5 )
					System.out.print(1);
				else if(j==1 || j==5 )
					System.out.print(i);
				else
					System.out.print(" ");
			}System.out.println();
		}
	}
}
