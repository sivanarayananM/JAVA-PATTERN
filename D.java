public class D {
    public static void main(String[] args) {
        int n=7;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if(j==n && (i==1 || i==n))
                    System.out.print("   ");
              else if(i==1||i==n||j==1||j==n)
                    System.out.print("*  ");
              else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
}

/*

 *  *  *  *  *  *
 *                 *
 *                 *
 *                 *
 *                 *
 *                 *
 *  *  *  *  *  *

 */