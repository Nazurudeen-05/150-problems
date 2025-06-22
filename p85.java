/** Spiral order **/
import java.util.*;
public class p85 {
	 public List<Integer> spiralOrder(int[][] matrix) {
	        List<Integer> result = new ArrayList<>();

	        if (matrix == null || matrix.length == 0) {
	            return result;
	        }

	        int top = 0;
	        int bottom = matrix.length - 1;
	        int left = 0;
	        int right = matrix[0].length - 1;

	        while (top <= bottom && left <= right) {
	            // Traverse from Left to Right
	            for (int col = left; col <= right; col++) {
	                result.add(matrix[top][col]);
	            }
	            top++;

	            // Traverse from Top to Bottom
	            for (int row = top; row <= bottom; row++) {
	                result.add(matrix[row][right]);
	            }
	            right--;

	            // Traverse from Right to Left (check to avoid double counting)
	            if (top <= bottom) {
	                for (int col = right; col >= left; col--) {
	                    result.add(matrix[bottom][col]);
	                }
	                bottom--;
	            }

	            // Traverse from Bottom to Top (check to avoid double counting)
	            if (left <= right) {
	                for (int row = bottom; row >= top; row--) {
	                    result.add(matrix[row][left]);
	                }
	                left++;
	            }
	        }

	        return result;
	    }

	    // Example usage
	    public static void main(String[] args) {
	        p85 sm = new p85();
	        int[][] matrix = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };

	        List<Integer> spiral = sm.spiralOrder(matrix);
	        System.out.println(spiral);  // Output: [1, 2, 3, 6, 9, 8, 7, 4, 5]
	    }

}
