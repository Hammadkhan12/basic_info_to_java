package com.company;

import java.util.Scanner;

public class if_else_program_pass_fail {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("inter your marks");
        float physics= sc.nextFloat();
        System.out.println("inter your marks");
        float maths= sc.nextFloat();
        System.out.println("inter your marks");
        float computer= sc.nextFloat();
        float total=(physics+computer+maths)/300f*100f;
        System.out.println(total);
        if (total>=40f){
            System.out.println("you are pass");
        }
        else{
            System.out.println("better luck next time");
        }
    }
}
