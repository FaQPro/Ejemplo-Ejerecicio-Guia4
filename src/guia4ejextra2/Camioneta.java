
package guia4ejextra2;


public final class Camioneta extends Vehiculos{

    public Camioneta(String marca, String patente) {
        super(marca, patente);
    }

    @Override
    public void calcularCombustible(int km) {
        if(this.combustible > 0){
            this.combustible -= 0.10 * km;
        }
    }
    
    
    
}
