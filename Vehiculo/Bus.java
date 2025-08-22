class Bus extends Vehiculo {
   
    String nombre;

    public Bus(String color, String modelo, String nombre){
        super(color, modelo);
        this.nombre = nombre;
    }

    public  void mostrarInformacion(){
        super.mostrarInformacion();
            System.out.println("El nombre del carro es "+ nombre);
        
    }

    public void acelerar(){
        System.out.println("El bus esta acelerando....");
    }


}