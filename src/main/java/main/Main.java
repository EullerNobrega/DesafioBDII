package main;

import controller.ControllerCombustivelCliente;
import model.CombustivelCliente;

/*
public class Main extends Application {
	private static Scene mainScene;

	@Override
	public void start(Stage primaryStage) {
		try {
			Parent parent = FXMLLoader.load(getClass().getResource("/gui/LoginView.fxml"));
			mainScene = new Scene(parent);
			Image icon = new Image("file:\\Users\\Ingrid\\eclipse-workspace\\DesafioBDII\\Images\\gasIcon.png");
			primaryStage.getIcons().add(icon);
			primaryStage.setScene(mainScene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Scene getMainScene() {
		return mainScene;
	}

	public static void main(String[] args) {
		launch(args);
	}
}

*/


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
//		controllerFornecimento.rankingAbstecimentoHora();
		
//		LucroValor lv = controllerCombustivelCliente.lucroBrutoValorMedio();

	}
}