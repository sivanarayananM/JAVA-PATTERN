public class K {
    public static void main(String[] args) {
        int n = 9;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1) {
                    System.out.print("*");
                    if(j<=n/2-i+2){
                        for (int k = j; k <=n/2-i+2 ; k++) {
                            System.out.print("  ");
                        }
                        System.out.print("*");
                    }else{
                        for (int k = j; k <=i-j-1; k++) {
                            System.out.print(" ");
                        }
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }}

/*

 *          *
 *        *
 *      *
 *    *
 *  *
 *    *
 *     *
 *      *
 *       *

 */