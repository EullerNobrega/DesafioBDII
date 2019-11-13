package util;

public class PersistAll {

	public PersistAll() {
		PersistEndereco pend = new PersistEndereco();
		pend.persistMock();

		PersistPreco ppr = new PersistPreco();
		ppr.persistMock();

		PersistPosto ppos = new PersistPosto();
		ppos.persistMock();

		PersistCartaoFidelidade pcf = new PersistCartaoFidelidade();
		pcf.persistMock();

		PersistCombustivel pcomb = new PersistCombustivel();
		pcomb.persistMock();

		PersistFornecedor pfor = new PersistFornecedor();
		pfor.persistMock();

		PersistTanque ptanq = new PersistTanque();
		ptanq.persistMock();

		PersistFornecimento pforc = new PersistFornecimento();
		pforc.persistMock();

		PersistCliente pcli = new PersistCliente();
		pcli.persistMock();

		PersistFuncionario pfunc = new PersistFuncionario();
		pfunc.persistMock();

		PersistCombustivelCliente pcll = new PersistCombustivelCliente();
		pcll.persistMock();
	}
}
