package ex7;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class repeticoes {
	public static void main (String args[]) {
		/*
		 * Desenvolva um programa em Java que leia um array com 20 números inteiros. O programa
deve imprimir os elementos do vetor exceto os elementos repetidos.

		 */
		Scanner leitor= new Scanner (System.in);
		List<Integer> resultado = new ArrayList<>();
		int valores =0;
		int numeros[] = new int [20];
		for(int i= 0; i<numeros.length; i++) {
			System.out.println("Digite números inteiros: "+ i);
			numeros[i] = leitor.nextInt();
			leitor.reset();
			
		}
		for (int j: numeros ) {
			if(!resultado.contains(j)) {
				resultado.add(j);
			}
		
		}
		for (int j: resultado ) {
			System.out.println(""+ j);
		
		}
	}
}
