package es.cide.programacion;

import java.util.Scanner;

public class mein {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // variables e imprimimos cada una
        byte b = 0;
        System.out.println(b);
        short s = 0;
        System.out.println(s);
        int e = 0;
        System.out.println(e);
        long l = 0;
        System.out.println(l);
        float f = 0;
        System.out.println(f);
        double d = 0;
        System.out.println(d);
        char c = 'a';
        System.out.println(c);
        boolean bo = true;
        System.out.println(bo);

        String by = Byte.toString(b); // conversion de byte a string
        System.out.println(by);
        String sh = Short.toString(s);// conversion de short a string
        System.out.println(sh);
        String in = Integer.toString(e);// conversion de entero a string
        System.out.println(in);
        String lo = Long.toString(l); // conversion de long a string
        System.out.println(lo);
        String fl = Float.toString(f);// conversion de float a string
        System.out.println(fl);
        String dou = Double.toString(d);// conversion de double a string
        System.out.println(dou);

        int ascii = (int) c; // conversion de caracter a entero para el codigo ascii
        System.out.println(ascii);

        String boo = Boolean.toString(bo); // convesion de booleano a string
        System.out.println(boo);

        sc.close();
    }
}
