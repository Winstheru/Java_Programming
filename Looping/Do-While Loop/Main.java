package com.tutorial;

public class Main {
    public static void main(String[] args){
//        do{
//            aksi;
//        }while(kondisi);

        System.out.println("Ini adalah awal program");
        int i = 0;
        boolean kondisi = true;
        do {
            System.out.println("Do while ke-" + i);
            i++;

            if(i == 10){
                kondisi = false;
            }
        }while(kondisi);
        System.out.println("Ini adalah akhir program");
    }
}
