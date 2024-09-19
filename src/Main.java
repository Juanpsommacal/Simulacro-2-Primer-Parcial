import Clases.*;
import Servicios.ArregloVehiculos;

public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus("Mercedes", 50000, 80,false);
        Taxi taxi = new Taxi("Peugeot", 10000, "asd123", 4);
        MotoReparto motoReparto = new MotoReparto("Honda", 500, 20, true);
        Camion camion = new Camion("Mercedes", 80000, 14000, 15);
        Camion camion1 = new Camion("Volvo", 90000, 15000, 16);
        MotoReparto motoReparto1 = new MotoReparto("Blitz", 500, 5, false);
        Bus bus1 = new Bus("Mercedes", 90000, 150,true);

        ArregloVehiculos garage = new ArregloVehiculos();

        garage.agregarVehiculo(bus);
        garage.agregarVehiculo(taxi);
        garage.agregarVehiculo(motoReparto);
        garage.agregarVehiculo(camion);
        garage.agregarVehiculo(camion1);
        garage.agregarVehiculo(motoReparto1);
        garage.agregarVehiculo(bus1);

        garage.mostrarGarage();
        System.out.println("/n--------Aumentando todo------/n");
        garage.actualizarPrecios(10, 12, 8, 5, 15);
        garage.mostrarGarage();

    }
}