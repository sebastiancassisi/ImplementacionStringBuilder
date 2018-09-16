package stringbuilder;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App {

	public static void main(String[] args) {

		StringBuilder texto = new StringBuilder("Hola");
		List<String> palabras = new ArrayList<>();

		palabras.add("a");
		palabras.add("todos");
		palabras.add("mis");
		palabras.add("amigos");

	for (int i = 0; i < palabras.size(); i++) {
		texto.append(" ").append(palabras.get(i));
		if (i == palabras.size()-1) {
			texto.append(" ").append(palabras.get(i)).append(".");
		}
	}

		System.out.println(texto);
		System.out.println(texto.reverse());

		
		//Utilizar el metodo split
		
		String frase = "Hola;a;todos;mis;amigos";
		String[] palabrasSeparadas = frase.split(";");
		
		for (String palabra : palabrasSeparadas) {
			System.out.println(palabra);
		}
	}

}
