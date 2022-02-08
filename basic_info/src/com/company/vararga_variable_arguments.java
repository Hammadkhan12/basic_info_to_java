package com.company;


import java.util.Scanner;

//  agr tm ek ayse program bnare hoo method over loading ko lekr
//  jahan multiple input hai tw kia tm har dafa ayse input logae nahi na
//  ya pro-programmers nahi krte isse lea JDk ne hummen ya var-argas introduces krwaya hai
// aajao dekho kia hota hai ya!!!!
public class vararga_variable_arguments {
     static int add(int ...arr){
        int result=0;
        for (int a:arr){
           result = result +a ;
        }
        return  result;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("inter first numbers ");
        int num1=sc.nextInt();
        System.out.println("inter second numbers ");
        int num2=sc.nextInt();
         System.out.println("your number is "+add(num1,num2));

        System.out.println(add(51,54));
        System.out.println(add(51,54,84));
        System.out.println(add(51,54,98,65,84));
    }

}
