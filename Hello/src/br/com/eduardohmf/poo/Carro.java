package br.com.eduardohmf.poo;

public class Carro {
	//Atributos
	private String cor;
	private String marca;
	private String modelo;
	
	//métodos
	public void andar() {
		System.out.println("Carro andando.");
	}
	
	public void parar() {
		System.out.println("Carro parado");
	}
	
	//GETs e SETs
	public String getCor() {
		return this.cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
}
