package es.cide.programacion;

import java.util.Scanner;

public class Heroi {
    Scanner sc = new Scanner(System.in);

    private String nom0; //nombre del heroe
    private int vida = 10; // vida del heroe
    private boolean vivo = true;
    private String[] respuestas = { // respuestas para defenderse
            "Primero deberías dejar de usarla como un plumero",
            "Qué apropiado, tú peleas como una vaca",
            "Sí que las hay, sólo que nunca las has aprendido",
            "Ya te están fastidiando otra vez las almorranas, ¿Eh?",
            "Aargh.. ¿Y después que? ¿Te la comerás?.",
            "Me rendiría si eso me evitara tener que mirarte.",
            "Ugh... por eso te rascas con tanta saña. Que te vea un veterinario.",
    };

    public Heroi(String nom, int vida) { // constructor de heroe
        this.nom0 = nom; // guardamos el nombre
        this.vida = vida; // guardamos la vida
    }

    // respuestas para defenderse
    public String defensar() { // metodo defender
        boolean correcta = true;
        int eleccion;
        System.out.println("1: " + respuestas[0]);
        System.out.println("2: " + respuestas[1]);
        System.out.println("3: " + respuestas[2]);
        System.out.println("4: " + respuestas[3]);
        System.out.println("5: " + respuestas[4]);
        System.out.println("6: " + respuestas[5]);
        System.out.println("7: " + respuestas[6]);
        eleccion = sc.nextInt(); // la eleccion
        System.out.print("Has escogido: ");
        return respuestas[eleccion - 1]; // lo de dentro de los [] es la posicion del array introducida por el usuario,
                                         // es -1 porque el 0 no lo cuenta
    }

    public int getVidah() { // vida para el heroe
        this.vida = vida - 1;
        if (vida != 0) { // si es diferente a 0 sigue vivo
            return vida;
        } else if (vida == 0) { // si es igual a 0 esta muerto
            System.out.println("Estas muerto");
            vivo = false;
        }
        return vida;
    }

    public boolean vida(){
        return vivo;
    }
}