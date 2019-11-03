package main;

import java.util.List;

import controller.ControllerFuncionario;
import model.Funcionario;
import util.PersistCartaoFidelidade;
import util.PersistCombustivel;
import util.PersistEndereco;
import util.PersistFornecedor;
import util.PersistFornecimento;
import util.PersistPosto;
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
	public static void main(String [] args) {
		PersistPosto ppos = new PersistPosto();
		ppos.persistMock();
		
		PersistCartaoFidelidade pcf = new PersistCartaoFidelidade();
		pcf.persistMock();
		
		PersistEndereco pend = new PersistEndereco();
		pend.persistMock();
		
		PersistCombustivel pcomb = new PersistCombustivel();
		pcomb.persistMock();
		
		PersistFornecedor pfor = new PersistFornecedor();
		pfor.persistMock();
		
		PersistTanque ptanq = new PersistTanque();
		ptanq.persistMock();
		
		PersistFornecimento pforc = new PersistFornecimento();
		pforc.persistMock();

	}
}
