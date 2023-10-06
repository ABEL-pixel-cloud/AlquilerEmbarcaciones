
import java.util.Random;

public class Capitan {
    Random random = new Random();
    private String nombre;
    private String apellido;
    private long matricula;

    public Capitan(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = (long) (random.nextDouble() * 9_000_000_000L) + 1_000_000_000L;
    }


    public String Matricula() {
        return "El capitan es: " + " : " + nombre +" : "+" apeliido "+" : "+apellido+" : "+"matricula"+" : "+matricula;
    }


}
