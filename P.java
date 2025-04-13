public class P {
    public static void main(String[] args) {
        int n=10;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= n; j++) {
                if(j==1)
                    System.out.print("* ");
                else if(i==1 || i==n/2 || j==n/2+1){
                    if(j==n/2+1 && (i==1 || i==n/2))
                        System.out.print("  ");
                    else if(j<=n/2+1 && i<=n/2)
                        System.out.print("* ");
                }else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}

/*

 * * * * *
 *         *
 *         *
 *         *
 * * * * *
 *
 *
 *
 *
 *

 */