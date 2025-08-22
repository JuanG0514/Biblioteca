public class Camioneta extends Vehiculo {
    String nombre;

    public Camioneta(String color, String modelo, String nombre){
        super(color, modelo);
        this.nombre = nombre;
    }

    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("La camioneta esta acelerando");
    }


}