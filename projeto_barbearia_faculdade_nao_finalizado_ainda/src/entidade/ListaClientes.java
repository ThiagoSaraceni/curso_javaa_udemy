package entidade;

import java.util.ArrayList;
import java.util.List;

public class ListaClientes {
	Cliente cliente;
	
	List<Cliente> listaClientes = new ArrayList<>();
	
	
	//Eu declarei a lista acima, mas ela só irá funcionar se eu criar os métodos addCliente e removeCliente.
	public void addCliente(Cliente c) {
		listaClientes.add(c);
	}
	
	public void removeCliente(Cliente c) {
		listaClientes.remove(c);
	}
	
	public void mostrarClientes() {
		for (Cliente cliente : listaClientes) {
			System.out.println("Nome: " + cliente.getNome() + " telefone " + cliente.getTelefone());
		}
	}
	
}
