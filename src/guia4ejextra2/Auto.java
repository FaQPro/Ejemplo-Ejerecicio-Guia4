// COMENTARIO AGREGADO
// comentario 2
//comentario de fede

package guia4ejextra2;


public final class Auto extends Vehiculos{

    public Auto(String marca, String patente) {
        super(marca, patente);
    }

    @Override
    public void calcularCombustible(int km) {
        if(this.combustible > 0){
            this.combustible -= 0.07 * km;
        }
    }

    
    
    
}
