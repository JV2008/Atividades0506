package aula0506;

import java.util.ArrayList;
import java.util.Scanner;

public class CarrosDez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler= new Scanner (System.in);
		ArrayList<String> carros = new ArrayList<String>();

		carros.add("Fusca");
		carros.add("Brasília");
		carros.add("Chevette");
		carros.add("Monza");
		carros.add("GOl Quadrado");
		carros.add("Corsa");
		carros.add("Vectra");
		carros.add("Palio");
		carros.add("Uno branco com escada");
		carros.add("Astra");

		int modelo;
		

		System.out.println("Escolha um automóvel entre um número de 0 à 9");
		modelo = ler.nextInt();
		
	    System.out.println(carros.get(modelo));



		ler.close();
	}
}