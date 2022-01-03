package taller;

import java.util.LinkedHashSet;
import java.util.Scanner;

import taller.Cliente;
import taller.Usuario;

public class Cliente extends Usuario { //Hereda de usuario
	
	//Atributos
	
	private Scanner lector;
	private String codigocliente;
	private String nombre;
	private String apellidos;
	private String dni;
	private String direccion;
	public String confirmacion;
	protected String estado;
	
	// Constructores

	
	public Cliente(Scanner lector, String admin, String pass, Scanner lector2, String codigocliente, String nombre,
			String apellidos, String dni, String direccion, String confirmacion, String estado) {
		super(admin, pass);
		lector = lector2;
		this.codigocliente = codigocliente;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.direccion = direccion;
		this.confirmacion = confirmacion;
		this.estado = estado;
	}

	public Cliente() { //Contructor del código del cliente
		
		lector = new Scanner(System.in);
		System.out.println("Introduzca el código del cliente: ");
		this.codigocliente = lector.nextLine();
		System.out.println("\nNombre completo: "); 
		System.out.println("\nNombre:"); this.nombre = lector.nextLine();
		System.out.println("\nApellidos: "); this.apellidos = lector.nextLine();
		System.out.println("\nDNI: "); this.dni = lector.nextLine();
		System.out.println("\nDireccion: "); this.direccion = lector.nextLine();
		System.out.println("\nConfirmación: "); this.confirmacion = lector.nextLine();
		System.out.println("\nEstado: "); this.estado = lector.nextLine();
	}
	
	// Métodos
	
	public static void altaCliente(LinkedHashSet <Cliente> clientes) { //
		
		
		
		Usuario u=new Cliente(); //Constructor de cliente
		clientes.add((Cliente)u);
		
	}
	
	public String getCodigocliente() {
		return codigocliente;
	}

	public void setCodigocliente(String codigocliente) {
		this.codigocliente = codigocliente;
	}

	public static void mostrarClientes(LinkedHashSet <Cliente> clientes) { //Muestra los clientes
		for(Cliente c : clientes) {
			System.out.println(c.toString(c));
		}
	}
	
	public String toString(Cliente c) { //String para meter en buclue de muestreo de clientes
		return "----------- CLIENTE -----------\nNombre Completo: "+c.getNombre() + c.getApellidos()+"\nDNI: "+c.getDni()+"\nDirección: "+c.getDireccion()+"\nConfirmación: "+c.getConfirmacion()+"\nCódigo Cliente: "+c.getEstado()+"\n\n" ;
	}
	
	public static void consultarClientes(Cliente c) {
		
		System.out.println(c.toString(c)); //Consultar un cliente

	}
	public void modificarCliente(Cliente c) { //Editar un cliente
		
		lector = new Scanner(System.in);
		
		System.out.println("\nNombre completo: "); 
		System.out.println("\nNombre:"); c.setNombre(lector.nextLine()); 
		System.out.println("\nApellidos: "); c.setApellidos(lector.nextLine());
		System.out.println("\nDNI: "); c.setDni(lector.nextLine());
		System.out.println("\nDireccion: "); c.setDireccion(lector.nextLine());
		System.out.println("\nConfirmación: "); c.setConfirmacion(lector.nextLine());
		System.out.println("\nEstado: "); c.setEstado(lector.nextLine());
		
	}
	
	//Getters & Setters

	public Scanner getLector() {
		return lector;
	}

	public void setLector(Scanner lector) {
		this.lector = lector;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getConfirmacion() {
		return confirmacion;
	}

	public void setConfirmacion(String confirmacion) {
		this.confirmacion = confirmacion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	

}
