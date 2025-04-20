public class LayeredNumberPattern {
    public static void main(String[] args) {
        int n = 5;
        int k = n + n - 1;
        int d = 2;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                if (i <= k / 2) {
                    if (i == j) {
                        for (int l = i; l < k - i; l++) {
                            System.out.print(n - i + " ");
                            j = l; }
                    } else {
                        if (j > k / 2)
                            System.out.print(j - n + 2 + " ");
                        else
                            System.out.print(n - j + " ");}
                } else {
                    if (i - d == j - d) {
                        for (int l = i - d; l < k - (i - d); l++) {
                            System.out.print(n - (i - d) + " ");
                            j = l; }
                        d = d + 2;
                    }else {
                        if (j < i - d)
                            System.out.print(n - j + " ");
                        else if (j > i)
                            System.out.print(j - n + 2 + " ");
                    }}}
                System.out.println();
            }}}

/*

if n=5

5 5 5 5 5 5 5 5 5
5 4 4 4 4 4 4 4 5
5 4 3 3 3 3 3 4 5
5 4 3 2 2 2 3 4 5
5 4 3 2 1 2 3 4 5
5 4 3 2 2 2 3 4 5
5 4 3 3 3 3 3 4 5
5 4 4 4 4 4 4 4 5
5 5 5 5 5 5 5 5 5


if n=6

6 6 6 6 6 6 6 6 6 6 6
6 5 5 5 5 5 5 5 5 5 6
6 5 4 4 4 4 4 4 4 5 6
6 5 4 3 3 3 3 3 4 5 6
6 5 4 3 2 2 2 3 4 5 6
6 5 4 3 2 1 2 3 4 5 6
6 5 4 3 2 2 2 3 4 5 6
6 5 4 3 3 3 3 3 4 5 6
6 5 4 4 4 4 4 4 4 5 6
6 5 5 5 5 5 5 5 5 5 6
6 6 6 6 6 6 6 6 6 6 6

 */