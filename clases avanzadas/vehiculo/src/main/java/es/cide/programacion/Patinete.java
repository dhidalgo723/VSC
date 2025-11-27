package es.cide.programacion;

public class Patinete extends Vehicle implements Recargable {
    int bateria = 70;

    public Patinete(String matricula, String marca) {
        super(matricula, marca);
        this.matricula = matricula;
        this.marca = marca;
    }

    @Override
    public double calcularPreuLloguer(int dies) {
        return dies;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("--- FITXA VEHICLE ---");
        System.out.println("Marca: " + marca);
        System.out.println("Matrícula: " + matricula);
    }

    @Override
    public void carregarBateria() {

    }

    @Override
    public int getNivelBateria() {
        return bateria;

    }
}
