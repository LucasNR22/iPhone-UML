package com.study.uml;

interface ReprodutorMusical {
	abstract public void tocarMusica(String proprietario);
	abstract public void pausarMusica(String proprietario);
	abstract public void selecionarMusica(String musica, String proprietario);
}
