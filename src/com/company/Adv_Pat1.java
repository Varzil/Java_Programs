/*
BUTTERFLY PATTERN


*             *
* *         * * 
* * *     * * *  
* * * * * * * * 
* * * * * * * * 
* * *     * * *  
* *         * * 
*             *

*/
package com.company;
public class Adv_Pat1 {
    public static void main(String[] args) {
        System.out.println("BUTTERFLY PATTERN");
        int i,n=5;
        for(i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            int spaces= 2*(n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }


        for(i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            int spaces= 2*(n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }  
}
