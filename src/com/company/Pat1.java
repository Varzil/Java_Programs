package com.company;

/*
****
****
****
****
THIS TYPE OF SIMPLE PATTERN IS FORMED
*/


class Pat1
{
    public static void main(String[] args) {
        //OUTER LOOP FOR VERTICLE COLUMNS
        for(int i=1;i<=4;i++){
            //INNER LOOP FOR HORIZONTAL ROWS
            for(int j=1;j<=4;j++)
            {
                System.out.print("*");
            }
            //AFTER EVERY ROW MAKE NEW IN NEXT LINE 
            System.out.println();
        }
    }     
    

}