/*
1
2  3
4  5  6
7  8  9  10
11 12 13 14  15
*/
package com.company;
public class Pat8 {
    public static void main(String[] args) {
        int i,j,k=1,n=5;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print((k++)+" ");
            }
            System.out.println();
        }
    }
}
