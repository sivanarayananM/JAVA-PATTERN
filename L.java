public class L {
    public static void main(String[] args) {
        int n=9;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=9 ; j++) {
                if(j==1 || i==n)
                    System.out.print("* ");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

/*

 *
 *
 *
 *
 *
 *
 *
 *
 * * * * * * * * *

 */