/** Pattern Programs **/
public class p52 {

    public static void generateBraces(String current, int open, int close, int n) {
        if (current.length() == 2 * n) {
            System.out.println(current);
            return;
        }

        if (open < n) {
            generateBraces(current + "{", open + 1, close, n);
        }
        if (close < open) {
            generateBraces(current + "}", open, close + 1, n);
        }
    }

    public static void main(String[] args) {
        int n = 2;
        String s = "";
        generateBraces(s, 0, 0, n);
    }
}

