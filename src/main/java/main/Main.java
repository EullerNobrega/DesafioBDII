package main;

import controller.ControllerCliente;
import controller.ControllerCombustivelCliente;
import controller.ControllerFornecimento;
import model.Cliente;
import model.CombustivelCliente;
import model.Fornecimento;
import model.LucroValor;
import util.PersistAll;
import util.PersistCartaoFidelidade;
import util.PersistCliente;
import util.PersistCombustivel;
import util.PersistCombustivelCliente;
import util.PersistEndereco;
import util.PersistFornecedor;
import util.PersistFornecimento;
import util.PersistFuncionario;
import util.PersistPosto;
import util.PersistPreco;
import util.PersistTanque;

//public class Main extends Application {
//	public void start(Stage stage) {
//		try {
//			Parent parent = FXMLLoader.load(getClass().getResource("/gui/View.fxml"));
//			Scene scene = new Scene(parent);
//			stage.setScene(scene);
//			stage.show();
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//	}
//
//	public static void main(String[] args) {
//		Pessoa pessoa = new Pessoa();
//		Endereco end = new Endereco();
//
//		launch(args);
//	}
//}

public class Main {
	public static void main(String[] args) {
		PersistAll all = new PersistAll(); // A instancia dessa classe mocka o banco, caso tenha, comente essa linha

		ControllerFornecimento<Fornecimento> controllerFornecimento = new ControllerFornecimento<Fornecimento>();
		controllerFornecimento.rankingCombustivel();

		ControllerCombustivelCliente<CombustivelCliente> controllerCombustivelCliente = new ControllerCombustivelCliente<CombustivelCliente>();
		controllerCombustivelCliente.maisVendido();

		controllerCombustivelCliente.VendaAcumulada("201806");

		ControllerCliente<Cliente> controllerCliente = new ControllerCliente<>();
		controllerCliente.clientesFidelidade();

		controllerFornecimento.rankingAbstecimentoHora();

		LucroValor lv = controllerCombustivelCliente.lucroBrutoValorMedio();

	}
}
