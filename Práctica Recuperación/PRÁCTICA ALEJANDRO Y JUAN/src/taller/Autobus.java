package taller;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Autobus extends Vehículo { //Hereda de vehiculo

    //Atributos

    private Scanner lector;
    protected String soporte_minusvalidos;


    //Constructor

    public Autobus(Scanner lector, int id_vehiculo, int capacidad_motor, int almacenamiento, int n_pasajeros,
        String fecha, String color, Scanner lector2, String soporte_minusvalidos) {
        super(lector, id_vehiculo, capacidad_motor, almacenamiento, n_pasajeros, fecha, color);
        lector = lector2;
        this.soporte_minusvalidos = soporte_minusvalidos;
    }
    public Autobus() {

        lector = new Scanner(System.in);
        System.out.println("\n\n¿Incorpora soporte para minusvalidos? (Y/N): ");
        this.soporte_minusvalidos = lector.nextLine();
    }

    //Métodos
    public static void CrearAutobus(LinkedHashSet <Vehículo> vehiculos) {

        Vehículo bus = new Autobus();
        vehiculos.add((Autobus)bus);

    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "\n\nAUTOBUS\n\nID Vehiculo: "+getId_vehiculo()+"\nAlmacenamiento: "+getAlmacenamiento()+"\nFecha: "+getFecha()+"\nNumero de pasajeros: "+getN_pasajeros()+"\nColor: "+getColor()+"\nCapacidad del motor: "+getCapacidad_motor()+"\nSoporte minusvalidos: "+getSoporte_minusvalidos();
    }

    //Getter y setters
    public String getSoporte_minusvalidos() {
        return soporte_minusvalidos;
    }

    public void setSoporte_minusvalidos(String soporte_minusvalidos) {
        this.soporte_minusvalidos = soporte_minusvalidos;
    }

    public Scanner getLector() {
        return lector;
    }

    public void setLector(Scanner lector) {
        this.lector = lector;
    }

}