package es.cide.programacion;

public class CocheElectrico extends Coche implements Recargable {
    int bateria = 100;

    public CocheElectrico(String matricula, String marca, int plazas, double velocidadmax){
        super(matricula, marca, plazas, velocidadmax);
    }

    @Override
    public double calcularPreuLloguer(int dies){
        return dies;
    }

    @Override
    public void carregarBateria(){

    }
    
    @Override
    public int getNivelBateria(){
        return bateria;
    }
}
