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
	
	//construtor
	public Carro(String cor, String marca, String modelo) {
		this.cor = cor;
		this.marca = marca;
		this.modelo = modelo;
	}
	
	// todo carro será da cor branca
	public Carro(String marca, String modelo) {
		this.cor = "BRANCA";
		this.marca = marca;
		this.modelo = modelo;
	}
	
	//GETs e SETs
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}	
	
	@Override
	public String toString() {		
		return "Cor = " + cor + "\nMarca = " + marca + "\nModelo = " + modelo;
	}
}
