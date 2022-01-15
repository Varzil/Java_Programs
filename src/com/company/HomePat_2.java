/*
   1
  2 2
 3 3 3
4 4 4 4
*/
package com.company;
public class HomePat_2 {
    public static void main(String[] args) {
        int i,j,n=5,z=n-1;
        for(i=1;i<=n;i++){
            for(j=1;j<=z;j++){
                System.out.print(" ");            
            }
            for(int k=1;k<=i;k++){
                System.out.print(i+" ");
            }
            System.out.println();
            --z;
        }
    }
}