package util;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import controller.ControllerCliente;
import controller.ControllerCombustivel;
import controller.ControllerCombustivelCliente;
import controller.ControllerFuncionario;
import controller.ControllerPosto;
import controller.ControllerPreco;
import controller.ControllerTanque;
import model.Cliente;
import model.Combustivel;
import model.CombustivelCliente;
import model.Funcionario;
import model.Posto;
import model.Preco;
import model.Tanque;

public class PersistCombustivelCliente implements persistEntity {
	private ControllerCombustivelCliente<CombustivelCliente> controllerCombustivelCliente = new ControllerCombustivelCliente<CombustivelCliente>();

	public void persistMock() {
		List<CombustivelCliente> list = new ArrayList<CombustivelCliente>();

		Posto p = selectPos((long) 1);

		Combustivel c1 = selectCombustivel((long) 1);
		Combustivel c2 = selectCombustivel((long) 2);
		Combustivel c3 = selectCombustivel((long) 3);
		Combustivel c4 = selectCombustivel((long) 4);
		Combustivel c5 = selectCombustivel((long) 5);
		
		Funcionario f1 = selectFuncionario((long)1);
		Funcionario f2 = selectFuncionario((long)2);
		Funcionario f3 = selectFuncionario((long)3);
		Funcionario f4 = selectFuncionario((long)4);
		Funcionario f5 = selectFuncionario((long)5);
		
		
		Tanque t1 = selectTanque((long)1);
		Tanque t2 = selectTanque((long)2);
		Tanque t3 = selectTanque((long)3);
		Tanque t4 = selectTanque((long)4);
		Tanque t5 = selectTanque((long)5);

		Cliente cl1 = selectCliente((long) 1);
		Cliente cl2 = selectCliente((long) 2);
		Cliente cl3 = selectCliente((long) 3);
		Cliente cl4 = selectCliente((long) 4);
		Cliente cl5 = selectCliente((long) 5);
		Cliente cl6 = selectCliente((long) 6);
		Cliente cl7 = selectCliente((long) 7);
		Cliente cl8 = selectCliente((long) 8);
		Cliente cl9 = selectCliente((long) 9);
		Cliente cl10 = selectCliente((long) 10);
		Cliente cl11 = selectCliente((long) 11);
		Cliente cl12 = selectCliente((long) 12);
		Cliente cl13 = selectCliente((long) 13);
		Cliente cl14 = selectCliente((long) 14);
		Cliente cl15 = selectCliente((long) 15);
		Cliente cl16 = selectCliente((long) 16);
		
		
		Preco p1 = selectPreco((long)1);
		Preco p2 = selectPreco((long)3);
		Preco p3 = selectPreco((long)4);
		Preco p4 = selectPreco((long)5);
		Preco p5 = selectPreco((long)2);
		Preco p6 = selectPreco((long)6);

        list.add(new CombustivelCliente(p, c1, cl1,f1, t1,LocalDateTime.of(2018, Month.JUNE, 12, 12, 0), 15.00, p1.getValor() * 45.0));
		list.add(new CombustivelCliente(p, c2, cl2,f2, t2, LocalDateTime.of(2018, Month.JULY, 12, 11, 0), 10.0, p2.getValor() * 10.0));
		list.add(new CombustivelCliente(p, c4, cl3,f5, t4, LocalDateTime.of(2018, Month.JUNE, 12, 10, 0), 9.0, p3.getValor() * 9.0));
		list.add(new CombustivelCliente(p, c3, cl4,f3, t3,LocalDateTime.of(2018, Month.JULY, 12, 17, 0), 11.0, p4.getValor() * 11.0));
		list.add(new CombustivelCliente(p, c2, cl5,f2, t2, LocalDateTime.of(2018, Month.JUNE, 12, 18, 0), 12.0, p5.getValor()* 12.0));
		list.add(new CombustivelCliente(p, c1, cl6,f1, t1,LocalDateTime.of(2018, Month.JULY, 12, 16, 0), 13.0, p6.getValor() * 33.0));
		list.add(new CombustivelCliente(p, c4, cl7,f5, t4, LocalDateTime.of(2018, Month.JUNE, 12, 17, 0), 20.0, p2.getValor() * 20.0));
		list.add(new CombustivelCliente(p, c3, cl8,f3, t3,LocalDateTime.of(2018, Month.JULY, 12, 17, 0), 50.0, p4.getValor() * 50.0));
		list.add(new CombustivelCliente(p, c1, cl9,f1, t1,LocalDateTime.of(2018, Month.JUNE, 12, 17, 0), 21.0, p6.getValor() * 21.0));
		list.add(new CombustivelCliente(p, c4, cl10,f5,t4, LocalDateTime.of(2018, Month.JULY, 12, 17, 0), 25.0, p1.getValor() * 25.0));
		list.add(new CombustivelCliente(p, c1, cl11,f1,t1, LocalDateTime.of(2018, Month.AUGUST, 12, 17, 0), 2.0, p3.getValor() * 39.0));
		list.add(new CombustivelCliente(p, c3, cl12,f5,t3, LocalDateTime.of(2018, Month.AUGUST, 12, 17, 0), 30.0, p5.getValor() * 30.0));
		list.add(new CombustivelCliente(p, c5, cl13,f4,t5, LocalDateTime.of(2018, Month.AUGUST, 12, 19, 0), 12.0, p3.getValor() * 12.0));
		list.add(new CombustivelCliente(p, c1, cl14,f1,t1, LocalDateTime.of(2018, Month.AUGUST, 12, 20, 0), 40.0, p2.getValor() * 40.0));
		list.add(new CombustivelCliente(p, c2, cl15,f2,t2, LocalDateTime.of(2018, Month.AUGUST, 12, 21, 0), 20.0, p1.getValor() * 20.0));
		list.add(new CombustivelCliente(p, c1, cl16,f1,t1, LocalDateTime.of(2018, Month.AUGUST, 12, 15, 0), 33.0, p4.getValor() * 33.0));

		for (CombustivelCliente cl : list) {
			controllerCombustivelCliente.inserir(cl);
		}
	}

	private Funcionario selectFuncionario(Long id) {
		ControllerFuncionario<Funcionario> controllerFuncionario = new ControllerFuncionario<Funcionario>();
		return controllerFuncionario.consultarPorId(id);
	}

	private Posto selectPos(Long id) {
		ControllerPosto<Posto> controllerPosto = new ControllerPosto<Posto>();
		return controllerPosto.consultarPorId(id, Posto.class);
	}

	private Combustivel selectCombustivel(Long id) {
		ControllerCombustivel<Combustivel> controllerCombustivel = new ControllerCombustivel<Combustivel>();
		return controllerCombustivel.consultarPorId(id, Combustivel.class);
	}

	private Tanque selectTanque(Long id) {
		ControllerTanque<Tanque> controllerTanque = new ControllerTanque<>();
		return controllerTanque.consultarPorId(id, Tanque.class);
	}
 
	private Cliente selectCliente(Long id) {
		ControllerCliente<Cliente> controllerCliente = new ControllerCliente<Cliente>();
		return controllerCliente.consultarPorId(id, Cliente.class);
	}
	
	
	private Preco selectPreco(Long id) {
		ControllerPreco<Preco> controllerPreco = new ControllerPreco<Preco>();
		return controllerPreco.consultarPorId(id, Preco.class);
	}

}
