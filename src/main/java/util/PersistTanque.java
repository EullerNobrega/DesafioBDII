package util;

import java.util.ArrayList;
import java.util.List;

import controller.ControllerCombustivel;
import controller.ControllerTanque;
import model.Combustivel;
import model.Tanque;

public class PersistTanque  implements persistEntity{
	ControllerTanque<Tanque> controllerTanque = new ControllerTanque<Tanque>();
	
	public void persistMock() {
		Combustivel c1 = select((long) 1);
		Combustivel c2 = select((long) 2);;
		Combustivel c3 = select((long) 3);;
		Combustivel c4 = select((long) 4);;
		
		List<Tanque> list = new ArrayList<Tanque>();
		list.add(new Tanque(c1, 15000 , 12500));
		list.add(new Tanque(c2, 10000, 5300));
		list.add(new Tanque(c3, 20000, 6400));
		list.add( new Tanque(c4, 12000, 9000));
		
		for(Tanque t : list) {
			controllerTanque.inserir(t);
		}
		
	}
	
	private Combustivel select(Long id) {
		
		ControllerCombustivel<Combustivel> controllerCombustivel = new ControllerCombustivel<Combustivel>();
		Combustivel c = controllerCombustivel.consultarPorId(id, Combustivel.class);
		return c;
	}

}
