public class Velero extends Embarcacion implements Validacion {

    private int cantidadMastiles;



    public Velero(double precio, double valorAdicional, int anioFabricacion, double longitud, Capitan capitan, int cantidadMastiles) {
        super(precio, valorAdicional, anioFabricacion, longitud, capitan);
        this.cantidadMastiles = cantidadMastiles;

    }

    public int getCantidadmastiles() {
        return cantidadMastiles;
    }

    @Override
    public boolean validar() {
        return cantidadMastiles > 4;
    }
}
