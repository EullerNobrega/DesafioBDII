package util;

import java.util.ArrayList;
import java.util.List;

import controller.ControllerCombustivel;
import controller.ControllerPosto;
import controller.ControllerPostoCombustivel;
import model.Combustivel;
import model.Posto;
import model.PostoCombustivel;

public class PersistPostoCombustivel implements persistEntity{
	ControllerPostoCombustivel<PostoCombustivel> controllerPostoCombustivel = new ControllerPostoCombustivel<PostoCombustivel>();
	
	public void persistMock() {
		List<PostoCombustivel>  list = new ArrayList<PostoCombustivel>();
//		
//		list.add(new PostoCombustivel(selectPos((long)1), selectCom((long)1), cliente, litros, totalCompra));
//		list.add(new PostoCombustivel(selectPos((long)1), selectCom((long)1), cliente, litros, totalCompra));
//		list.add(new PostoCombustivel(selectPos((long)1), selectCom((long)2), cliente, litros, totalCompra));
//		list.add(new PostoCombustivel(selectPos((long)1), selectCom((long)3), cliente, litros, totalCompra));
//		list.add(new PostoCombustivel(selectPos((long)1), selectCom((long)4), cliente, litros, totalCompra));
//		
		for(PostoCombustivel pc : list) {
			controllerPostoCombustivel.inserir(pc);
		}
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
