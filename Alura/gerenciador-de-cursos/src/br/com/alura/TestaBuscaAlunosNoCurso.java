package br.com.alura;

public class TestaBuscaAlunosNoCurso {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando coleções", 22));

		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a3 = new Aluno("Mauricio Aniche", 17645);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		for (Aluno aluno : javaColecoes.getAlunos()) {
			System.out.println(aluno);
		}
		System.out.println("----------------");
		
		
		System.out.println("Quem é o aluno com matricula 5617?");
		System.out.println(javaColecoes.buscaMatriculado(5617));
		
	}

}
