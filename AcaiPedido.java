package aula2905ofc;

import java.util.ArrayList;
import java.util.Scanner;

public class AcaiPedido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler= new Scanner (System.in);
		ArrayList<String> ingredientes = new ArrayList<String>();
		
		ingredientes.add("banana");
		ingredientes.add("morango");
		ingredientes.add("leite em pó");
		ingredientes.add("nutella");
		ingredientes.add("choc branco");
		

		int valor,retirar=0;


		System.out.println("Para finalizarmos o pedido pretende realizar alguma alteração ? se quiser tirar algo digite 0 se quiser colocar digite 1 se quiser manter digite outro numero");
		valor = ler.nextInt();
		if (valor == 1) {
			System.out.println("deseja colocar qual item em seu pedido ? ");
			ingredientes.add(ler.next());
			System.out.println( "o ingrediente adicionado foi" + ingredientes);
		}
		if  (valor <1){
			System.out.println("deseja retirar qual item em seu pedido ? digite de 0 à 4 para selecionar");
			System.out.println(ingredientes.remove("o ingrediente retirado foi" +retirar));
		}
		else {
			System.out.println("deseja manter seu pedido?");
		}	



		
	
		System.out.println("seu pedido foi finalizado !!!" +ingredientes );


		ler.close();
	             }

              

           } 
        
      