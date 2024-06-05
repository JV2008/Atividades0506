package aula0506;

import java.util.ArrayList;
import java.util.Arrays;


public class FrutazDez {

	public static void main(String[] args) {
		String[] frutas = {"banana","maçã","laranja","melão","morango","melancia","limão","pera","goiaba","amora"};
		ArrayList<String> novaLista = new ArrayList<String>(Arrays.asList(frutas));

		novaLista.remove("morango");
		novaLista.remove("melancia");
		novaLista.remove("pera");
		novaLista.remove("goiaba");
		novaLista.remove("amora");


		for (String i: novaLista)	{			
			System.out.println("lista atualizada :  " +i);	
		}
			for (String i1: frutas) {
				System.out.println("lista antiga : "  +i1);
			}
		

	}
}