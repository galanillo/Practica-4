package taller;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Coche extends Vehículo {  //Hereda de vehiculo

	//Atributos
	private Scanner lector;
	
	protected String descapotable;
	protected String traccion_trasera;
	protected String luces_xenon;
	
	//Constructor
	
	public Coche(Scanner lector, int id_vehiculo, int capacidad_motor, int n_pasajeros, int almacenamiento,
		String fecha, String color, Scanner lector2, String descapotable, String traccion_trasera,
		String luces_xenon) {
		super(lector, id_vehiculo, capacidad_motor, almacenamiento, n_pasajeros, fecha, color);
		lector = lector2;
		this.descapotable = descapotable;
		this.traccion_trasera = traccion_trasera;
		this.luces_xenon = luces_xenon;
	}
	public Coche() {
		lector = new Scanner(System.in);
		
		System.out.println("Descapotable(Y/N): ");
		descapotable = lector.nextLine();
		
		System.out.println("Traccion trasera(Y/N): ");
		this.traccion_trasera = lector.nextLine();
		
		System.out.println("Luces_xenon(Y/N): ");
		this.luces_xenon = lector.nextLine();
	}
	
	//Métodos

	public static void CrearCoche(LinkedHashSet <Vehículo> vehiculos) {
		
		Vehículo v = new Coche();
		vehiculos.add((Coche)v);
		
	}
	
	public String toString() { 
		// TODO Auto-generated method stub
		return "\n\nCOCHE\n\nID Vehiculo: "+getId_vehiculo()+"\nAlmacenamiento: "+getAlmacenamiento()+"\nFecha: "+getFecha()+"\nNumero de pasajeros: "+getN_pasajeros()+"\nColor: "+getColor()+"\nDescapotable: "+getDescapotable()+"\nTraccion trasera: "+getTraccion_trasera()+"\nLuces xenon: "+getLuces_xenon()+"\nCapacidad del motor: "+getCapacidad_motor();
	}
	

	//Getter y setters
	
	public String getDescapotable() {
		return descapotable;
	}

	public void setDescapotable(String descapotable) {
		this.descapotable = descapotable;
	}

	public String getTraccion_trasera() {
		return traccion_trasera;
	}

	public void setTraccion_trasera(String traccion_trasera) {
		this.traccion_trasera = traccion_trasera;
	}

	public String getLuces_xenon() {
		return luces_xenon;
	}

	public void setLuces_xenon(String luces_xenon) {
		this.luces_xenon = luces_xenon;
	}

	public Scanner getLector() {
		return lector;
	}

	public void setLector(Scanner lector) {
		this.lector = lector;
	}

	
}