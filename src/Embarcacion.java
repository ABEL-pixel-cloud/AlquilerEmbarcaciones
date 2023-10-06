public class Embarcacion {

    private double Precio;
    private double ValorAdicional;
    private int AnioFabricacion;
    private double Longitud;
    private Capitan capitan;


    public Embarcacion(double precio, double valorAdicional, int anioFabricacion, double longitud,Capitan capitan) {
        Precio = precio;
        ValorAdicional = valorAdicional;
        AnioFabricacion = anioFabricacion;
        Longitud = longitud;
        this.capitan=capitan;

    }

    public double calcularMontoAlquiler() {
        double montoAlquiler = Precio;
        if (AnioFabricacion > 2020) {
            montoAlquiler += 20000;
        }
        return montoAlquiler;
    }





}
