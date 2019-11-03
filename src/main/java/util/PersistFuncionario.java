package util;

import model.Funcionario;

public class PersistFuncionario implements persistEntity{

	public void persistMock() {
		Funcionario f1 = new Funcionario("Renata Daiane Nair Aparício", "749.059.077-99", null);
		Funcionario f2 = new Funcionario("Catarina Isabelly Nunes", "287.797.957-14", null);
		Funcionario f3 = new Funcionario("Anderson Iago Bernardo Assis", null, "03.781.233/0001-67");
		Funcionario f4 = new Funcionario("José Geraldo Vieira", "207.067.653-62", null);
		Funcionario f5 = new Funcionario("Alessandra Nina Louise Porto", "939.290.919-50", null);
		
	}

}
