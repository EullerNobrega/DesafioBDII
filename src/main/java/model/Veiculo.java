package model;

import javax.persistence.Entity;

@Entity
public class Veiculo extends AbstractEntity{
	private String placa;
	private String marca;
	private Pessoa motorista;

//	Getters & Setters

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Pessoa getMotorista() {
		return motorista;
	}

	public void setMotorista(Pessoa motorista) {
		this.motorista = motorista;
	}

}
