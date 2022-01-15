/*
12345
1234
123
12
1
THIS PATTERN IS TO BE PRINTED
*/
package com.company;
public class Pat7 {
    public static void main(String[] args) {
        int i,j;
        int n=5;
        for(i=n;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }   
}
