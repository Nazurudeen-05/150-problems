import java.util.Arrays;

/** Transpose of matrix**/
public class p84 {
	public static int[][] transpose(int[][] mat){
		int[][] res = new int[mat.length][mat.length];
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat.length;j++) {
				res[j][i]=mat[i][j];
			}
		}return (res);
	}

	public static void main(String[] args) {
		int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(Arrays.deepToString(transpose(mat)));

	}

}
