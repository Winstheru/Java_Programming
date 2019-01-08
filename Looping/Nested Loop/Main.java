package com.tutorial;

public class Main {
    public static void main(String[] args){
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        //bentuk tangga
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print("* ");
                if(i == j){
                    break;
                }
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        //tangga terbalik
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print("* ");
                if( (i+j) == 4){
                    break;
                }
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print("* ");
                if(i==j){
                    break;
                }else if( (i+j) == 8){
                    break;
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");

//        //problem
//        for(int i=0;i<9;i++){
//            for(int j=0;j<9;j++){
//
//                if( (i+j) >= 8){
//                    System.out.print("* ");
//
//                }else{
//                    System.out.print("  ");
//                }
//            }
//            System.out.print("\n");
//        }
//        System.out.println("ajo");
//        for(int i=0;i<9;i++){
//            for(int j=0;j<9;j++){
//                System.out.print(" ");
//                if( (i+j) >= 8){
//                    System.out.print("*");
//                }else{
//                    continue;
//                }
//            }
//            System.out.print("\n");
//        }

        //tangga terbalik
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if((i + j) < 4){
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.print("\n");
        }

        //tangga terbalik yg terbalik
        for(int i=0;i<5;i++){
            for(int j=5;j>0;j--){
                if((i + j) >= 6){
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        //bentuk diamond
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(" ");
                if((i + j) >= 4){
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }
        //bawahan bentuk diamond
        for(int i=0;i<5;i++){
            for(int j=5;j>0;j--){
                System.out.print(" ");
                if((i + j) <= 5){
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }
    }
}
