package com.transflower;

public class Hello{
    public static void main(String [] args){
        System.out.println("hi i am rutuja");

        // int arr[] = { 10, 20, 30, 40 };
        // //sum and average

        // int sum = 0;
        // for (int x : arr) {
        //     sum += x;
        // }

        // double average = sum / arr.length;
       
        // System.out.println("sum" + sum);

        // System.out.println("average" + average);


        // for (int i = arr.length - 1; i >= 0; i--) {
        //     System.out.println(arr[i] + "");
        // }

        // //max 
        // int Max = 0;
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] > Max)
        //         Max = arr[i];
        // }
        
        // System.out.println("max value " + Max);


        // //min    
        // int Min = arr[0];

        // for (int x : arr) {
        //     if (x < Min)
        //         Min = x;
        // }

        // System.out.println("min value" + Min);


        // //duplicate 

        // int[] arr = { 1, 2, 3, 2, 4, 1 };

        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = i + 1; j< arr.length; j++) {
        //         if (arr[i] == arr[j]) {
        //             System.out.println("Duplicate" + arr[i]);
        //             break;
        //         }
        //     }
        // }

        //abstraction
        abstract class vehicle{
            abstract void start();
        }    
        class car extends vehicle {
            void start() {
                System.out.println("car start by key");
            }
        }
    }
}

