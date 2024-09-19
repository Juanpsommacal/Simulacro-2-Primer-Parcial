package Clases;

import Interfaces.DeLujo;

public class Taxi extends Vehiculo implements DeLujo {
    private String licenciaDeOperacion;
    private int capacidadPasajeros;

    public Taxi(String modelo, int precio, String licenciaDeOperacion, int capacidadPasajeros) {
        super(modelo, precio);
        this.licenciaDeOperacion = licenciaDeOperacion;
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public String getLicenciaDeOperacion() {
        return licenciaDeOperacion;
    }

    public void setLicenciaDeOperacion(String licenciaDeOperacion) {
        this.licenciaDeOperacion = licenciaDeOperacion;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    @Override
    public void mostrarVehiculo(){
        System.out.println("Modelo: " + getModelo());
        System.out.println("Precio: " + getPrecio());
        System.out.println("Licencia de Operacion: " + getLicenciaDeOperacion());
        System.out.println("Capacidad de Pasajeros: " + getCapacidadPasajeros());
    }

    @Override
    public void servicioVip(){
        System.out.println("El coche es lujoso y esta listo para prestar un servicio VIP");
    }
}
