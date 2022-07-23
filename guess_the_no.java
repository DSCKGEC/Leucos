package com.jainlodge;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class guess_the_no
{
    public static void main(String[] args)
    {
        int myNumber= (int)(Math.random()*100);
        Scanner sc=new Scanner(System.in);
        int n=0;
        do{
            System.out.println("Please enter your guessed the no. between 1 to 100---");
            n=sc.nextInt();

            if(myNumber==n)
            {
                System.out.println("Woo Hoo !! correct Answer");
                break;
            }
            else if(n>myNumber)
            {
                System.out.println("No is too large");
            }
            else
            {
                System.out.println("No is too small");
            }
        }while (n>0);

        System.out.println("My Correct no was---");
        System.out.println(myNumber);


    }
}
