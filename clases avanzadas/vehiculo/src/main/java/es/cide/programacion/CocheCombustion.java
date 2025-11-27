package es.cide.programacion;

public class CocheCombustion extends Coche{
    protected double capacitatDiposit;

    public CocheCombustion(String matricula, String marca, int plazas, double velocidadmax, double capacitatDiposit){
        super(matricula, marca, plazas, velocidadmax);
        this.capacitatDiposit = capacitatDiposit;
    }

    @Override
    public double calcularPreuLloguer(int dies){
        return dies;
    }

}
