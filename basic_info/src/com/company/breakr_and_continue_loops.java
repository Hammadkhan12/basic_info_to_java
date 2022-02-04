package com.company;

public class breakr_and_continue_loops {
    public static void main(String[] args) {
//        Break and continue using loops!
//         loops main breakr or continue ka basic kaam bhaot he simple hai
//         breake kise bhee loop ke iterration ko end krd deta hai vaheen jahan usko(loop) breake mila;
//         or continue sirf us iterration ko skip krta hai jahan usko(loop) continue mila;
//         
        for (int i=0;i<50;i++){
            System.out.println(i);
            System.out.println("Java is great");
            if(i==2){
                System.out.println("Ending the loop");
                break;
            }
        }
        int j=0;
       do{
           System.out.println(j);
            System.out.println("Java is great");
            if(j==2){
                System.out.println("Ending the loop");
                break;
            }
            j++;
        }while(j<5);
        System.out.println("Loop ends here");


            for(int i=0;i<50;i++){
            if(i==2){
                System.out.println("Ending the loop");
                continue;
            }
                System.out.println(i);
                System.out.println("Java is great");
      }
        int i=0;
        do{
            i++;
            if(i==2){
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is great");

        }while(i<5);
        System.out.println("Loop ends here");
    }
}
