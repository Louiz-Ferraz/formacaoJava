package br.com.alura;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {
	
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	private Set<Aluno> alunos = new HashSet<>();
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<Integer, Aluno>();
	
	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}
	
	public String getInstrutor() {
		return instrutor;
	}
	
	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}
	
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}
	
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
	
	public int getTempoTotal() {
		int tempoTotal = 0;
		for (Aula aula : aulas) {
			tempoTotal += aula.getTempo();
		}
		return tempoTotal;
	}
	
	@Override
	public String toString() {
		return "[Curso: " + this.nome + ", Tempo total: " + this.getTempoTotal() + ", Aulas: " + this.aulas + "]";
	}

	public void matricula(Aluno alunoNovo) {
		this.alunos.add(alunoNovo);
		this.matriculaParaAluno.put(alunoNovo.getNumeroMatricula(), alunoNovo);
	}

	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}

	public Aluno buscaMatriculado(int numeroMatricula) {
		if(!matriculaParaAluno.containsKey(numeroMatricula)) {
			throw new NoSuchElementException("matricula " + numeroMatricula + " não encontrada!");
		};
		return matriculaParaAluno.get(numeroMatricula);
	}
	
}
