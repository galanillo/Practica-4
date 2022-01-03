package taller;

import java.util.Scanner;

public class Mec�nico extends Usuario {

	//Atributos
	private float sueldo;
	private String nombre;
	private String dni;
	
	//Constructor
	public Mec�nico(Scanner lector, String admin, String pass, float sueldo, String nombre, String dni) {
		super(admin, pass);
		this.sueldo = sueldo;
		this.nombre = nombre;
		this.dni = dni;
	}
	//M�todos
	
	
	//Getters y setters
	public float getSueldo() {
		return sueldo;
	}
	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	

}
