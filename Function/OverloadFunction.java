package com.tutorial;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //jika kita ingin tipe data parameter sesuka hati dengan fungsi yg sama tinggal, kita pakai overload function/method
        //fungsinya sama tp kita setting argumennya berbeda
        printAngka(10);
        printAngka(10.5f); //otomatis menggunakan tipe data yg cocok
        printAngka(4.5d); //otomatis menggunakan tipe data yg cocok

        System.out.println(jumlahAngka(4,5)); //method jumlahAngka
        System.out.println(jumlahAngka(4.5f,5)); //method jumlahAngka

        //1 nama method/fungsi bisa dipakai utk argumen yg berbeda2
        float hasilFloat = jumlahAngka(3,16.7f); //bisa jg gini
        printAngka(hasilFloat); //disini kita pakai method printAngka utk mencetak hasil dari method jumlahAngka

        //kita ambil input dari user lalu ditambah dengan method jumlahAngka
        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukkan nilai : ");
        int nilai1 = userInput.nextInt();
        int nilai2 = userInput.nextInt();
        int nilai3 = userInput.nextInt();
        System.out.println(jumlah3Angka(nilai1, nilai2, nilai3));
    }

    //menjumlahkan 3 angka integer
    private static int jumlah3Angka(int nilai1, int nilai2, int nilai3){
        return nilai1 + nilai2 + nilai3;
    }

    //ini untuk parameter ke-1 bertipe data float
    private static float jumlahAngka(float nilaiFloat1, int nilaiInt2){
        return nilaiFloat1 + nilaiInt2;
    }

    //ini untuk parameter ke-2 bertipe data float
    private static float jumlahAngka(int nilaiInt1, float nilaiFloat2){
        return nilaiInt1 + nilaiFloat2;
    }

    //ini utk parameter yg integer
    private static int jumlahAngka(int nilaiInt1, int nilaiInt2){
        return nilaiInt1 + nilaiInt2;
    }

    private static void printAngka(double nilaiDouble){
        System.out.println("angka ini adalah double = " + nilaiDouble);
    }

    private static void printAngka(float nilaiFloat){
        System.out.println("angka ini adalah float = " + nilaiFloat);
    }

    private static void printAngka(int nilaiInteger){
        System.out.println("angka ini adalah integer = " + nilaiInteger);
    }
}
