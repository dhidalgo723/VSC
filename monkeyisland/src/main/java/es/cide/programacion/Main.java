//Nombre --> Daniel Hidalgo
//DNI --> 13412280Z
//21 de noviembre de 2025

package es.cide.programacion;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ra = new Random();

        // creacion de variables
        boolean vivoh = true; // si el heroe sigue vivo
        boolean correcta; // si es correcta la pregunta
        int vidap; // vida del pirata
        int vidah = 10; // vida del heroe
        int rondas = 0; // rondas (lo toma como el numero de piratas que genera la isla)
        String nomp = ""; // el pirata elegido
        String nomh; // el nombre del heroe

        System.out.println("Introduce un nombre para tu personaje");
        Heroi h = new Heroi(nomh = sc.next(), vidah); // clase heroe
        Illa i = new Illa(); // clase isla
        rondas = i.getNumpirata(); // obtenemos el numero de piratas
        Pirata pelegido = i.vullUnPirata(ra.nextInt(rondas)); // inicializamos la variable pelegido para que no de error
                                                              // en el bucle
        System.out.println("Has llegado a la isla: " + i.getNomisla()); // muestra el nombre de la isla que hemos
                                                                          // llegado
        System.out.println();
        while (vivoh && rondas > 0) { // mientrasel heroe siga vivo y haya piratas
            pelegido = i.vullUnPirata(ra.nextInt(rondas)); // obtenemos un pirata
            nomp = pelegido.getNomPirata(); // lo convertimos en string para la clase pirata
            Pirata p = new Pirata(nomp, vidap = ra.nextInt(3) + 1); // creamos la clase pirata (dentro del bucle para
                                                                      // que se randomizen los insultos de los piratas)
            while (vidap > 0 && vivoh) { // mientras el heroe siga vivo y la vida del pirata no sea 0
                String ataque = p.insultar(); // ataque
                System.out.println(nomp + " " + ataque);
                System.out.println();
                String defensa = h.defensar(); // defensa del heroe
                System.out.println(defensa);
                System.out.println();
                correcta = p.replica(defensa); // es correcta?
                if (correcta) {
                    System.out.println("Ugh... has ganado por los pelos de mi loro");
                    vidap = p.getVidap(); // resta uno de vida al pirata si la acierta el heroe
                    System.out.println("La vida del pirata es de: " + vidap);
                    System.out.println("¿Sigue vivo el pirata?: " +p.vida());
                } else if (!correcta) {
                    System.out.println("¿Pero tu le das de beber a los peces?");
                    vidah = h.getVidah(); // resta uno de vida al heroe si falla el heroe
                    System.out.println("La vida del heroe es de: " + vidah);
                    System.out.println("¿Sigue vivo el heroe?: " +h.vida());
                }
                if (vidah <= 0) { // si la vida del heroe es 0 (muere) sale del bucle
                    System.out.println("Has muerto");
                    vivoh = false;
                }
            }
            rondas--; // resta uno al numero de piratas que aparecen en la isla (rondas)
        }

        if (vivoh) { // si sigue vivo el heroe gana
            System.out.println("Has ganado el juego ¡Enhorabuena!");
        } else if (!vivoh) { // si muere
            System.out.println("Has dado mas pena que respuestas");
        }
        sc.close();
    }
}