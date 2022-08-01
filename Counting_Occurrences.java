package com.jainlodge;

public class Counting_Occurrences {
    public static void main(String[] args) {
        int n=658098788;
        int count=0;
        while (n>0)
        {
            int remainder=n%10;
            if(remainder==8)
            {
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}
