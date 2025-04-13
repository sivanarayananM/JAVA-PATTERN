public class V {
    public static void main(String[] args) {
        int n=16;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if(i<=n/2) {
                    if(i==j || j==n-i)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}

/*

 *             *
  *           *
   *         *
    *       *
     *     *
      *   *
       * *
        *

 */