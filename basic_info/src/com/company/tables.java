package com.company;

import java.util.Scanner;

public class tables {
    public static void main(String[] args) {
        int num,multiplayer;

        System.out.println("inter number for tables");
        Scanner sc =new Scanner(System.in);
         num= sc.nextInt();

         for (multiplayer =0;multiplayer <=10;++multiplayer){
             System.out.println( num + "*" + multiplayer + "=" + num * multiplayer );

         }

    }
}
