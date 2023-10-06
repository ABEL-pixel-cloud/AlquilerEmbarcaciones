public class Yate extends Embarcacion implements Validacion {

    private int cantidadCamarotes;


    public Yate(double precio, double valorAdicional, int anioFabricacion, double longitud,int cantidadCamarotes,Capitan capitan) {
        super(precio, valorAdicional, anioFabricacion, longitud,capitan);
        this.cantidadCamarotes=cantidadCamarotes;
    }

    public boolean compraryate(){
        return true;
    }



    @Override
    public boolean validar() {
        return cantidadCamarotes>7;
    }
}
