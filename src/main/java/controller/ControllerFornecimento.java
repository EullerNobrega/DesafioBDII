package controller;

import java.util.List;

import javax.persistence.Query;

import dao.DAOFornecimento;
import model.AbstractEntity;
import model.Fornecimento;

public class ControllerFornecimento<T extends AbstractEntity> {
	private DAOFornecimento daoFornecimento;

	public ControllerFornecimento() {
		daoFornecimento = DAOFornecimento.getInstance();
	}

	public void inserir(Fornecimento fornecimento) {
		daoFornecimento.persist(fornecimento);
	}

	public void atualizar(Fornecimento fornecimento) {
		daoFornecimento.merge(fornecimento);
	}

	public void remover(Fornecimento t) {
		daoFornecimento.remove(t);
	}

	public void removerPorId(Long id, Fornecimento fornecimento) {
		daoFornecimento.removeById(id, fornecimento.getClass());
	}

	public void consultarPorId(Fornecimento fornecimento) {
//		daoFornecimento.getById(fornecimento.getId(), fornecimento.getClass());
	}

	public List<Fornecimento> consultarTodos() {
		return daoFornecimento.findAll();
	}

	public List<Fornecimento> rankingCombustivel() {

		Query createQuery = daoFornecimento.getEntityManager()
				.createQuery("SELECT f " + "FROM Fornecimento f " + "ORDER BY f.valor desc");

		List<Fornecimento> Fornecimento = createQuery.getResultList();

		for (Fornecimento f : Fornecimento) {
			System.out.println(f);
		}
		return Fornecimento;

	}
	
	public Fornecimento qtdAbstecimentoHora() {
		Query createQuery = daoFornecimento.getEntityManager().createQuery("SELECT f, SUM(litro) FROM Fornecimento f where data < current_date() group by data");
		
//		 - INTERVAL 7 DAY GROUP BY(set_time, data)
		List<Object[]> list = createQuery.getResultList();
		
		Fornecimento maior = new Fornecimento();
		maior.setSomaLitros(0);
		for(Object[] o : list) {
			Fornecimento f = (Fornecimento) o[0];
			f.setSomaLitros((double) o[1]);
			System.out.println(f);
			if(f.getSomaLitros() > maior.getSomaLitros()) {
				maior = f;
			}
			
		}
		System.out.println("Maior ===" + maior);
		return maior;
		
	}
	
//	QUANTIDADE DE ABASTECIMENTO POR HORA (HORÁRIO DE PICO)  NOS ÚLTIMOS 7 DIAS 
//	SELECT MAX(SUM(lITRO)),HOUR(Datetime),data
//	FROM Fornecimento F
//	WHERE DATE(data) > (NOW() - INTERVAL 7 DAY)
//	group by HOUR(set_time) , data


}
