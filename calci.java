package com.jainlodge;

import java.util.Scanner;

public class calci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter the operation");
        char oper=sc.next().trim().charAt(0);
        System.out.println("Please Enter 2 numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(oper=='+' || oper=='-' ||oper=='*' || oper=='/' ||oper=='%')
        {

            if (oper=='+'){
                System.out.println(a+b);
            }
            if (oper=='-'){
                System.out.println(a-b);
            }
            if (oper=='*'){
                System.out.println(a*b);
            }
            if (oper=='/'){
                if (b==0)
                {
                    System.out.println("2nd number cannot be Zero");
                }
                else{
                    System.out.println(a/b);
                }
            }
            if (oper=='%'){
                System.out.println(a%b);
            }

        }
        else
        {
            System.out.println("Invalid operation");
        }
    }
}
