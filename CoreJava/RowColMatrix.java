public class RowColMatrix {
   public static void main(String[] args) {
         // Example usage of search method
         int[][] matrix = {
              {1, 2, 3, 4},
              {5, 6, 7, 8},
              {9, 10, 11, 12},
              {13, 14, 15, 16}
         };
         int target = 7;
         int[] result = search(matrix, target);
         if (result[0] != -1) {
              System.out.println("Element found at: (" + result[0] + ", " + result[1] + ")");
         } else {
              System.out.println("Element not found in the matrix.");
         }
       
   }
   static int[] search (int[][] matrix, int target) {
       
       int rows = matrix.length;
       int cols = matrix[0].length;
       int row = 0, col = cols - 1;

       while(row < rows && col >= 0){
        if(target == matrix[row][col]){
            return new int[]{row,col};
        } else if(target<matrix[row][col]){
             col--;
        } else{
            row++;
        }
       }
       return new int[]{-1,-1};
   }
}