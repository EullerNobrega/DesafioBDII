package model;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Abastecimento extends AbstractEntity{
	private Pessoa cliente;
	private Preco preco;
	private Veiculo placa;
	private Date dataAbastecimento;
	
}
