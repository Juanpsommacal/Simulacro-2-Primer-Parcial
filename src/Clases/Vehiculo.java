package Clases;
public abstract class Vehiculo {
    private String modelo;
    private int precio;
    
    public Vehiculo(String modelo, int precio){
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public abstract void mostrarVehiculo();
}
