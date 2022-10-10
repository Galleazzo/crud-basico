package model;

import java.time.LocalDate;

public class Aluno extends Pessoa{
	
	private Integer ra;
	private LocalDate dataDeMatricula;
	
	
	public Integer getRa() {
		return ra;
	}
	public void setRa(Integer ra) {
		this.ra = ra;
	}
	public LocalDate getDataDeMatricula() {
		return dataDeMatricula;
	}
	public void setDataDeMatricula(LocalDate localDate) {
		this.dataDeMatricula = localDate;
	}
	
	
}
