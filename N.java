public class N {
    public static void main(String[] args) {
        int n=9;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=9 ; j++) {
                if(j==1 || j==n)
                    System.out.print(" *");
                if(j==i && (j!=n))
                    System.out.print(" *");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}

/*

 * *               *
 *   *             *
 *     *           *
 *       *         *
 *         *       *
 *           *     *
 *             *   *
 *               * *
 *                 *

 */
