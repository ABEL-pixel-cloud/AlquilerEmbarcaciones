import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion;
        do {

           System.out.println("ingrese la opcion:");
           System.out.println("opcion 1: alquilar yate");
           System.out.println("opcion 2: alquilar velero");
           System.out.println("opcion 3: comprar un yate");
           System.out.println("opcion 4: salir");
           Scanner sc=new Scanner(System.in);
           opcion= sc.nextInt();

           if (opcion==1){
               System.out.println("Ingrese el nombre del capitan: ");
               String cap= sc.next();
               System.out.println("Ingrese el apellido del captan: ");
               String apellido=sc.next();

               Capitan capitan = new Capitan(cap, apellido);
               System.out.println("Ingrese año de fabricacion del yate: ");
               int fabricacion= sc.nextInt();
               System.out.println("Ingrese la cantidad de camarotes: ");
               int camarotes=sc.nextInt();
               System.out.println("Ingrese la longitud del yate en metros:  ");
               int longitud=sc.nextInt();
               Yate yate=new Yate(15000,20000,fabricacion,longitud,camarotes,capitan);

               System.out.println("Datos del capitan: ");
               System.out.println(capitan.Matricula());
               System.out.println("Longitud del yate: ");
               System.out.println(longitud+" Metros");

               if (yate.validar()){
                   System.out.println(yate.validar());
                   System.out.println("El yate es de lugo");
               }else{
                   System.out.println(yate.validar());
                   System.out.println("El yate  no es muy lugoso");

               }
               System.out.println("Precio del alquiler del yate:");
               System.out.println(yate.calcularMontoAlquiler());




           } else if (opcion==2) {
               System.out.println("Ingrese el nombre del captan: ");
               String capi= sc.next();
               System.out.println("Ingrese el apellido del captan: ");
               String apellido_1=sc.next();
               Capitan capitan = new Capitan(capi, apellido_1);
               System.out.println("Ingrese año de fabricacion del velero: ");
               int fabricacion= sc.nextInt();
               System.out.println("Ingrese la cantidad de mastiles: ");
               int mastiles=sc.nextInt();
               System.out.println("Ingrese la longitud del velero en metros: : ");
               int veler=sc.nextInt();
               Velero velero=new Velero(10000,20000,fabricacion,veler,capitan,mastiles);
               System.out.println("Datos del capitan: ");
               System.out.println(capitan.Matricula());
               System.out.println("Longitud del velero en metros: ");
               System.out.println(veler+" Metros");
               if (velero.validar()){
                   System.out.println(velero.validar());
                   System.out.println("El velero es grande");
               }else{
                   System.out.println("El velero no es muy  grande");
                   System.out.println(velero.validar());

               }
               System.out.println("Precio del alquiler del velero:");
               System.out.println(velero.calcularMontoAlquiler());



           } else if (opcion==3) {
               Capitan capitan = new Capitan("juan", "payares");
               Yate yate=new Yate(15000,20000,2022,23,7,capitan);

               System.out.println("Quiere comprar un yate true:comprar false:no comprar");
               boolean comprar= sc.nextBoolean();
               if (yate.compraryate()==comprar){
                   System.out.println("ha comprado un yate");

               }else {
                   System.out.println("no se genero la compra");


               }

           } else if (opcion==4) {
               System.out.println("salir");


           } else{
               System.out.println("La opcion no existe");


           }

        }while(opcion!=4 );


    }
}