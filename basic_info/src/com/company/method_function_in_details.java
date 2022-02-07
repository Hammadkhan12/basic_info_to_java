package com.company;

public class method_function_in_details {
//    Sometimes our program grows in size, and we want to separate
//    the logic of the main method from the other methods.
//    For instance, if we calculate the average of a number pair 5 times,
//    we can use methods to avoid
//    repeating the logic. [DRY – Don’t Repeat Yourself]
//    the main syntax is
//    ------------------------------------------------------------------------------


//    return type name of modifier (){
//    method body;
//    }


//        example
//        static int mysum(int a,int b);
//        int c= a+b;
//        return c;//return value
// in the above method int is tha return data type of the mysum function.
//    my sun takes tew parameters:like int a+int b:
//    the sum of tew values integer values (a and b)
//    is store in another int c;
//    my sum return c;
        static int logic ( int x, int y){
            int z;
            if (x > y) {
                z = x + y;
            } else {
                z = (x + y) * 5;
            }
            x = 566;
            return z;
        }

    public static void main(String[] args) {

            int a = 5;
            int b = 7;
            int c;
            // Method invocation using Object creation
            //cwh_31_methods obj = new cwh_31_methods();
            //c = obj.logic(a, b);
            c = logic(a, b);
            System.out.println(a + " " + b);
            int a1 = 2;
            int b1 = 1;
            int c1;
            c1 = logic(a1, b1);
            System.out.println(c);
            System.out.println(c1);
        }
    }
