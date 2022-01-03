package taller;

import java.util.Scanner;

public class Comercial extends Usuario {
	
	//Atributos
	
	private String nombre;
	private float ofertaofrecida;
	
	//Constructor
	
	public Comercial(Scanner lector, String admin, String pass, String nombre, float ofertaofrecida) {
		super(admin, pass);
		this.nombre = nombre;
		this.ofertaofrecida = ofertaofrecida;
	}
	
	//Métodos
	
	
	
	//Getters y setters
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getOfertaofrecida() {
		return ofertaofrecida;
	}

	public void setOfertaofrecida(float ofertaofrecida) {
		this.ofertaofrecida = ofertaofrecida;
	}

}
