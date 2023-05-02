
import java.util.Scanner;
public class Avisos {
	public static void main(String args[]) {
		/*Desenvolva uma aplicação em Java em que: 
		 * 
		 * A empresa de saneamento de uma cidade que controla o índice de poluição da água e
		mantém 3 grupos de indústrias que são altamente poluentes para o meio ambiente.
		• O índice de poluição aceitável varia de 0,06 até 0,16.
		• Se o índice sobe para 0,25 as indústrias do 1ž grupo são intimadas a reduzirem em 50%
		suas atividades;
		• Se o índice crescer para 0,4 as industrias do 1ž e 2ž grupo são intimadas a suspenderem
		suas atividades.
		• Se o índice atingir 0,5 todos os grupos devem ser notificados a paralisarem suas atividades.
		• Desenvolva um programa em Java Orientado a objetos, que leia o índice de poluição
		medido e emita a notificação adequada aos diferentes grupos de empresas.*/
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o índice de poluição: ");
		double indicePoluicao = (sc.nextDouble());
		sc.reset();
		Grupo1 g1 = new Grupo1(indicePoluicao);
		g1.saneamento();
	}
}
