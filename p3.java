public class p3 {
    
    public static void main(String args[]) {
        int n;
        n = 5;
        int space = 1;
        for (int i = 1; i <= n; i++) {

            for (int j = n; j >= n - i + 1; j--) {
                System.out.print("* ");
            }

            System.out.println();
        }
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
