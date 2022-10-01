package Exercicio2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println(" - Apresenta nome e matricula - ");
		System.out.println("Digite o nome: ");
		String nome1 = s.nextLine();
		System.out.println("Digite a matricula: ");
		String matricula1 = s.nextLine();
		System.out.println("Digite a data de nascimento: ");
		String dataNasc = s.nextLine();
		System.out.println("Digite o ano de inicio ");
		String aInicio = s.nextLine();
		System.out.println(" --------------------------- ");
		Aluno a = new Aluno();
		a.alunoMatricula(nome1, matricula1);
		System.out.println(" --------------------------- ");
		a.dNascimento(dataNasc);
		System.out.println(" --------------------------- ");
		a.alunoCompleto(nome1, dataNasc, aInicio);
		s.close();
	}

}
