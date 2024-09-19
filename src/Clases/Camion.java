package Clases;

import Interfaces.DeLujo;

public class Camion extends Vehiculo implements DeLujo {
    private int pesoMaximo;
    private int longitud;

    public Camion(String modelo, int precio, int pesoMaximo, int longitud) {
        super(modelo, precio);
        this.pesoMaximo = pesoMaximo;
        this.longitud = longitud;
    }

    public int getPesoMaximo() {
        return pesoMaximo;
    }

    public void setPesoMaximo(int pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    @Override
    public void mostrarVehiculo(){
        System.out.println("Modelo: " + getModelo());
        System.out.println("Precio: " + getPrecio());
        System.out.println("Carga maxima: " + getPesoMaximo() + " Kg");
        System.out.println("Longitud: " + getLongitud() + " metros");
    }

    @Override
    public void servicioVip(){
        System.out.println("El camion es lujoso y esta listo para prestar un servicio VIP");
    }
}
