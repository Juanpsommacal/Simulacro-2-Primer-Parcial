package Clases;

public class Bus extends Vehiculo {
    private int capacidadPasajeros;
    boolean dosPisos;

    public Bus(String modelo, int precio, int capacidadPasajeros, boolean dosPisos) {
        super(modelo, precio);
        this.capacidadPasajeros = capacidadPasajeros;
        this.dosPisos = dosPisos;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public boolean isDosPisos() {
        return dosPisos;
    }

    public void setDosPisos(boolean dosPisos) {
        this.dosPisos = dosPisos;
    }

    @Override
    public void mostrarVehiculo() {
        System.out.println("Modelo: " + getModelo());
        System.out.println("Precio: " + getPrecio());
        System.out.println("Carga maxima: " + getCapacidadPasajeros() + " pasajeros");
        if(dosPisos){
            System.out.println("Bus de 2 pisos");
        }
        else{
            System.out.println("Bus de 1 piso");
        }
    }
}
