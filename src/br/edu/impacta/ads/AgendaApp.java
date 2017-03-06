package br.edu.impacta.ads;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.out;

public class AgendaApp {
	private static Scanner entrada =  new Scanner(System.in);
	private static List<Contato> contatos = new ArrayList<>();
	public static void main(String[] args) {
		boolean sair = false;
		while (!sair){
			int opcao = apresentarMenuPrincipal();
			switch(opcao) {
			case 1: inserirContato(); break;
			case 2: buscarContato(); break;
			case 3: sair = true; break;
			default: out.println("Erro: opção inválida!");
			}
		}
		out.println("\nFim do programa!");
	}
	
	private static int apresentarMenuPrincipal (){
		boolean inteiro  = false
		int opcao = 0;
		while (!inteiro){
			out.println("\nAGENDA TELEFÔNICA");
			out.println("(1) Inserir");
			out.println("(2) Buscar");
			out.println("(3) Sair");
			out.println("Escolha uma opção: ");
			String s = entrada.nextLine();
			try {
				opcao = Integer.parseInt(s);
				inteiro = true;
			} catch(Exception e){
				out.println("ERRO: opção deve ser um valor inteiro!");
			}
			return opcao;
		}
	}
}
