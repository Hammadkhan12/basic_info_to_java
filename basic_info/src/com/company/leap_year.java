package com.company;

import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {
        int year;
        
        Scanner sc=new Scanner(System.in);
//        if the year is divided by 4
//        and the year is century
//         and year is divided by 400
//         then it is a leap year
//        else not
        System.out.println("Enter a year");
        year=sc.nextInt();
        if((year % 4 == 0 ) && (year % 100 != 0) || (year % 400 == 0)){
            System.out.println("Year is a leap year");
        }
        else{
            System.out.println("Year is not a leap year");
        }

    }
}
