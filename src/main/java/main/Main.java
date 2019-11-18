package main;

import controller.ControllerCliente;
import controller.ControllerCombustivelCliente;
import controller.ControllerFornecimento;
import model.Cliente;
import model.CombustivelCliente;
import model.Fornecimento;
import util.PersistAll;

public class Main {
	public static void main(String[] args) {
		PersistAll all = new PersistAll(); // A instancia dessa classe mocka o banco, caso tenha, comente essa linha
		
		ControllerFornecimento<Fornecimento> controllerFornecimento = new ControllerFornecimento<>();
		ControllerCombustivelCliente<CombustivelCliente> controllerCombustivelCliente = new ControllerCombustivelCliente<CombustivelCliente>();
		ControllerCliente<Cliente> controllerCliente = new ControllerCliente<Cliente>();

		// Selects
//		controllerCombustivelCliente.lucroBrutoValorMedioPorMes(); --- OK
//		controllerFornecimento.rankingFornecedorMaisBarato(); --- OK
//		controllerCombustivelCliente.combustiveisMaisVendidos(); --- OK
//		controllerCombustivelCliente.horarioPicoQtdAbastecimento(); --- OK
		controllerCombustivelCliente.consumoClienteFidelidade(); 

		// Procedures
//		controllerCombustivelCliente.rankingTotalValorCombustivel("201807"); --- OK

	}
}
