package br.com.eduardohmf;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import br.com.eduardohmf.conta.ContaBancaria;
import br.com.eduardohmf.exception.LimiteCreditoExcedidoException;
import br.com.eduardohmf.model.Pessoa;
import br.com.eduardohmf.poo.Aluno;
import br.com.eduardohmf.poo.Carro;

public class Principal {
	
	public static void lerArquivo(String nome) throws FileNotFoundException {
		FileInputStream file = new FileInputStream(nome);
	}
	
	public static void main(String[] args) {
		System.out.println("Bom dia turma!!!");
		
		List<String> nomes = new ArrayList<>();
		
		//adicionar os nomes à lista:
		nomes.add("Tiao"); //0
		nomes.add("Jao"); //1
		nomes.add("Ana"); //2
		
		//imprimir a lista for-each
		for(String nome : nomes) {
			System.out.println("- " + nome);
		}
		
		nomes.add("Fulano"); //3
		nomes.remove(2);
		
		//imprimir a lista for-each
		for(String nome : nomes) {
			System.out.println("- " + nome);
		}
		
		System.out.println(nomes.get(0)); //buscar elemento por indice
		
		if(!nomes.contains("Ana"))
			nomes.add("Ana");
		else
			nomes.add("Maria");
		System.out.println("----------------------------------");
		//imprimir a lista for-each
		for(String nome : nomes) {
			System.out.println("- " + nome);
		}
		System.out.println("----------------------------------");
		//Loop por Iterator
		Iterator<String> it = nomes.iterator();
		while(it.hasNext()) {
			String nome1 = it.next();
			System.out.println("* " + nome1);
		}
		
		System.out.println("----------------------------------");
		//ordenar a lista
		Collections.sort(nomes);
		it = nomes.iterator();
		while(it.hasNext()) {
			String nome1 = it.next();
			System.out.println("* " + nome1);
		}
		
		System.out.println("----------------------------------");
		Pessoa p1 = new Pessoa(1, "Ana", "email1");
		Pessoa p2 = new Pessoa(2, "Maria", "email2");
		Pessoa p3 = new Pessoa(3, "Jose", "email3");
		Pessoa p4 = new Pessoa(4, "Tiao", "email4");
		Pessoa p5 = new Pessoa(4, "Ana Maria", "email5");

		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		pessoas.add(p4);
		for(Pessoa pessoa : pessoas) {
			System.out.println("- " + pessoa.toString());
		}
		System.out.println("----------------------------------");
		List<Pessoa> nomesFiltrados = pessoas.stream()
				.filter(pessoa -> "Ana".equals(pessoa.getNome()))
				.collect(Collectors.toList());
		
		nomesFiltrados.forEach(System.out::println);
		
		System.out.println("----------------------------------");
		Set<String> alunos = new HashSet<String>();
		alunos.add("Ana");
		alunos.add("Tiao");
		alunos.add("Jose");
		alunos.add("Ana"); //esse não vai ser inserido.
		alunos.forEach(System.out::println);
		
		
		//Criar uma lista de países e suas capitais:
		System.out.println("----------------------------------");
		Map<String, String> paises = new HashMap<>();
		paises.put("BRASIL", "Brasilia");
		paises.put("PORTUGAL", "Lisboa");
		paises.put("FRANCA", "Paris");
		paises.put("ARGENTINA", "Buenos Aires");
		
		//iteração:
		for(Map.Entry<String, String> entry : paises.entrySet()) {
			System.out.println("# " + entry.getKey() + " | " + entry.getValue());
		}
		
		//pesquisar capital por país
		System.out.println("----------------------------------");
		System.out.println(paises.get("FRANCA"));
		paises.put("CHINA", "Pequim");
		
		if(paises.containsKey("CHINA"))
			System.out.println(paises.get("CHINA"));
		else
			System.out.println("Nao tem paIs CHINA!");
		
		System.out.println("----------------------------------");
		for(String pais : paises.keySet()) {
			System.out.println("& " + pais + " | " + paises.get(pais));
		}
		
		/*
		try {
			int divisao = 10 / 0;
		} catch (ArithmeticException e) {
			System.out.println(" - Erro: " + e.getMessage() + "\n - - " + e.getStackTrace());
		}
				
		System.out.println("Saiu da divisao por zero");
		System.out.println("----------------------------------");
		
		try {
			int[] numeros = {0,1,2};
			
			int valor1 = 0;
			for(int i = 0; i <= 2; i++) {
				valor1 = numeros[i];			
				int valor2 = 10 / valor1;
				System.out.println("Valor2 = " + valor2);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(" - Erro ao buscar posicao no array: " + e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println(" - Erro em calculo: " + e.getMessage());
		}
		System.out.println("** Continuou 01");
		System.out.println("----------------------------------");
		
		try {
			lerArquivo("");
		} catch (FileNotFoundException e) {
			System.out.println(" - Erro ao ler arquivo: " + e.getMessage());
			//e.printStackTrace();
		}
		System.out.println("** Continuou 02");
		System.out.println("----------------------------------");
		
		ContaBancaria conta = new ContaBancaria();
		try {
			conta.fazerSaque(1500.0);
		} catch (LimiteCreditoExcedidoException e) {
			System.out.println(e.getMessage());
			System.out.println("Quantia excedida: " + e.getQuantiaExcedida());
		}
		*/
		/*
		boolean condicao = true;
		if(!condicao) {
			System.out.println("Condição verdadeira");
		}else {
			System.out.println("Condição falsa");
		}
		
		int x = 5;
		if(x > 5) {
			System.out.println("x > 5");
		}else if(x < 5) {
			System.out.println("x < 5");
		}else {
			System.out.println("x == 5");
		}
		
		//case
		int z = 2;
		switch(z) {
			case 1: System.out.println("z == 1"); break;
			case 2:
			case 3:
				System.out.println("z == 2 ou z == 3");
				break;
			case 10:
				System.out.println("z == 10");
				break;
			default:
				System.out.println("default");
				break;
		}
		System.out.println("----------------------------------");
		Carro carro = new Carro("VERDE", "BYD", "PLUS");
		System.out.println(carro.toString());
		System.out.println("----------------------------------");
				
		carro.setCor("AZUL");
		System.out.println(carro.toString());
		
		System.out.println("----------------------------------");
		
		// o carro do jão será um Fiat Mobi... 
		Carro jao = new Carro("FIAT", "MOBI");
		System.out.println(jao.toString());
		*/
		
		/*
		System.out.println("----------------------------------");
		
		Aluno aluno1 = new Aluno("0001","08/02/2024","Fulano","fulano@indra.com");		
		System.out.println(aluno1.toString());
		
		System.out.println("----------------------------------");
		
		Aluno aluno2 = new Aluno("0002","08/02/2024","Beltrano","beltrano@indra.com","61 00000-0000");
		System.out.println(aluno2.toString());
		
		System.out.println("----------------------------------");
		*/
		
	}

}