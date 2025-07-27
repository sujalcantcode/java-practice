public class Array {
    
    public static void main(String[] args) {
        // Array Example
        char [][] dialpad = {
            {'1', '2', '3'},
            {'4', '5', '6'},
            {'7', '8', '9'},
            {'*', '0', '#'}
        };
        // Print the dialpad
        for(char[] row : dialpad) {
            for(char key : row) {
                System.out.print(key + " ");
            }
            System.out.println();
        }
    }
}
