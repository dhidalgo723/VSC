package es.cide.programacion;

abstract class Coche extends Vehicle{
    protected int plazas;
    protected double velocidadmax;

    public Coche(String matricula, String marca, int plazas, double velocidadmax){
        super(matricula, marca);
        this.plazas = plazas;
        this.velocidadmax = velocidadmax;
    }

    protected double getVelocidadMaxima(){
        return velocidadmax;
    }
}
