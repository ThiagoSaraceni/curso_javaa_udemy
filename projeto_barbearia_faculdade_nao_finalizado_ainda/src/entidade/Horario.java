package entidade;

import java.util.Date;

public class Horario {
	
	private Date data;
	private String horario;
	private boolean  disponivel;
	
	
	public Horario(Date data, String horario) {
		this.data = data;
		this.horario = horario;
		this.disponivel = true; //inicia o horario disponivel como verdadeiro, só fica falso após reservado.
	}


	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
	}


	public String getHorario() {
		return horario;
	}


	public void setHorario(String horario) {
		this.horario = horario;
	}


	public boolean getDisponivel() {
		return disponivel;
	}

	public void isDisponivel() {
		if(this.getDisponivel() == true) {
			System.out.println("Horário disponível!");
		}
		if(this.getDisponivel() == false) {
			System.out.println("Horario indisponível, escolhe outro, por favor!");
		}
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	
	
	
}
