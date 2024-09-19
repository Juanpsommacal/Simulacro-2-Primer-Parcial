package Clases;

public class MotoReparto extends Vehiculo {
    private int capacidadCarga;
    private boolean baul;

    public MotoReparto(String modelo, int precio, int capacidadCarga, boolean baul) {
        super(modelo, precio);
        this.capacidadCarga = capacidadCarga;
        this.baul = baul;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public boolean isBaul() {
        return baul;
    }

    public void setBaul(boolean baul) {
        this.baul = baul;
    }

    @Override
    public void mostrarVehiculo(){
        System.out.println("Modelo: " + getModelo());
        System.out.println("Precio: " + getPrecio());
        System.out.println("Capacidad de carga: " + getCapacidadCarga() + " Kg");
        if(baul){
            System.out.println("Tiene baul");
        }
        else{
            System.out.println("No tiene baul");
        }
    }
}
