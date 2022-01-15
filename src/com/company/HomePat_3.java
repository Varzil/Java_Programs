/*
    1
   212
  32123
 4321234
*/
package com.company;
public class HomePat_3 {
    public static void main(String[] args) {
        int i,n=5,z=n-1;
        for(i=1;i<=n;i++){
            for(int j=1;j<=z;j++){
                System.out.print(" ");
            }
            for(int j=i-1;j>=1;j--){
                System.out.print(j);
            }
            for(int j=2;j<i;j++){
                System.out.print(j);
            }
            System.out.println();
            z--;
        }

    }
}
