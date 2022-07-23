package com.jainlodge;

public class swap_array {
    public static void main(String[] args)
    {
        int [] arr = {21,232,453,54,756,65};
        int l=arr.length;
        int n=Math.floorDiv(l, 2);//ye hamko integer no dega jo bhi divide hokar bachega.
        int temp;
        for(int i=0;i<n;i++)
        {
            temp=arr[i];// temp isliye banaya hai taaki jo pehla no hoga wo phele temo mai store hoga then last wla 1st mai chala jaaega and temp wala last mai similarly eshe hi saare respectively honge.
            arr[i]=arr[l-i-1];
            arr[l-i-1]=temp;
        }
        for (int element:arr)
        {
            System.out.print(element+ " ");
        }
    }
}
