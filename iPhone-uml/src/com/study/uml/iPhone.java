package com.study.uml;

public class iPhone implements AparelhoTelefonico, ReprodutorMusical, NavegadorWeb {
    
	@Override
	public void atender(String proprietario) {
		System.out.println("Atendendo do iPhone de "+ proprietario);
	}
	@Override
	public void ligar(String numeroTelefone, String proprietario) {
		System.out.println("Ligando para "+ numeroTelefone + " do iPhone de "+ proprietario);
	}
	@Override
	public void inicarCorreioVoz(String proprietario) {
		System.out.println("Iniciando correio de voz do iPhone de "+proprietario);
	}

	
	@Override
	public void exibirPagina(String url, String proprietario) {
		System.out.println("Exibindo pagina " + url + "  no iPhone de " + proprietario);
	}
	@Override
	public void adicionarNovaAba(String proprietario) {
		System.out.println("Adicionando nova aba no navegador do iPhone de "+ proprietario);
	}
	@Override
	public void atualizarPagina(String proprietario) {
		System.out.println("Atualizando pagina web no iPhone de "+ proprietario);
	}

	
	@Override
	public void tocarMusica(String proprietario) {
		System.out.println("Reproduzindo musica no iPhone de "+ proprietario);
	}
	@Override
	public void pausarMusica(String proprietario) {
		System.out.println("Pausando musica no iPhone de " + proprietario);
	}
	public void selecionarMusica(String musica, String proprietario) {
		System.out.println("Reporduzindo " + musica + " no iPhone de " + proprietario);
	}
	
}
