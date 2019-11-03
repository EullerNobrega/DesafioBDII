package util;

import controller.ControllerEndereco;
import model.Endereco;

public class PersistEndereco implements persistEntity{
	private ControllerEndereco<Endereco> controllerEndereco = new ControllerEndereco<Endereco>();
	
	public void persistMock() {
		Endereco end = new Endereco("Rua das Pernambucanas", "56306-320", "Gercino Coelho", "Petrolina", "PE");
		controllerEndereco.inserir(end);
	}

}
