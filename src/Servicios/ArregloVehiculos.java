package Servicios;

import Clases.*;
import Interfaces.DeLujo;

import java.util.ArrayList;

public class ArregloVehiculos {
    private ArrayList<Vehiculo> garage;

    public ArregloVehiculos(){
        this.garage = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo vehiculo){
        garage.add(vehiculo);
    }

    public void mostrarGarage(){
        for (Vehiculo vehiculo : garage){
            System.out.println("----- Vehiculo N." + (garage.indexOf(vehiculo) +1) + " -----");
            vehiculo.mostrarVehiculo();
        }
    }

    public void actualizarPrecios(int aumentoCamion, int aumentoBus, int aumentoTaxi, int aumentoMotoReparto, int aumentoLujo){
        for(Vehiculo vehiculo : garage){
            if(vehiculo instanceof Camion){
                int nuevoPrecio = vehiculo.getPrecio();
                nuevoPrecio = nuevoPrecio + nuevoPrecio * aumentoCamion / 100;
                vehiculo.setPrecio(nuevoPrecio);
            } else if (vehiculo instanceof Bus){
                int nuevoPrecio = vehiculo.getPrecio();
                nuevoPrecio = nuevoPrecio + nuevoPrecio * aumentoBus / 100;
                vehiculo.setPrecio(nuevoPrecio);
            } else if (vehiculo instanceof Taxi){
                int nuevoPrecio = vehiculo.getPrecio();
                nuevoPrecio = nuevoPrecio + nuevoPrecio * aumentoTaxi / 100;
                vehiculo.setPrecio(nuevoPrecio);
            } else if (vehiculo instanceof MotoReparto) {
                int nuevoPrecio = vehiculo.getPrecio();
                nuevoPrecio = nuevoPrecio + nuevoPrecio * aumentoMotoReparto / 100;
                vehiculo.setPrecio(nuevoPrecio);
            }
            if(vehiculo instanceof DeLujo) {
                int nuevoPrecio = vehiculo.getPrecio();
                nuevoPrecio = nuevoPrecio + nuevoPrecio * aumentoLujo / 100;
                vehiculo.setPrecio(nuevoPrecio);
            }
        }

    }
}
