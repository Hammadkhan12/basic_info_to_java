package com.company;


import java.math.BigInteger;
import java.util.Scanner;

public class result {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        Scanner input= new Scanner(System.in);
        System.out.println("enter your name");

        String name= input.nextLine();
        name=name.toUpperCase();
        System.out.println( name + " type your role number");
        BigInteger roll= scan.nextBigInteger();
        System.out.println("enter your marks");
        float pyhsics = scan.nextFloat();
        System.out.println("enter your marks");
        float chemistery = scan.nextFloat();
        System.out.println("enter your marks");
        float english = scan.nextFloat();
        System.out.println("enter your marks");
        float maths = scan.nextFloat();
        System.out.println("enter your marks");
        float computer = scan.nextFloat();
        if ( computer <=100){float total =(((pyhsics+computer+chemistery+english+maths)/500.0f)*100 );
            System.out.println("the total is");

            System.out.println(total);
        }
        else if ( pyhsics <=100){float total =(((pyhsics+computer+chemistery+english+maths)/500.0f)*100 );
            System.out.println("the total is");

            System.out.println(total);
        }
        else if ( chemistery <=100){float total =(((pyhsics+computer+chemistery+english+maths)/500.0f)*100 );
            System.out.println("the total is");

            System.out.println(total);
        }
        else if ( english <=100){float total =(((pyhsics+computer+chemistery+english+maths)/500.0f)*100 );
            System.out.println("the total is");

            System.out.println(total);
        }
        else if ( maths <=100){float total =(((pyhsics+computer+chemistery+english+maths)/500.0f)*100 );
            System.out.println("the total is");

            System.out.println();
        }
        else System.out.println("please enter right marks");







    }


}
