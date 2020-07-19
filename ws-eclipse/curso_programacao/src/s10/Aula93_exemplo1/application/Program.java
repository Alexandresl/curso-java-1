package s10.Aula93_exemplo1.application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		
		System.out.println(list.size());
		
		System.out.println("");
		System.out.println("-[Adicionou itens]");
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("");
		System.out.println("-[Removeu itens]");
		
		list.remove("Anna");
		//list.remove(1);
		list.removeIf(x -> x.charAt(0) == 'M');

		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("");
		System.out.println("-[Posi��o de itens]");
		
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		
		list.add("Maria");
		list.add("Anna");
		list.add(2, "Marco");
		
		System.out.println("");
		System.out.println("-[Adicionando itens novamente]");
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("");
		System.out.println("-[Mantendo apenas itens que atendem criterio]");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("");
		System.out.println("-[primeiro elemento que atende ao crit�rio]");
		
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		
		String name2 = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		
		System.out.println(name);
		System.out.println(name2);
		
	}

}