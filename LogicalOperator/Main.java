package com.tutorial;

public class Main {

    public static void main(String[] args) {
	    // Operator logika adalah operasi yg bs kita lakukan kepada tipe data boolean
        // AND, OR, XOR, NEGASI

        boolean a,b,c;
        //OR / atau '||'
        System.out.println("---OR (||)---");
        a = true;
        b = true;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c);
        a = true;
        b = false;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c);
        a = false;
        b = true;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c);
        a = false;
        b = false;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c);

        System.out.println("---AND (&&)---");
        a = true;
        b = true;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);
        a = true;
        b = false;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);
        a = false;
        b = true;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);
        a = false;
        b = false;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);

        System.out.println("---XOR (^)---"); //tanda topi ^ di Java artinya XOR
        a = true;
        b = true;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = true;
        b = false;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = false;
        b = true;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = false;
        b = false;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);

        System.out.println("---NOT (!)---");
        //negasi atau flipping
        a = true;
        c = !a;
        System.out.println(a + " --> (!) = " + c);

        a = false;
        c = !a;
        System.out.println(a + " --> (!) = " + c);
    }
}
