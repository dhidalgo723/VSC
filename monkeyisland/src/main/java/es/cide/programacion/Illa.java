package es.cide.programacion;

import java.util.Random;

public class Illa {
    Random ra = new Random();
    private String[] pirata = { // array de los piratas
            "Margit, el Augurio Caído dice:",
            "Ignacio Queso dice:",
            "Kaido, El que no puede morir dice:",
            "Blai, el Temido dice:",
            "Cervantes, el Manco de Lepanto dice:",
            "Henry, el Holandes Errante dice:",
            "El Pirata, Sin Nombre dice:"
    };
    private String[] isla = { // las islas que pueden salir
            "La Isla de las Tentaciones",
            "Aruba",
            "Balsa Botín"
    };

    private String nomisla; // nombre de la isla guardado en el random de el array de la isla randomizada
    private int numpirata; // numero de piratas
    private Pirata[] pirataelegido; // crea el array de los piratas escogidos para guardarlos en el for del
                                    // constructor
    private int vidap; //vida del pirata

    public Illa() {
        nomisla = isla[ra.nextInt(isla.length)]; // elige una isla aleatoria del array isla
        numpirata = ra.nextInt(5) + 3; // genera un numero entre 3 y 7 piratas
        for (int i = 0; i < numpirata; i++) { // guarda los piratas en el array pirataelegido, usa como posicion la "i"
                                              // para guardar en cada posicion del array, ademas creamos el objeto
                                              // "pirata" para que guarde un nombre de los piratas del array de los
                                              // piratas
            pirataelegido[i] = new Pirata(pirata[ra.nextInt(pirata.length)], vidap); //los guarda
        }
    }

    public String getNomisla() { // para tener la isla
        return nomisla;
    }

    public int getNumpirata() { // numero de los piratas
        return numpirata;
    }

    public Pirata vullUnPirata(int index) { // devuelve un pirata de los que estan en el array del pirataelegido
        return pirataelegido[index];
    }

}