package util;

import model.Endereco;
import model.Posto;

public class PersistPosto implements persistEntity{
	
	public void persistMock() {
		Endereco end = null;
		Posto p = new Posto(end, "PostoSmartRS", "PostoSmart", "94.861.248/0001-90", "Ipiranga");
		
	}

}
