package com.study.uml;

import java.util.Scanner;

public class meuiPhone {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Ola, bem vindo a Apple. Qual seu nome?");
		String nome = ler.nextLine();
		
		iPhone meuiPhone = new iPhone();
		
		// Metodos AparelhoTelefonico
		meuiPhone.ligar("+5584991090826", nome);
		meuiPhone.atender(nome);
		meuiPhone.inicarCorreioVoz(nome);
		
		// Metodos ReprodutorMusical:
		meuiPhone.tocarMusica(nome);
		meuiPhone.pausarMusica(nome);
		meuiPhone.selecionarMusica("'Big Poppa - The Notorious B.I.G.'", nome);
		
		//Metodos NevegadorWeb:
		meuiPhone.exibirPagina("https://github.com/LucasNR22", nome);
		meuiPhone.adicionarNovaAba(nome);
		meuiPhone.atualizarPagina(nome);
		
		
		
		
		
		ler.close();
	}
}
