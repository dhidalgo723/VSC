package es.cide.programacion;

import java.util.Random;

public class Obstacle {
    Random ra = new Random();
    private String tipus;
    private int dificultat = ra.nextInt(1, 10);

    public Obstacle(String tipus, int dificultat){ //constructor 1
        this.tipus = tipus;
        this.dificultat = dificultat;
    }

    public Obstacle(){ //constructor 2 (para la clase robot)
        
    }

    public int getDificultad(){ //devuelve la dificultad para la clase robot
        return dificultat;
    }

}
