package com.jainlodge;

public class factorial_recursion {
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);//Isme same eshe hi jo n ki value hogi utni baar call krta rahega factorial function ko...And jo bhi value return mai daali hai wo apne aap jisne mangi hai wahi par retun ho jaaegi...
        }
    }
        public static void main (String[]args){
            System.out.print(factorial(4));
        }
}

