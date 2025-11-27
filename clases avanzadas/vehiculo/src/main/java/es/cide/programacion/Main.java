//Daniel Hidalgo Mendez
//DNI --> 13412280Z
//27 de noviembre de 2025

package es.cide.programacion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String matricula = "4586-FXS";
        String marca = "BMW";
        int plazas = 5;
        double velocidadmax = 100;
        double capacitatDiposit = 100;
        int dies = 7;

        CocheCombustion cc = new CocheCombustion(matricula, marca, plazas, velocidadmax, capacitatDiposit);

        cc.calcularPreuLloguer(dies);

        CocheElectrico ce = new CocheElectrico(matricula, marca, plazas = 2, velocidadmax = 200);

        ce.calcularPreuLloguer(dies = 5);
        ce.carregarBateria();
        ce.getNivelBateria();

        Patinete pa = new Patinete(matricula, marca);

        pa.calcularPreuLloguer(dies = 3);
        pa.mostrarInfo();
        pa.carregarBateria();
        pa.getNivelBateria();

        sc.close();
    }
}