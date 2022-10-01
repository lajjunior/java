package Exercicio2;

public class Aluno {
	public String nome;
	public String matricula;
	public String dataNascimento;
	public String anoInicio;
	
	public void alunoMatricula(String nome, String matricula) {
		this.nome=nome;
		this.matricula=matricula;
		String valores = "Nome = "+ this.nome +  " Matricula = "+ this.matricula;
		System.out.println(valores);
	}

	public void dNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
		String valores = "Data de Nascimento = "+ this.dataNascimento;
		System.out.println(valores);

	}

	public void alunoCompleto(String nome, String dataNascimento, String anoInicio) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.anoInicio = anoInicio;

		String valores = "Nome = "+ this.nome +  " Data de Nascimento = "+ this.dataNascimento + " Ano Inicio= " +this.anoInicio;
		System.out.println(valores);
	}

}