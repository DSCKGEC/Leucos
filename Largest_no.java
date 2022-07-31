package com.jainlodge;

import java.util.Scanner;

public class Largest_no {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input 3 nos. you wanna compare-");
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();
        int largest=a;
        if(b>largest)
            largest=b;
        else if(c>largest)
            largest=c;
        System.out.println("The largest no among 3 is :"+ largest);
    }
}
