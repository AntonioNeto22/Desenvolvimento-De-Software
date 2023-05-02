package ex5;
import java.util.Scanner;
public class Salario {
	public static void main (String args[]) {
	/*Desenvolva uma aplicação em Java:
	 * 
	 * Para fazer um levantamento estatístico dos salários de seus funcionários, uma empresa
precisa de um programa em Java que leia uma lista contendo os salários dos funcionários da
empresa. Este programa deve exibir quantos funcionários ganham salário acima da média.
Considerando que não há um número fixo de funcionários, o programa deve perguntar no início
da execução: quantos funcionários possui.
	 */
		Scanner leitor = new Scanner (System.in);
		int funcionario=0;
		System.out.println("Quantos funcionários a empresa possui? ");
		funcionario= leitor.nextInt();
		leitor.reset();
		int qtd = 0;
		double mediaTotal=0;
		double media=0;
		int salario[]= new int [funcionario];
		for(int i = 0; i< funcionario;i++) {
			System.out.println("Digite o salário do primeiro funcinário: "+i);
			salario[i]= leitor.nextInt();
			leitor.reset();
			media = (salario[i] + media);
			mediaTotal= media/funcionario;
		}
		for(int i=0; i<funcionario;i++){
			if(salario[i]>mediaTotal) {
				qtd++;
			}
		
		}
		System.out.println("A quantidade de de funcionarios que recebem acima da média é: "+ qtd);
	}
}
