package taller;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Furgoneta extends Vehículo {  //Hereda de vehiculo

    //Atributos
    private Scanner lector;
    protected String baca;

    //Constructor

    public Furgoneta(Scanner lector, int id_vehiculo, int capacidad_motor, int almacenamiento, int n_pasajeros,
        String fecha, String color, Scanner lector2, String baca) {
        super(lector, id_vehiculo, capacidad_motor, almacenamiento, n_pasajeros, fecha, color);
        lector = lector2;
        this.baca = baca;
    }

    public Furgoneta() {
        lector = new Scanner(System.in);
        System.out.println("\n\n¿Incorpora baca? (Y/N): ");
        this.baca = lector.nextLine();
    }

    //Métodos
    public static void CrearAutobus(LinkedHashSet <Vehículo> vehiculos) {

        Vehículo furgo = new Furgoneta();
        vehiculos.add((Furgoneta)furgo);

    }

    @Override
    public String toString() {
            // TODO Auto-generated method stub
        return "\n\nFURGONETA\n\nID Vehiculo: "+getId_vehiculo()+"\nAlmacenamiento: "+getAlmacenamiento()+"\nFecha: "+getFecha()+"\nNumero de pasajeros: "+getN_pasajeros()+"\nColor: "+getColor()+"\nCapacidad del motor: "+getCapacidad_motor()+"\nBaca: "+getBaca();
    }

    //Getter y setters

    public String getBaca() {
        return baca;
    }

    public void setBaca(String baca) {
        this.baca = baca;
    }

    public Scanner getLector() {
        return lector;
    }

    public void setLector(Scanner lector) {
        this.lector = lector;
    }

}