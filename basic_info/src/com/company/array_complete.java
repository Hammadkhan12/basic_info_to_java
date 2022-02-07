package com.company;

public class array_complete {
    public static void main(String[] args) {
//     ====================================arrays===========================================
//     ----------------------------2d arrays-------------------------------------

//        int [] marks; // A 1-D Array
//        int [][] flats; // A 2-D Array
//        flats = new int [2][3];
//        flats[0][0] = 101;
//        flats[0][1] = 102;
//        flats[0][2] = 103;
//        flats[1][0] = 201;
//        flats[1][1] = 202;
//        flats[1][2] = 203;
//
//        // Displaying the 2-D Array (for loop)
//        System.out.println("Printing a 2-D array using for loop");
//        for(int i=0;i<flats.length;i++){
//            for(int j=0;j<flats[i].length;j++) {
//                System.out.print(flats[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println("");
//        }
//-----------------------------------questions for arrays---------------------------------------
//    double [] marks={54.5,65,89,65,47};
//    double sum =0;
//    for (double elements:marks){
//        sum = sum + elements;
//    }
//        System.out.println("the sum is "+sum);

//---------------------------------------------------------------------------------------------------------
//        double [] marks={54.5,65,89,65,47};
//        double num= 89;
//        boolean isInArray = false;
//        for (double elements:marks) {
//            if (num == elements) {
//                isInArray = true;
//                break;
//            }
//        }
//        if (isInArray){
//            System.out.println("is in array");
//        }
//        else {
//            System.out.println("it is not");
//        }
//===========================================================================================================
//        double [] marks={54.5,65,89,65,47};
//          double sum =0;
//          for (double elements:marks){
//          sum = sum + elements;
//   }
//       System.out.println("the sum is "+sum/ marks.length);
        // Practice Problem 4
//        int [][] mat1 = {{1, 2, 3},
//                {4, 5, 6}};
//        int [][] mat2 = {{2, 6, 13},
//                {3, 7, 1}};
//        int [][] result = {{0, 0, 0},
//                {0, 0, 0}};
//
//        for (int i=0;i<mat1.length;i++){ // row number of times
//            for (int j=0;j<mat1[i].length;j++) { // column number of time
//                System.out.format(" Setting value for i=%d and j=%d\n", i, j);
//                result[i][j] = mat1[i][j] + mat2[i][j];
//            }
//        }
//
//        // Printing the elements of a 2-D Array
//        for (int i=0;i<mat1.length;i++){ // row number of times
//            for (int j=0;j<mat1[i].length;j++) { // column number of time
//                System.out.print(result[i][j] + " ");
//                result[i][j] = mat1[i][j] + mat2[i][j];
//            }
//            System.out.println(""); // Prints a new line
//        }
//
//        // Practice Problem 5
//        int [] arr = {1, 21, 3, 4, 5, 34, 67};
//        int l = arr.length;
//        int n = Math.floorDiv(l, 2);
//        int temp;
//
//        for(int i=0; i<n; i++){
//            // Swap a[i] and a[l-1-i]
//            // a   b   temp
//            // |4| |3| ||
//            temp = arr[i];
//            arr[i] = arr[l-i-1];
//            arr[l-i-1] = temp;
//        }
//
//        for(int element: arr){
//            System.out.print(element + " ");
//        }
//
//        // Practice Problem 6
//        int [] arr = {1, 2100, 3, 455, 5, 34, 67};
//        int max = Integer.MIN_VALUE;
//        for(int e: arr){
//            if(e>max){
//                max = e;
//            }
//        }
//        System.out.println("the value of the maximum element in this array is: "+ max);
//
//        // Practice Problem 6
//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(Integer.MAX_VALUE);
//        */
//        // Practice Problem 7
//        boolean isSorted = true;
//        int [] arr = {1, 12, 3, 4, 5, 34, 67};
//        for(int i=0;i<arr.length-1;i++){
//            if(arr[i] > arr[i+1]){
//                isSorted = false;
//                break;
//            }
//        }
//        if(isSorted){
//            System.out.println("The Array is sorted");
//        }
//        else{
//            System.out.println("The Array is not sorted");
//        }

    }
}
