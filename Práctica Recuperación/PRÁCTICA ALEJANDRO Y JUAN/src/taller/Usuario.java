package taller;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Usuario  {
		
		//Atributos
		
		private Scanner lector;
		public String user;
		private String pass;
		
		//Constructores
		
		public Usuario(String usuario, String contraseña) {
			this.user = usuario;
			this.pass = contraseña;
		}

		//Métodos
		
		public Usuario() {
			
			lector = new Scanner(System.in);
			
			System.out.println("\nUsuario: ");
			this.user = lector.nextLine();
			
			System.out.println("Contraseña: ");
			this.pass = lector.nextLine();
			
			}
		
		public static void crearUsuario(LinkedHashSet<Usuario> usuarios) {
			Usuario u = new Usuario();
			usuarios.add((Usuario)u);
		}
		
		
		//Getters & Setters

		public Scanner getLector() {
			return lector;
		}

		public void setLector(Scanner lector) {
			this.lector = lector;
		}

		public String getUser() {
			return user;
		}

		public void setUser(String admin) {
			this.user = admin;
		}

		public String getPass() {
			return pass;
		}

		public void setPass(String pass) {
			this.pass = pass;
		}
		
		
		}


		
		

