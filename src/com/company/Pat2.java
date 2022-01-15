package com.company;
/*
    ****
    *  *
    *  *
    ****
    THIS TYPE OF PATTERN
*/
public class Pat2 {
        public static void main(String[] args) {
        int m=4;
        int n=4;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(j==1||i==1||i==n||j==m)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
