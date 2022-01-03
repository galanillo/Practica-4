package taller;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Moto extends Vehículo {  //Hereda de vehiculo

    //Atributos
    private Scanner lector;
    protected String abs;
    protected String sidecar;

    //Constructor

    public Moto(Scanner lector, int id_vehiculo, int capacidad_motor, int almacenamiento, int n_pasajeros, String fecha,
            String color, Scanner lector2, String abs, String sidecar) {
        super(lector, id_vehiculo, capacidad_motor, almacenamiento, n_pasajeros, fecha, color);
        lector = lector2;
        this.abs = abs;
        this.sidecar = sidecar;
    }

    public Moto() {

        lector = new Scanner(System.in);
        System.out.println("\n\n¿Incorpora abs? (Y/N): ");
        System.out.println("\n\n¿Incorpora sidecar? (Y/N): ");
        this.abs = lector.nextLine();
        this.sidecar = lector.nextLine();
    }

    //Métodos
    public static void CrearMoto(LinkedHashSet <Vehículo> vehiculos) {

        Vehículo moto = new Moto();
        vehiculos.add((Moto)moto);

    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "\n\nMOTO\n\nID Vehiculo: "+getId_vehiculo()+"\nAlmacenamiento: "+getAlmacenamiento()+"\nFecha: "+getFecha()+"\nNumero de pasajeros: "+getN_pasajeros()+"\nColor: "+getColor()+"\nCapacidad del motor: "+getCapacidad_motor()+"\nSidecar: "+getSidecar()+"\nABS: "+getAbs();
    }


    //Getter y setters
    public String getAbs() {
        return abs;
    }

    public void setAbs(String abs) {
        this.abs = abs;
    }

    public String getSidecar() {
        return sidecar;
    }

    public void setSidecar(String sidecar) {
        this.sidecar = sidecar;
    }

    public Scanner getLector() {
        return lector;
    }

    public void setLector(Scanner lector) {
        this.lector = lector;
    }

}