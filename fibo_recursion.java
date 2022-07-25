package com.jainlodge;

import java.util.Scanner;

public class fibo_recursion {
    static int fibo(int n){
        if (n==1||n==2)
        {
            return n-1;
        }
        else
        {
            return fibo(n-1)+fibo(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input the term of the Fibonacci which you wanna know :");
        int n=sc.nextInt();
        System.out.println(fibo(n));

    }
}
