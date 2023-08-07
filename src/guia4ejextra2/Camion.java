
package guia4ejextra2;


public final class Camion extends Vehiculos{

    public Camion(String marca, String patente) {
        super(marca, patente);
    }

    @Override
    public void calcularCombustible(int km) {
        if(this.combustible > 0){
            this.combustible -= 0.12 * km;
        }
    }
    
    
}
