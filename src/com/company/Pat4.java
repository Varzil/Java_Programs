/*
    1
   12
  123
 1234
12345
PRINT THIS PATTERN      
*/
package com.company;

public class Pat4 {
    public static void main(String[] args) {
        int i, j, k, n = 5, z = 4;
        //OUTER LINES
        for (i = 1; i <= n; i++) {
            //SPACES
            for (j = 1; j <= z; j++) {
                System.out.print(" ");
            }
            //NUMBERS
            for (k = 1; k <= i; k++) {
                System.out.print(k);
            }
            --z;//SPACES DECREASES WITH DEPTH
            System.out.println();
        }
    }
}
