import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new Vehiculo(" verde ", "toyota"));
        vehiculos.add(new Bus("Azul", "Mercedes", "Bus Escolar"));
        vehiculos.add(new Camioneta("Negro", "Ford", "Camioneta Familiar"));
    
    for(
        Vehiculo v:vehiculos
    ){
        v.acelerar();
    }
    }
}
