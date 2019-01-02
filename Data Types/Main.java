package com.tutorial;
//variable adalah tempat menaruh data
public class Main {
    public static void main(String[] args){
        int x = 10;
        System.out.println("Nilai x = " + x + "\n");

        //utk tipe data
        //tipe data primitif di Java adalah tipe data yg memiliki nilai fixed alias punya nilai maks dan min, cthnya yang dibawah ini
        //di java tidak ada tipe unsigned

        //integer
        int i = 10;
        System.out.println("====Integer===");
        System.out.println("Nilai integer i = " + (i));
        System.out.println("Nilai max = " + Integer.MAX_VALUE);
        System.out.println("Nilai min = " + Integer.MIN_VALUE);
        System.out.println("Besar Integer = " + Integer.BYTES + " bytes");
        System.out.println("Besar Integer = " + Integer.SIZE + " bit");

        byte b = 10;
        System.out.println("====BYTE===");
        System.out.println("Nilai Byte b = " + b);
        System.out.println("Nilai max = " + Byte.MAX_VALUE);
        System.out.println("Nilai min = " + Byte.MIN_VALUE);
        System.out.println("Besar Byte = " + Byte.BYTES + " bytes");
        System.out.println("Besar Byte = " + Byte.SIZE + " bit");

        short s = 10;
        System.out.println("====SHORT===");
        System.out.println("Nilai short s = " + s);
        System.out.println("Nilai max = " + Short.MAX_VALUE);
        System.out.println("Nilai min = " + Short.MIN_VALUE);
        System.out.println("Besar Short = " + Short.BYTES + " bytes");
        System.out.println("Besar Short = " + Short.SIZE + " bit");

        long l = 10L;
        System.out.println("====LONG===");
        System.out.println("Nilai Long l = " + l);
        System.out.println("Nilai max = " + Long.MAX_VALUE);
        System.out.println("Nilai min = " + Long.MIN_VALUE);
        System.out.println("Besar Long = " + Long.BYTES + " bytes");
        System.out.println("Besar Long = " + Long.SIZE + " bit");

        float f = 10.8F;
        System.out.println("====FLOAT===");
        System.out.println("Nilai Float f = " + f);
        System.out.println("Nilai max = " + Float.MAX_VALUE);
        System.out.println("Nilai min = " + Float.MIN_VALUE);
        System.out.println("Besar Float = " + Float.BYTES + " bytes");
        System.out.println("Besar Float = " + Float.SIZE + " bit");

        double d = -10.5d;
        System.out.println("====DOUBLE===");
        System.out.println("Nilai Double d = " + d);
        System.out.println("Nilai max = " + Double.MAX_VALUE);
        System.out.println("Nilai min = " + Double.MIN_VALUE);
        System.out.println("Besar Double = " + Double.BYTES + " bytes");
        System.out.println("Besar Double = " + Double.SIZE + " bit");

        char c = 'c';
        System.out.println("====CHAR===");
        System.out.println("Nilai Char = " + c);
        System.out.println("Nilai max = " + Character.MAX_VALUE);
        System.out.println("Nilai min = " + Character.MIN_VALUE);
        System.out.println("Besar Char = " + Character.BYTES + " bytes");
        System.out.println("Besar Char = " + Character.SIZE + " bit");

        boolean val = true; //nilai boolean itu 1 bit aja
        System.out.println("====BOOLEAN===");
        System.out.println("Nilai Val = " + val);
        System.out.println("Nilai max = " + Boolean.TRUE);
        System.out.println("Nilai min = " + Boolean.FALSE);

        //string termasuk tipe data High Level karna ukurannya bs berubah2 bs text, kalimat
    }
}
