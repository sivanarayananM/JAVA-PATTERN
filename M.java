public class M {
    public static void main(String[] args) {
        int n=7;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {

                if(j==1 || j==n)
                    System.out.print("* ");
                if(i<=n/2) {
                    if (j == i || j == n - i)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}

/*

 * *         * *
 *   *     *   *
 *     * *     *
 *             *
 *             *
 *             *
 *             *

 */