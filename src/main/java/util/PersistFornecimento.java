package util;

import java.util.ArrayList;
import java.util.List;

import controller.ControllerCombustivel;
import controller.ControllerFornecedor;
import controller.ControllerFornecimento;
import controller.ControllerPosto;
import model.Combustivel;
import model.Fornecedor;
import model.Fornecimento;
import model.Posto;

public class PersistFornecimento implements persistEntity {
	ControllerFornecimento<Fornecimento> controllerFornecimento = new ControllerFornecimento<Fornecimento>();
	public void persistMock() {
		List<Fornecimento> list = new ArrayList<Fornecimento>();

		Fornecedor f1 = selectFor((long) 1);
		Fornecedor f2 = selectFor((long) 2);
		Fornecedor f3 = selectFor((long) 3);
		Fornecedor f4 = selectFor((long) 4);
		Fornecedor f5 = selectFor((long) 5);

		Combustivel c1 = selectCom((long) 1);
		Combustivel c2 = selectCom((long) 2);
		Combustivel c3 = selectCom((long) 3);
		Combustivel c4 = selectCom((long) 4);
		Combustivel c5 = selectCom((long) 5);

		Posto p = selectPos((long) 1);

		list.add(new Fornecimento(f1, c2, p, 32.200, 10000, "06/14/18"));
		list.add(new Fornecimento(f3, c1, p, 3.52, 13000, "03/04/19"));
		list.add(new Fornecimento(f1, c2, p, 3.22, 6200, "06/17/18"));
		list.add(new Fornecimento(f2, c3, p, 3.26, 14000, "08/22/18"));
		list.add(new Fornecimento(f5, c2, p, 3.40, 9750, "07/07/18"));
		list.add(new Fornecimento(f4, c3, p, 3.75, 13000, "09/19/18"));
		list.add(new Fornecimento(f5, c1, p, 3.56, 12800, "10/07/18"));
		list.add(new Fornecimento(f4, c1, p, 3.22, 13700, "08/15/18"));
		list.add(new Fornecimento(f2, c1, p, 3.14, 14500, "05/18/18"));
		list.add(new Fornecimento(f3, c4, p, 3.54, 9000, "09/03/18"));
		list.add(new Fornecimento(f5, c1, p, 3.39, 13000, "10/12/18"));
		list.add(new Fornecimento(f1, c5, p, 3.61, 4500, "03/06/19"));
		list.add(new Fornecimento(f5, c4, p, 3.75, 6000, "03/20/18"));
		list.add(new Fornecimento(f2, c4, p, 3.28, 7500, "01/16/19"));
		list.add(new Fornecimento(f5, c1, p, 3.65, 8000, "11/07/18"));
		list.add(new Fornecimento(f1, c1, p, 3.73, 9500, "04/14/18"));
		list.add(new Fornecimento(f3, c1, p, 3.48, 11000, "11/09/18"));
		list.add(new Fornecimento(f2, c3, p, 3.68, 9700, "09/03/18"));
		list.add(new Fornecimento(f1, c5, p, 3.39, 7800, "05/02/18"));
		list.add(new Fornecimento(f4, c1, p, 3.47, 12000, "06/26/18"));
		
		for(Fornecimento f : list) {
			controllerFornecimento.inserir(f);
		}

	}

	private Fornecedor selectFor(Long id) {
		ControllerFornecedor<Fornecedor> controllerFornecedor = new ControllerFornecedor<Fornecedor>();
		Fornecedor f = controllerFornecedor.consultarPorId(id, Fornecedor.class);
		return f;
	}

	private Combustivel selectCom(Long id) {
		ControllerCombustivel<Combustivel> controllerCombustivel = new ControllerCombustivel<Combustivel>();
		Combustivel c = controllerCombustivel.consultarPorId(id, Combustivel.class);
		return c;
	}

	private Posto selectPos(Long id) {
		ControllerPosto<Posto> controllerPosto = new ControllerPosto<Posto>();
		Posto p = controllerPosto.consultarPorId(id, Posto.class);
		return p;
	}

}
