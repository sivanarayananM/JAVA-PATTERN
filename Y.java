public class Y {
    public static void main(String[] args) {
        int n=8;
        for (int i = 0; i <=n ; i++) {
            for (int j = 0; j <=n ; j++) {
                if (i <= n / 2) {
                    if (i == j || j == n - i)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                } else if (j == n / 2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}

/*

 *               *
   *           *
     *       *
       *   *
         *
         *
         *
         *
         *

 */