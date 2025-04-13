public class A {
    public static void main(String[] args) {
        int n=9;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i*2-1 ; j++) {
                if(i==n/2+1){
                    if(j<=n/2+1)
                        System.out.print("* ");
                }
                else if(j==1 || j==i*2-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

/*

         *
        * *
       *   *
      *     *
     * * * * *
    *         *
   *           *
  *             *
 *               *


 */