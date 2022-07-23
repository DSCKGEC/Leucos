package com.jainlodge;

public class max_in_the_array {
    public static void main(String[] args) {
        int [] arr = {1908, 2100, 987983, 45095, 985, 8934, 9867};
        int max = Integer.MIN_VALUE;
        for(int e: arr){
            if(e>max){
                max = e;
            }
        }
        System.out.println("the value of the maximum element in this array is: "+ max);

    }
}
