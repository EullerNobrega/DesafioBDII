package main;

import java.util.List;

import controller.ControllerFuncionario;
import model.Funcionario;

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
		Funcionario p = new Funcionario();
		p.setCpf("123123");
		ControllerFuncionario<Funcionario> cFuncionario = new ControllerFuncionario<Funcionario>();
//		cPessoa.inserir(p);
		List<Funcionario> f;
		f = cFuncionario.consultarTodos();
		System.out.println(f);
	}
}
