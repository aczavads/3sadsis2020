package aula20200413.construtores;

import java.util.Calendar;

public class Aluno {
	private String ra;
	private String primeiroNome;
	private String sobrenome;
	private String curso;
	private int anoDeIngresso;
	
	public String toString() {
		return "Aluno[" + "ra=" + getRa() + ", nome=" + getPrimeiroNome() + " " + getSobrenome() + "]"; 
	}
	
	//construtor PADRÃO (pois não define parâmetros)
	public Aluno() {
		int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
		setAnoDeIngresso(anoAtual);
		System.out.println("Criando um aluno com o construtor padrão... ano: " + this.anoDeIngresso);
	}
	//construtor ALTERNATIVO (pois DEFINE 5 parâmetros)
	public Aluno(String ra, String primeiroNome, String sobrenome, String curso, int anoDeIngresso) {
		setRa(ra);
		setPrimeiroNome(primeiroNome);
		setSobrenome(sobrenome);
		setCurso(curso);		
//		if (anoDeIngresso < 1990) {
//			throw new RuntimeException("Ano de ingresso inválido! Deve ser igual ou superior a 1990.");
//		}
//		this.anoDeIngresso = anoDeIngresso;
		setAnoDeIngresso(anoDeIngresso);
	}
	
	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}
	public void setRa(String ra) {
		this.ra = ra;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public void setAnoDeIngresso(int anoDeIngresso) {
		if (anoDeIngresso < 1990) {
			throw new RuntimeException("Ano de ingresso inválido! Deve ser igual ou superior a 1990.");
		}
		this.anoDeIngresso = anoDeIngresso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public int getAnoDeIngresso() {
		return anoDeIngresso;
	}
	public String getPrimeiroNome() {
		return primeiroNome;
	}
	public String getCurso() {
		return curso;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public String getRa() {
		return ra;
	}
}
