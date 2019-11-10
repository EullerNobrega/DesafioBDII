package main;

import controller.ControllerCliente;
import controller.ControllerCombustivelCliente;
import controller.ControllerFornecimento;
import model.Cliente;
import model.CombustivelCliente;
import model.Fornecimento;
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
//		PersistEndereco pend = new PersistEndereco();
//		pend.persistMock();
//
//		PersistPreco ppr = new PersistPreco();
//		ppr.persistMock();
//
//		PersistPosto ppos = new PersistPosto();
//		ppos.persistMock();
//
//		PersistCartaoFidelidade pcf = new PersistCartaoFidelidade();
//		pcf.persistMock();
//
//		PersistCombustivel pcomb = new PersistCombustivel();
//		pcomb.persistMock();
//
//		PersistFornecedor pfor = new PersistFornecedor();
//		pfor.persistMock();
//
//		PersistTanque ptanq = new PersistTanque();
//		ptanq.persistMock();
//
//		PersistFornecimento pforc = new PersistFornecimento();
//		pforc.persistMock();
//
//		PersistCliente pcli = new PersistCliente();
//		pcli.persistMock();
//
//		PersistFuncionario pfunc = new PersistFuncionario();
//		pfunc.persistMock();
//
//		PersistCombustivelCliente pcll = new PersistCombustivelCliente();
//		pcll.persistMock();

//		ControllerFornecimento<Fornecimento> controllerFornecimento = new ControllerFornecimento<Fornecimento>();
//		controllerFornecimento.rankingCombustivel();

		ControllerCombustivelCliente<CombustivelCliente> controllerCombustivelCliente = new ControllerCombustivelCliente<CombustivelCliente>();
//		controllerCombustivelCliente.maisVendido();
		controllerCombustivelCliente.VendaAcumulada("201806");
//		ControllerCliente<Cliente> controllerCliente = new ControllerCliente<>();
//		controllerCliente.clientesFidelidade();
//		
//		ControllerFornecimento<Fornecimento> controllerFornecimento = new ControllerFornecimento<Fornecimento>();
//		controllerFornecimento.qtdAbstecimentoHora();
		
//		LucroValor lv = controllerCombustivelCliente.lucroBrutoValorMedio();

	}
}
