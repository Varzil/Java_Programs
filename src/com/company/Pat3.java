package com.company;
/*
1
12
123
1234
12345
THIS PATTERN IS TO BE FORMED
*/

public class Pat3 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            //OUTER LOOPS FOR LINES
            for(int j=1;j<=i;j++){
                //PRINTING NUMBERS ACCORDING TO LINES
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
