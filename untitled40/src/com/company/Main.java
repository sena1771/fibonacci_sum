package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
 0 + 1 = 1

 1 + 1 = 2

 1 + 2 = 3

 2 + 3 = 5

 3 + 5 = 8

 5 + 8 = 13

 13 + 8 = 21

 21 + 8 = 34
         */
        Scanner inp=new Scanner(System.in);
        int a=0,b=1,c;
        System.out.print(" The number of entries for Fibonacci: ");
        int n= inp.nextInt();
        for(int i=1;i<n;i++ ){
            c=a+b;
            System.out.print(a+"+"+b);
            System.out.print("=");
            System.out.print(c);
            System.out.println(" ");
            a=b;
            b=c;

        }
    }
}
