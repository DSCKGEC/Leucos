package com.jainlodge;

public class array_sum
{
    public static void main(String[] args)
    {
        float marks[]={99.0f,46.5f,47.0f,95.5f,91.5f};
        float sum=0;
        for(float element:marks)
        {
            sum=sum+element;
        }
        System.out.println(sum);
    }
}
