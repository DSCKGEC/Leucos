package com.jainlodge;

import java.util.Scanner;

public class reverse_nos
{
    public static void main(String[] args)
    {
        System.out.println("enter your no:");
        Scanner sc=new Scanner(System.in);
        int x =sc.nextInt();
        int i=0;
        for(   ;x>=0;x--)
        {
            System.out.println(x);
        }
    }
}
