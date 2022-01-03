package taller;

import java.util.Scanner;

import javax.swing.JOptionPane;

import java.util.LinkedHashSet;

public class MyPanel {

	public static void main(String[] args) {
	
		
		int encontrado = 0;
		String codigo;
		
		//Tenemos las listas
		
		LinkedHashSet <Cliente> clientes = new LinkedHashSet<Cliente>(); //Lista de clientes
		LinkedHashSet <Veh�culo> vehiculos = new LinkedHashSet<Veh�culo>(); //Lista de veh�culos
		LinkedHashSet <Usuario> usuarios = new LinkedHashSet<Usuario>(); //Lista de veh�culos
		LinkedHashSet<Ficha_General> fichas = new LinkedHashSet<Ficha_General>(); //Lista de fichas

		
		
		for (;;) {
			
			Scanner lector = new Scanner(System.in);
			
			int opcion1 = Integer.parseInt(JOptionPane.showInputDialog("�Qu� desea hacer?\n\n[1]: Entrar como administrador    [2]: Entrar como cliente     [3]: Entrar como comercial"));
			
			switch(opcion1) {
			
			case 1:
				String login_user = JOptionPane.showInputDialog("Usuario: ");
				String login_pass = JOptionPane.showInputDialog("Contrase�a: ");
				encontrado = 1;
				if (encontrado == 1) {
					System.out.println("Bienvenido: "+login_user);
					System.out.println("INICIO DE SESI�N CORRECTO !!\n");
					int opcion2 = Integer.parseInt(JOptionPane.showInputDialog("�Qu� desea hacer?\n\n[1]: Gestionar clientes     [2]: Gestionar veh�culos"));
					switch (opcion2) {
					case 1:
						
						int opcion4 = Integer.parseInt(JOptionPane.showInputDialog("�Qu� desea hacer?\n\n [1]: Crear usuario     [2]: Consultar usuarios en especifico     [3]: Mostrar usuarios\n"));
						
						switch (opcion4) {
						case 1:
							Cliente.altaCliente(clientes);
							break;
						case 2:
							System.out.println("\nIntroduzca el codigo del cliente: ");
							codigo=lector.nextLine();
							
							for(Cliente c: clientes) {
								if(c.getCodigocliente().compareToIgnoreCase(codigo)==0) {
									Cliente.consultarClientes(c);
									}
								}
							break;
							
						case 3:
							Cliente.mostrarClientes(clientes);
							break;
							
						default:
							System.out.println("\nERROR AL LEER POR TECLADO\n\n\n");
							break;
						}
						
				break;
				case 2:
						int opcion5 = Integer.parseInt(JOptionPane.showInputDialog("�Qu� desea hacer?\n\n [1]: Crear veh�culo     [2]: Mostrar usuarios\n"));
						
						switch (opcion5) {
						case 1:
							Veh�culo.altaVehiculo(vehiculos);
							break;
						case 2:
							Veh�culo.mostrarVehiculos(vehiculos);
							break;
						default:
							System.out.println("\nERROR AL LEER POR TECLADO\n\n\n");
								break;
						}
					}
				}
				else {
					System.out.println("INICIO DE SESI�N INCORRECTO, VUELVA A INTENTARLO !!");
				}
				break;
			case 2:
				
				String login_user_cliente = JOptionPane.showInputDialog("Usuario: ");
				String login_pass_cliente = JOptionPane.showInputDialog("Contrase�a: ");
					encontrado = 1;
					if (encontrado == 1) {
						System.out.println("INICIO DE SESI�N CORRECTO !!");
						System.out.println("Bienvenido"+login_user_cliente);
						int opcion3 = Integer.parseInt(JOptionPane.showInputDialog("�Qu� desea hacer?\n\n[1]: A�adir Vehiculo     [2]: Modificar informacion de usuario     [3]: Cerrar sesi�n"));
					switch (opcion3) {
						case 1:
							Veh�culo.altaVehiculo(vehiculos);
							break;
						case 2:
							Cliente.altaCliente(clientes);
							break;
						case 3:
							break;
						default:
							System.out.println("\nERROR AL LEER POR TECLADO\n\n\n");
							break;
					}
					}
					else {
						System.out.println("INICIO DE SESI�N INCORRECTO, VUELVA A INTENTARLO !!");
					}
			break;
			
			case 3:
				
				String login_user_comercial = JOptionPane.showInputDialog("Usuario: ");
				String login_pass_comercial = JOptionPane.showInputDialog("Contrase�a: ");
					encontrado = 1;
					if (encontrado == 1) {
						System.out.println("INICIO DE SESI�N CORRECTO !!");
						System.out.println("Bienvenido"+login_user_comercial);
						int opcion5 = Integer.parseInt(JOptionPane.showInputDialog("�Qu� desea hacer?\n\n[1]: Crear modificar y listar fichas     [2]: Mostrar clientes     [3]: Mostrar veh�culos"));
						switch (opcion5) {
						case 1:
							int opcion6 = Integer.parseInt(JOptionPane.showInputDialog("�Qu� desea hacer?\n\n[1]: Crear ficha     [2]: Consultar ficha     [3]: Mostrar fichas"));
							switch (opcion6) {
							case 1:
								Ficha_General.altaFichaGeneral(fichas);
								break;
							case 2:
								System.out.println("\nIntroduzca el codigo de la ficha: ");
								codigo=lector.nextLine();
								
								for(Ficha_General f: fichas) {
									if(f.getCodigocliente().compareToIgnoreCase(codigo)==0) {
										Ficha_General.consultarFichas(f);
										}
									}
								break;
							case 3:
								Ficha_General.mostrarFichas(fichas);
								break;
								
							default:
								System.out.println("\nERROR AL LEER POR TECLADO\n\n\n");
								break;
							}
							break;
						case 2:
							Cliente.mostrarClientes(clientes);
							break;
						case 3:
							Veh�culo.mostrarVehiculos(vehiculos);
							break;
						default:
							System.out.println("\nERROR AL LEER POR TECLADO\n\n\n");
							break;
					}
					}
				
				break;
				default:
					System.out.println("\nERROR AL LEER POR TECLADO\n\n\n");
					break;
			}
		}
			
		
		

	}

}
