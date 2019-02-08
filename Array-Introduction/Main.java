package com.tutorial;
import java.lang.reflect.Array;
import java.util.Arrays; //salah satu fungsi library ini utk mengubah nilai jd string supaya gampang output isi stringnya
public class Main {
    public static void main(String[] args) {
        //assignment
        //format : tipe_data[] nama_variable = {komponen, komponen}

        System.out.println("Assignment Array");
        int[] arrInteger = {1,2,3,4};
        System.out.println(arrInteger); //outputnya gajelas karena itu sebenarnya address di memory heap-nya. Memory heap memang tidak pasti lokasinya, berbeda dgn memori stack yg sudah pasti cthnya int b = 10; nah ini sudah jelas nilai b disimpan di memory stack

        arrInteger[2] = 10; //kita coba ubah nilai array indeks ke 2 menjadi 10
        System.out.println(arrInteger[0]);
        System.out.println(arrInteger[1]);
        System.out.println(arrInteger[2]);
        System.out.println(arrInteger[3]);

        //Deklarasi
        //format : tipe_data[] nama_variable = new int[jumlahArray]  <- ini karena array sebenarnya adalah object di java makanya pake "new"

        System.out.println("Deklarasi Array");
        float[] arrFloat = new float[5];
        arrFloat[2] = 10.5f; //kita coba ubah nilai array indeks ke 2 menjadi 10

        System.out.println(arrFloat[0]); //nilai default dari array kosong adalah 0
        System.out.println(arrFloat[1]);
        System.out.println(arrFloat[2]);
        System.out.println(arrFloat[3]);
        System.out.println(arrFloat[4]);

        System.out.println(Arrays.toString(arrInteger)); //cara mudah utk menampilkan isi array arrInteger
        System.out.println(Arrays.toString(arrFloat));

    }
}
