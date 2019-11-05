package util;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import controller.ControllerCombustivel;
import controller.ControllerFornecedor;
import controller.ControllerFornecimento;
import controller.ControllerPosto;
import controller.ControllerPreco;
import controller.ControllerTanque;
import model.Combustivel;
import model.Fornecedor;
import model.Fornecimento;
import model.Posto;
import model.Preco;
import model.Tanque;

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

		Tanque t1 = selectTan((long) 1);
		Tanque t2 = selectTan((long) 2);
		Tanque t3 = selectTan((long) 3);
		Tanque t4 = selectTan((long) 4);

		Preco p1 = selectPr((long) 1);
		Preco p2 = selectPr((long) 2);
		;
		Preco p3 = selectPr((long) 3);
		;
		Preco p4 = selectPr((long) 4);
		;
		Preco p5 = selectPr((long) 5);
		;
		Preco p6 = selectPr((long) 6);
		;
		Preco p7 = selectPr((long) 7);
		;
		Preco p8 = selectPr((long) 8);
		;
		Preco p9 = selectPr((long) 9);
		;
		Preco p10 = selectPr((long) 10);
		;

		Posto p = selectPos((long) 1);

	    list.add(new Fornecimento(f1, c2, p, t1, (p1.getValor() * 10000), 10000,LocalDate.of(18, Month., dayOfMonth)));
		list.add(new Fornecimento(f3, c1, p, t2, (p2.getValor() * 13000), 13000, LocalDate.of(2018, Month.dayOfMonth));
		list.add(new Fornecimento(f1, c2, p, t3, (p3.getValor() * 6200), 6200, LocalDate.of(2018, Month.dayOfMonth));
		list.add(new Fornecimento(f2, c3, p, t1, (p4.getValor() * 14000), 14000, LocalDate.of(2018, Month.dayOfMonth));
		list.add(new Fornecimento(f5, c2, p, t3, (p5.getValor() * 9750), 9750, LocalDate.of(2018, Month.dayOfMonth));
		list.add(new Fornecimento(f4, c3, p, t2, (p6.getValor() * 13000), 13000, LocalDate.of(2018, Month.dayOfMonth));
		list.add(new Fornecimento(f5, c1, p, t4, (p7.getValor() * 12800), 12800, LocalDate.of(2018, Month.dayOfMonth));
		list.add(new Fornecimento(f4, c1, p, t1, (p8.getValor() * 13700), 13700, LocalDate.of(2018, Month.dayOfMonth));
		list.add(new Fornecimento(f2, c1, p, t3, (p9.getValor() * 1450), 14500, LocalDate.of(2018, Month.dayOfMonth));
		list.add(new Fornecimento(f3, c4, p, t4, (p10.getValor() * 9000), 9000, LocalDate.of(2018, Month.dayOfMonth));
		list.add(new Fornecimento(f5, c1, p, t1, (p2.getValor() * 13000), 13000, LocalDate.of(2018, Month.dayOfMonth));
		list.add(new Fornecimento(f1, c5, p, t2, (p4.getValor() * 4500), 4500, LocalDate.of(2018, Month.dayOfMonth));
		list.add(new Fornecimento(f5, c4, p, t4, (p6.getValor() * 6000), 6000, LocalDate.of(2018, Month.dayOfMonth));
		list.add(new Fornecimento(f2, c4, p, t1, (p8.getValor() * 7500), 7500, LocalDate.of(2018, Month.dayOfMonth));
		list.add(new Fornecimento(f5, c1, p, t3, (p10.getValor() * 8000), 8000, LocalDate.of(2018, Month.dayOfMonth));
		list.add(new Fornecimento(f1, c1, p, t4, (p1.getValor() * 9500), 9500, LocalDate.of(2018, Month.dayOfMonth));
		list.add(new Fornecimento(f3, c1, p, t3, (p3.getValor() * 11000), 11000, LocalDate.of(2018, Month.dayOfMonth));
		list.add(new Fornecimento(f2, c3, p, t2, (p5.getValor() * 9700), 9700, LocalDate.of(2018, Month.dayOfMonth));
		list.add(new Fornecimento(f1, c5, p, t4, (p7.getValor() * 7800), 7800, LocalDate.of(2018, Month.dayOfMonth));
		list.add(new Fornecimento(f4, c1, p, t1, (p9.getValor() * 2000), 2000, LocalDate.of(2018, Month.dayOfMonth));

		for (Fornecimento f : list) {
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

	private Tanque selectTan(Long id) {
		ControllerTanque<Tanque> controllerTanque = new ControllerTanque<Tanque>();
		Tanque t = controllerTanque.consultarPorId(id, Tanque.class);
		return t;
	}

	private Preco selectPr(Long id) {
		ControllerPreco<Preco> controllerPreco = new ControllerPreco<Preco>();
		Preco pr = controllerPreco.consultarPorId(id, Preco.class);
		return pr;
	}

}
