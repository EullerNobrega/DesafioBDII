package main;

import controller.ControllerCombustivelCliente;
import model.CombustivelCliente;

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
//		controllerFornecimento.Ranking();

		ControllerCombustivelCliente<CombustivelCliente> controllerCombustivelCliente = new ControllerCombustivelCliente<CombustivelCliente>();
		controllerCombustivelCliente.maisVendido();
		
		
	}
}
