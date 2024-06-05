package aula0506;

import java.util.ArrayList;
import java.util.Random;

public class Negativo0506 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numeros = new ArrayList <>();
		int soma=0;
		Random random = new Random();

		for (int i = 0; i <5; i++) {
			int numeroAleatorio = random.nextInt();
			numeros.add(numeroAleatorio);
			System.out.println(numeros);
		}
		for (int numero: numeros) {
			if (numero<0) {
				soma += numero;
			}
		}
		System.out.println("Os numeros negativos somados são " +soma);
	}
}