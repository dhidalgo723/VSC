package es.cide.programacion;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random ra = new Random();

        //variables
        String nomrob = "Clank";
        int energia = 70;
        int força = 15;
        int pruebas = 0;
        boolean cargado = true;
        String[] obs = {
                "Pedra",
                "Forat",
                "Mur",
                "Barranc",
                "Rampa"
        };

        Robot rob = new Robot(nomrob, energia, força); //objeto robot

        System.out.println("El nombre de tu robot es: " + nomrob);
        System.out.println("La energia de tu robot es de: " + energia + ", y su fuerza es de: " + força);

        String tipus = "";
        int dificultat = 0;

        Obstacle o = new Obstacle(tipus, dificultat); //objeto obstaculo

        for (int i = 0; i < obs.length; i++) { //bucle para que muestre cada obstaculo
            while (cargado) { //bucle para mientras siga teniendo energia el robot
                System.out.println("El obstaculo que te aparece es: " + obs[ra.nextInt(obs.length)]); //enseña un obstaculo del array
                System.out.println("¿Tu robot sigue teniendo energia?: " + rob.superarObstaculo(energia)); //devuelve true or false si tiene todavia energia
                energia = rob.getEnergia(); // la energia sera igual a la del objeto (la resta)
                System.out.println("La energia que te queda es: " + energia); // muestra la energia restante
                if (energia <= 0) { //si tiene menos que 0 sale del bucle
                    cargado = false;
                }
                pruebas++; //hace una suma de las pruebas que ha superado
            }
        }
        System.out.println("Obstaculos superados: " +pruebas); //muestra las pruebas superadas
        if (cargado) { //si sigue con energia ha ganado
            System.out.println("El robot ha conseguido superar todos los obstaculos");
        } else { //si no tiene energia pierde
            System.out.println("El robot no ha conseguido superar las pruebas");
        }

    }
}