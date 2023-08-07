
package guia4ejextra2;

public class Viaje{
    
    private int origen;
    private int destino;
    private double distCiudades;
    private boolean mismaRuta;
    private Vehiculos vehiculos;
    protected String tdCombustible;
    private int peajes;

    public Viaje(int origen, int destino, double distCiudades, boolean mismaRuta, Vehiculos vehiculos, String tdCombustible, int peajes) {
        this.origen = origen;
        this.destino = destino;
        this.distCiudades = distCiudades;
        this.mismaRuta = mismaRuta;
        this.vehiculos = vehiculos;
        this.tdCombustible = tdCombustible;
        this.peajes = peajes;
    }

    public Viaje(int origen, int destino, Vehiculos vehiculos, String tdCombustible, int peajes) {
        this.origen = origen;
        this.destino = destino;
        this.vehiculos = vehiculos;
        this.tdCombustible = tdCombustible;
        this.peajes = peajes;
    }

    
    
    

    public Viaje(String tdCombustible) {
        this.tdCombustible = tdCombustible;
    }

    public int getOrigen() {
        return origen;
    }

    public void setOrigen(int origen) {
        this.origen = origen;
    }

    public int getDestino() {
        return destino;
    }

    public void setDestino(int destino) {
        this.destino = destino;
    }

    public double getDistCiudades() {
        return distCiudades;
    }

    public void setDistCiudades(double distCiudades) {
        this.distCiudades = distCiudades;
    }

    public boolean isMismaRuta() {
        return mismaRuta;
    }

    public void setMismaRuta(boolean mismaRuta) {
        this.mismaRuta = mismaRuta;
    }

    public Vehiculos getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(Vehiculos vehiculos) {
        this.vehiculos = vehiculos;
    }

    public String getTdCombustible() {
        return tdCombustible;
    }

    public void setTdCombustible(String tdCombustible) {
        this.tdCombustible = tdCombustible;
    }

    public int getPeajes() {
        return peajes;
    }

    public void setPeajes(int peajes) {
        this.peajes = peajes;
    }

    public void mRuta(){
        if(mismaRuta){
            System.out.println("El km de la ciudad de origen es " + origen);
            System.out.println("El km de la ciudad de destino es " + destino);
        }else{
            System.out.println("La distancia de las dos ciudades es de " + distCiudades);
        }
    }
    
    public double calculoDistancia(){
        
        if(origen > destino){
            return origen - destino;
        }else{
            return destino - origen;
        }
        
    }
    
    public double calculoPeajes(Vehiculos vehiculo){
        int a = 0;
        if(vehiculo instanceof Camion){
            a = peajes * 225;
        }else{
            a = peajes * 150;
        }
        return a;
    }
    
    
    
    public double calculoCombustible(Vehiculos vehiculo){
        
        double a = 0;
        
        if("Super".equalsIgnoreCase(this.tdCombustible)){
            a = 184;
        }else if("Gasoil".equalsIgnoreCase(this.tdCombustible)){
            a = 198;
        }else if("Premium".equalsIgnoreCase(this.tdCombustible)){
            a = 232;
        }else{
            a = 278;
        }
        
        
        
        if(vehiculo instanceof Auto){
            a = a * (calculoDistancia() / 12);
        }else if(vehiculo instanceof Camioneta){
            a = a * (calculoDistancia() / 15);
        }else if(vehiculo instanceof Camion){
            a = a * (calculoDistancia() / 6);
        }
        
        return Math.floor(a);
    }

    public void calculoTotal(Vehiculos vehiculo){
        double a = 0;
        a = calculoPeajes(vehiculo) + calculoCombustible(vehiculo);
        System.out.println("El total del costo de todo el viaje es " + a);
    }
    
    
}
