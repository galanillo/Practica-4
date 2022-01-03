package taller;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Veh�culo {
	
	//Atributos
	private Scanner lector;
	private int id_vehiculo;
	public int capacidad_motor;
	public int almacenamiento;
	public int n_pasajeros;
	public String fecha;
	public String color;
	
	//Constructor
	
	public Veh�culo(Scanner lector, int id_vehiculo, int capacidad_motor, int almacenamiento, int n_pasajeros,
			String fecha, String color) {
		super();
		this.lector = lector;
		this.id_vehiculo = id_vehiculo;
		this.capacidad_motor = capacidad_motor;
		this.almacenamiento = almacenamiento;
		this.n_pasajeros = n_pasajeros;
		this.fecha = fecha;
		this.color = color;
	}
	
	public Veh�culo() {
		lector = new Scanner(System.in);
		System.out.println("Introduzca el c�digo del veh�culo: "); this.id_vehiculo = lector.nextInt();
		System.out.println("Introduzca la capacidad que tiene el motor: "); this.capacidad_motor = lector.nextInt();
		System.out.println("Introduzca la capacidad de alamacenamiento que tiene el vehiculo: "); this.almacenamiento = lector.nextInt();
		System.out.println("Introduzca el numero de pasajeros: "); this.n_pasajeros = lector.nextInt();
		System.out.println("Introduzca el color del veh�culo: "); this.color = lector.nextLine();
		System.out.println("Introduzca la fecha de entrada del veh�culo al taller: "); this.fecha = lector.nextLine();
		
	}

	//M�todos
	
	public static void altaVehiculo(LinkedHashSet <Veh�culo> vehiculos) { //
		
		Veh�culo v = new Veh�culo(); //Constructor de cliente
		vehiculos.add((Veh�culo)v);
		
	}

	public static void mostrarVehiculos(LinkedHashSet <Veh�culo> vehiculos) { //Muestra los clientes
		for(Veh�culo v : vehiculos) {
			System.out.println(v.toString(v));
		}
	}
	
	public String toString(Veh�culo v) { //String para meter en buclue de muestreo de clientes
		return "----------- VEH�CULO -----------\n\nCODIGO DE VEHICULO: "+v.getId_vehiculo()+"\nCapacidad del motor: "+v.getCapacidad_motor()+" CV.\nAlmacenamiento: "+v.getAlmacenamiento()+" kg.\nN� de pasajeros: "+v.getN_pasajeros()+"\n Color: "+v.getColor()+"\nFecha de entrada al taller: "+v.getFecha();
	}

	//Getters y setters
	
	public Scanner getLector() {
		return lector;
	}

	public int getId_vehiculo() {
		return id_vehiculo;
	}

	public void setId_vehiculo(int id_vehiculo) {
		this.id_vehiculo = id_vehiculo;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public void setLector(Scanner lector) {
		this.lector = lector;
	}

	public int getCapacidad_motor() {
		return capacidad_motor;
	}

	public void setCapacidad_motor(int capacidad_motor) {
		this.capacidad_motor = capacidad_motor;
	}

	public int getAlmacenamiento() {
		return almacenamiento;
	}

	public void setAlmacenamiento(int almacenamiento) {
		this.almacenamiento = almacenamiento;
	}

	public int getN_pasajeros() {
		return n_pasajeros;
	}

	public void setN_pasajeros(int n_pasajeros) {
		this.n_pasajeros = n_pasajeros;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
