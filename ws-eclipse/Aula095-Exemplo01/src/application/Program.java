package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		// Adiciona 4 elementos
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		// Adiciona a String Marco na posição 2
		list.add(2, "Marco");
		// ver tamanho: retorno 5
		// System.out.println(list.size());

		for (String x : list) {
			System.out.println(x);
		}

		// remover elemento comparando string
		// list.remove("Anna");
		// Remover elemento pelo índice
		// list.remove(1);
		// Remover elementos por predicado
		list.removeIf(x -> x.charAt(0) == 'M');
		

		System.out.println("--------------------------------------");

		for (String x : list) {
			System.out.println(x);
		}
		
		// Verificar a posição de um elemento
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		// Caso o elemento não exista (retorna -1)
		System.out.println("Index of Bob: " + list.indexOf("Marco"));

		System.out.println("--------------------------------------");

		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("--------------------------------------");
		
		// Verificar o primeiro elemento que atenda um predicado
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println("name: " + name);
		
		name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println("name: " + name);
		
		System.out.println("--------------------------------------");

		for (String x : list) {
			System.out.println(x);
		}
		
		// Filtrar apenas elementos que possuem um predicado
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect((Collectors.toList()));
		
		
		
		
		System.out.println("--------------------------------------");

		for (String x : result) {
			System.out.println(x);
		}

	}

}
