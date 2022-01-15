/*
    *****
   *****
  *****
 *****
*****
RHOMBUS IS TO BE PRINTED
HINT:-
THINK THIS AS A TRIANGLE OF SPACES AND THEN PRINTING SQUARE AFTER IT             
*/
package com.company;
public class HomPat1 {
    public static void main(String[] args) {
        int i,j,k,n=5;
        for(i=n;i>=1;i--){
            for(j=1;j<i;j++){
                System.out.print(" ");
            }
            for(k=1;k<=n;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
