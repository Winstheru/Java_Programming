package com.tutorial;

public class Main {

    public static void main(String[] args) {
	    //program untuk konversi nilai numbers

        int nilaiInt = 450; //32-bit
        System.out.println("nilai int = " + nilaiInt);

        // Memperluas rentang ke tipe data yang lebih besar
        long nilaiLong = nilaiInt;
        System.out.println("nilai long = " + nilaiLong); //jika pindah bit dari bit yang lebih kecil ke bit yang lebih besar maka aman

        // Memperkecil rentang ke tipe data yang lebih kecil
        //n.b : memperkecil tipe data dapat menghilangkan nilai tipe data, maksudnya adalah tipe data yang lebih kecil memiliki max value dan min value yang berbeda dari tipe data yang lebih besar sehingga hal ini perlu diperhatikan
        byte nilaiByte = (byte)nilaiInt; //nilaiInt harus kita ubah ke byte dulu agar setara, (byte) dinamakan casting operator
        System.out.println("nilai byte = " + nilaiByte);
        System.out.println("disini kamu bs liat klo nilai byte itu muter dari 127 ke -128 karena kapasitas max nilai byte adalah 127, 450 tidak muat");
        System.out.println("nilai max byte = " + Byte.MAX_VALUE);
        System.out.println("nilai min byte = " + Byte.MIN_VALUE);

        // casting pembagian
        float a = 10;
        int b = 4;

        float c = a/b;
        System.out.printf("%f / %d = %f\n",a,b,c);
        System.out.println("dengan salah satu tipe data bernilai float, int/float akan jadi float");

        System.out.println("cara lain biar gausa ubah tipe data x dan y \n");
        int x = 10;
        int y = 4;
        float z = (float)x/y;
        System.out.printf("%d / %d = %f\n",x,y,z);
        System.out.println("jadi kita casting dlu baru dibagi integer");
    }
}
