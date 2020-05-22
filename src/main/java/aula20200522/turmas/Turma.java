package aula20200522.turmas;

import java.util.ArrayList;

public class Turma {
	private String código;
	
	private Aluno líder;
	
	private ArrayList<Aluno> alunos = new ArrayList<>();
	
	
	public Turma(String código) {
		this.código = código;
	}
	
	public String getCódigo() {
		return código;
	}
	
	public void adicionarAluno(Aluno a) {
		this.alunos.add(a);
	}
	public ArrayList<Aluno> getAlunos() {
		return this.alunos;
	}
	public void setLíder(Aluno a) {
		this.líder = a;
	}
	public Aluno getLíder() {
		return this.líder;
	}
}
