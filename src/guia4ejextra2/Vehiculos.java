
package guia4ejextra2;


public abstract class Vehiculos{
    
    protected String marca;
    protected String patente;
    protected double combustible = 1000;

    public Vehiculos(String marca, String patente) {
        this.marca = marca;
        this.patente = patente;
    }

    public double getCombustible() {
        return combustible;
    }

    public void setCombustible(double combustible) {
        this.combustible = combustible;
    }
    
    public abstract void calcularCombustible(int km);
}
