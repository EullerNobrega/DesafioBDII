package util;

import java.util.ArrayList;
import java.util.List;

import controller.ControllerFuncionario;
import model.Funcionario;
import model.TipoFuncionario;

public class PersistFuncionario implements persistEntity {
	ControllerFuncionario<Funcionario> controllerFuncionario = new ControllerFuncionario<Funcionario>();

	public void persistMock() {
		List<Funcionario> list = new ArrayList<Funcionario>();

		list.add(new Funcionario("Renata Daiane Nair Aparício", "749.059.077-99", null, "123456", "4rT8e3m8", TipoFuncionario.FRENTISTA));
		list.add(new Funcionario("Catarina Isabelly Nunes", "287.797.957-14", null,"234567", "FCT2qU7g", TipoFuncionario.GERENTE));
		list.add(new Funcionario("Anderson Iago Bernardo Assis", null, "03.781.233/0001-67","345678", "ynuCbN2H", TipoFuncionario.FRENTISTA));
		list.add(new Funcionario("José Geraldo Vieira", "207.067.653-62", null,"456789", "MbqryhY1", TipoFuncionario.FRENTISTA));
		list.add(new Funcionario("Alessandra Nina Louise Porto", "939.290.919-50", null,"567890", "6805fhDY",TipoFuncionario.FRENTISTA ));
		
		for(Funcionario f : list) {
			controllerFuncionario.inserir(f);
		}

	}

}
