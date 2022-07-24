package com.jainlodge;
import java.util.Scanner;

public class Sum_Using_Recursion {
    static int sum(int n)
    {
        if(n==1)
        {
            return 1;
        }
        else
        {
            return n+sum(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter your no.:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sum(n));
    }
}
