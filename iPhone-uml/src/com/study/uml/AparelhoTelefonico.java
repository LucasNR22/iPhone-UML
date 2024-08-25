package com.study.uml;

public interface AparelhoTelefonico {
	abstract public void atender(String proprietario);
	abstract public void ligar(String numeroTelefone, String proprietario);
	abstract public void inicarCorreioVoz(String proprietario);
	
}
