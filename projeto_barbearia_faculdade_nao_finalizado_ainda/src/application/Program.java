package application;

import java.util.Locale;
import java.util.Scanner;

import entidade.Cliente;
import entidade.ListaClientes;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("---------");
		System.out.println("BARBEARIA");
		System.out.println("---------");
		
		//Instanciando a lista fora do for.
		ListaClientes lista = new ListaClientes();
		
		for (int i=0; i<2; i++) {
			System.out.print("Digite o nome: ");
			String nome = sc.nextLine();
			System.out.println("Digite o telefone: ");
			String numTel = sc.nextLine();
			
			//Instanciando a classes Cliente
			Cliente cliente = new Cliente(nome, numTel);
			
			
			//Adicionando os clientes na lista.
			lista.addCliente(cliente);
			
		}
		lista.mostrarClientes();
		sc.close();
	
		
}

}
