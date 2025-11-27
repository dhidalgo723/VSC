package es.cide.programacion;

public class Robot {
    private Obstacle o = new Obstacle(); //objeto obstaculo para el getDificultad
    //variables
    private String nom;
    private int energia0;
    private int força;
    private boolean cargado;

    public Robot(String nom, int energia, int força){
        this.nom = nom;
        this.energia0 = energia;
        this.força = força;
    }

    public boolean superarObstaculo(int energia1){ //devuelve true si sigue teniendo energia el robot
        this.energia0 = energia1;
        energia1 = energia1 - o.getDificultad() * 2;
        if(energia1>0){ // si tiene mas de 0 devuelve true
            cargado = true;
        } else{ //si tiene otra cosa devuelve false
            cargado = false;
        }
        return cargado;
    }

    public int getEnergia(){ //devuelve la energia que tiene el robot
        energia0 = energia0 - o.getDificultad() * 2;
        return energia0;
    }

}
