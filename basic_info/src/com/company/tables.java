package com.company;

import java.util.Scanner;

public class tables {
    public static void main(String[] args) {
        int num,multiplayer;

        System.out.println("inter number for tables");
        Scanner sc =new Scanner(System.in);
         num= sc.nextInt();

// condition for table pattren
        for (multiplayer =0;multiplayer <=10;++multiplayer){
// formate for table        
            System.out.println( num + "*" + multiplayer + "=" + num * multiplayer );

         }

    }
}
