package com.study.uml;

interface NavegadorWeb {
	abstract public void exibirPagina(String url, String proprietario);
	abstract public void adicionarNovaAba(String proprietario);
	abstract public void atualizarPagina(String proprietario);
}
