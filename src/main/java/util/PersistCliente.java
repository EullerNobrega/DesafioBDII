package util;

import model.CartaoFidelidade;
import model.Cliente;

public class PersistCliente implements persistEntity {

	public void persistMock() {
		CartaoFidelidade cf3 = null;
		CartaoFidelidade cf10 = null;
		CartaoFidelidade cf17 = null;
		CartaoFidelidade cf19 = null;
		CartaoFidelidade cf22 = null;
		CartaoFidelidade cf25 = null;
		
		
		Cliente c1 = new Cliente("Renan Thales Fernandes", "961.409.543-12", null, null);
		Cliente c2 = new Cliente("Daiane Bruna Lorena Lopes", "550.363.262-10", null, null);
		Cliente c3 = new Cliente("Larissa Isabelle Jennifer da Silva", "808.687.469-91", null, cf3);
		Cliente c4 = new Cliente("Yasmin Juliana Stella Baptista", "023.415.697-06", null, null);
		Cliente c5 = new Cliente("Gabriela Alícia Stella Pereira", null, "66.129.625/0001-66", null);
		Cliente c6 = new Cliente("Cristiane Natália Eduarda Duarte", "315.989.456-88", null, null);
		Cliente c7 = new Cliente("Stella Elaine Aragão", "122.478.216-00", null, null);
		Cliente c8 = new Cliente("Luiz Sérgio Miguel Mendes", "315.300.492-70", null, null);
		Cliente c9 = new Cliente("Manoel Igor Victor Nunes", "389.548.739-28", null, null);
		Cliente c10 = new Cliente("Diego Renato César Aparício", "200.154.916-41", null, cf10);
		Cliente c11 = new Cliente("Flávia Maya Assis", "477.086.165-65", null, null);
		Cliente c12 = new Cliente("Vinicius Alexandre Almada", "602.689.985-58", null, null);
		Cliente c13 = new Cliente("Fernando Gael Theo Farias", null, "86.856.238/0001-39", null);
		Cliente c14 = new Cliente("Tiago Murilo Bryan Teixeira", "133.210.927-60", null, null);
		Cliente c15 = new Cliente("Ryan Caio das Neves", "327.238.715-33", null, null);
		Cliente c16 = new Cliente("Fabiana Benedita Baptista", "290.953.142-27", null, null);
		Cliente c17 = new Cliente("Leonardo Fábio da Rocha", null, "22.130.100/0001-75", cf17);
		Cliente c18 = new Cliente("Roberto Kevin Hugo da Mata", "575.822.170-80", null, null);
		Cliente c19 = new Cliente("Raul Luiz Caldeira", "340.442.027-61", null, cf19);
		Cliente c20 = new Cliente("Stefany Laís Monteiro", "493.775.302-96", null, null);
		Cliente c21 = new Cliente("Natália Sônia Nascimento", null, "65.324.681/0001-99", null);
		Cliente c22 = new Cliente("Cauê Murilo Ribeiro", "238.004.023-00", null, cf22);
		Cliente c23 = new Cliente("Tiago Juan Roberto Peixoto", "392.695.372-18", null, null);
		Cliente c24 = new Cliente("Yasmin Andreia Antônia Carvalho", "221.107.995-44", null, null);
		Cliente c25 = new Cliente("Bryan Alexandre Farias", "740.089.497-80", null, cf25);
	}

}
