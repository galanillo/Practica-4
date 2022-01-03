package taller;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Ficha_General extends Cliente{
	
	//Atributos
	
	private Scanner lector;
	
	protected String marca;
	protected String modelo;
	protected String matricula;
	protected String motivo;
	protected String formulario;
	protected String idficha;
	
	//Constructor general

	public Ficha_General(Scanner lector, String admin, String pass, Scanner lector2, String codigocliente,
			String nombre, String apellidos, String dni, String direccion, String confirmacion, String estado,
			Scanner lector3, String marca, String modelo, String matricula, String motivo, String formulario,
			String idficha) {
		super(lector, admin, pass, lector2, codigocliente, nombre, apellidos, dni, direccion, confirmacion, estado);
		lector = lector3;
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
		this.motivo = motivo;
		this.formulario = formulario;
		this.idficha = idficha;
	}
	
	public Ficha_General(){
		
		lector = new Scanner(System.in);
		
		System.out.println("\nId de la ficha: "); this.idficha = lector.nextLine();
		System.out.println("\nMarca del vehiculo"); this.marca = lector.nextLine();
		System.out.println("\nModelo: "); this.modelo = lector.nextLine();
		System.out.println("\nMatricula: "); this.matricula = lector.nextLine();
		System.out.println("\nMotivo: "); this.motivo = lector.nextLine();
		System.out.println("\nFormulario: "); this.formulario = lector.nextLine();
	}
	

	//Métodos
	
	public static void altaFichaGeneral(LinkedHashSet <Ficha_General> fichas) { // Añadir una nueva ficha
		
		Cliente c=new Ficha_General(); //Constructor de Cliente
		fichas.add((Ficha_General)c);
		
	}
	
	public static void mostrarFichas(LinkedHashSet <Ficha_General> fichas) { //Muestra las fichas existentes con ese cliente
		for(Ficha_General f : fichas) {
			System.out.println(f.toString(f));
		}
	}
	
	public String toString(Ficha_General f) { //String para meter en buclue de muestreo de clientes
		return "\n----------- FICHAS GENERALES -----------\nMarca de coche: "+f.getMarca() +"\nModelo: "+f.getModelo()+"\nMatricula: "+f.getMatricula()+"\n Motivo de reparación/consulta: "+f.getMotivo()+"\nFormulario: "+f.getFormulario()+"\n\n" ;
	}
	
	public static void consultarFichas(Ficha_General f) {
		
		System.out.println(f.toString(f)); //Consultar fichas

	}
	public void modificarFichas(Ficha_General f) { //Editar una ficha
		
		lector = new Scanner(System.in);
		System.out.println("\nMarca de coche:"); f.setNombre(lector.nextLine()); 
		System.out.println("\nModelo: "); f.setNombre(lector.nextLine());
		System.out.println("\nMatricula: "); f.setDni(lector.nextLine());
		System.out.println("\nMotivo de reparacion/cansulta: "); f.setDireccion(lector.nextLine());
		System.out.println("\nFormulario: "); f.setConfirmacion(lector.nextLine());
		System.out.println("\nEstado: "); f.setEstado(lector.nextLine());
		
	}
	
	//Getters & Setters

	public Scanner getLector() {
		return lector;
	}

	public void setLector(Scanner lector) {
		this.lector = lector;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public String getFormulario() {
		return formulario;
	}

	public void setFormulario(String formulario) {
		this.formulario = formulario;
	}
	

	



	

}
