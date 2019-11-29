package util;

import controller.ControllerEndereco;
import controller.ControllerPosto;
import model.Endereco;
import model.Posto;

public class PersistPosto implements persistEntity{
	ControllerPosto<Posto> controllerPosto = new ControllerPosto<Posto>();
	
	public void persistMock() {
		Endereco end = select();
		Posto p = new Posto(end, "PostoSmart", "PS", "94.861.248/0001-90", "Ipiranga", 12.500);
		controllerPosto.inserir(p);
	}
	
	private Endereco select() {
		ControllerEndereco<Endereco> controllerEndereco = new ControllerEndereco<Endereco>();
		return controllerEndereco.consultarPorId((long)1);
	}

}
