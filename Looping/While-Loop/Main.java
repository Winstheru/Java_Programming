package com.tutorial;

public class Main {
    public static void main(String[] args){
        int i = 0;
        boolean kondisi = true;

        System.out.println("awal program");
        while(kondisi){
            System.out.println("while loop ke - " + i);
            if(i == 10){
                kondisi = false;
            }else{
                i++;
            }
        }
        System.out.println("akhir program");
    }
}
