package util;

import java.util.ArrayList;
import java.util.List;

import controller.ControllerCartaoFidelidade;
import controller.ControllerCliente;
import model.CartaoFidelidade;
import model.Cliente;

public class PersistCliente implements persistEntity {
	ControllerCliente<Cliente> controllerCliente = new ControllerCliente<Cliente>();
	
	public void persistMock() {
		CartaoFidelidade cf3 = select((long)1);
		CartaoFidelidade cf10 = select((long)2);
		CartaoFidelidade cf17 = select((long)3);
		CartaoFidelidade cf19 = select((long)4);
		CartaoFidelidade cf22 = select((long)5);
		CartaoFidelidade cf25 = select((long)6);
		
		List<Cliente> list = new ArrayList<Cliente>();
		
		
		list.add(new Cliente("Renan Thales Fernandes", "961.409.543-12", null, null));
		list.add( new Cliente("Daiane Bruna Lorena Lopes", "550.363.262-10", null, null));
		list.add( new Cliente("Larissa Isabelle Jennifer da Silva", "808.687.469-91", null, cf3));
		list.add( new Cliente("Yasmin Juliana Stella Baptista", "023.415.697-06", null, null));
		list.add( new Cliente("Gabriela Alícia Stella Pereira", null, "66.129.625/0001-66", null));
		list.add( new Cliente("Cristiane Natália Eduarda Duarte", "315.989.456-88", null, null));
		list.add( new Cliente("Stella Elaine Aragão", "122.478.216-00", null, null));
		list.add( new Cliente("Luiz Sérgio Miguel Mendes", "315.300.492-70", null, null));
		list.add( new Cliente("Manoel Igor Victor Nunes", "389.548.739-28", null, null));
		list.add( new Cliente("Diego Renato César Aparício", "200.154.916-41", null, cf10));
		list.add( new Cliente("Flávia Maya Assis", "477.086.165-65", null, null));
		list.add( new Cliente("Vinicius Alexandre Almada", "602.689.985-58", null, null));
		list.add( new Cliente("Fernando Gael Theo Farias", null, "86.856.238/0001-39", null));
		list.add( new Cliente("Tiago Murilo Bryan Teixeira", "133.210.927-60", null, null));
		list.add( new Cliente("Ryan Caio das Neves", "327.238.715-33", null, null));
		list.add( new Cliente("Fabiana Benedita Baptista", "290.953.142-27", null, null));
		list.add( new Cliente("Leonardo Fábio da Rocha", null, "22.130.100/0001-75", cf17));
		list.add( new Cliente("Roberto Kevin Hugo da Mata", "575.822.170-80", null, null));
		list.add( new Cliente("Raul Luiz Caldeira", "340.442.027-61", null, cf19));
		list.add( new Cliente("Stefany Laís Monteiro", "493.775.302-96", null, null));
		list.add( new Cliente("Natália Sônia Nascimento", null, "65.324.681/0001-99", null));
		list.add( new Cliente("Cauê Murilo Ribeiro", "238.004.023-00", null, cf22));
		list.add( new Cliente("Tiago Juan Roberto Peixoto", "392.695.372-18", null, null));
		list.add( new Cliente("Yasmin Andreia Antônia Carvalho", "221.107.995-44", null, null));
		list.add( new Cliente("Bryan Alexandre Farias", "740.089.497-80", null, cf25));
		
		for(Cliente c : list) {
			controllerCliente.inserir(c);
		}
	}
	
	private CartaoFidelidade select(Long id) {
		ControllerCartaoFidelidade<CartaoFidelidade> cartaoFidelidade = new ControllerCartaoFidelidade<CartaoFidelidade>();
		return cartaoFidelidade.consultarPorId(id);
	}

}
