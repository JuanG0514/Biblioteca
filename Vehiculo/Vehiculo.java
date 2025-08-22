public class Vehiculo {
    private String color;
    private String modelo;

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

      public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

     public void mostrarInformacion(){
        System.out.println("El color del carro es " + color + "y el modelo es " + modelo);
    }

     void acelerar(){
        System.out.println("El vehiculo esta arrancando");

     }

     public Vehiculo(String color, String modelo){
        this.color = color;
        this.modelo = modelo;
     }

}
   