package es.cide.programacion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num_pos = "45"; //numero positivo
        String num_dec = "3.5"; //numero decimal
        String si_o_no = "true"; //valor booleano
        String caracter = "A"; // para conversion a caracter

        System.out.println(num_pos); //imprimimos
        System.out.println(num_dec);
        System.out.println(si_o_no);
        System.out.println(caracter);

        int num;
        num = Integer.parseInt(num_pos); //transformacion a entero
        double dec;
        dec = Double.parseDouble(num_dec);//transformacion a double
        boolean yea;
        yea = Boolean.parseBoolean(si_o_no);//transformacion a booleano
        char car;
        car = caracter.charAt(0);//transformacion a caracter
        System.out.println(car);

        double suma;
        suma = num + dec; //suma
        System.out.println(suma); //imprimimos
        System.out.println(yea);
        System.out.println(Character.getNumericValue(car)); //conversion de caracter a codigo ascii


        sc.close();
    }
}