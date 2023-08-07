
package guia4ejextra2;


public final class Combustible extends Viaje{
    
    private int precio;

    public Combustible(int precio, String tdCombustible) {
        super(tdCombustible);
        this.precio = precio;
    }
    
}
