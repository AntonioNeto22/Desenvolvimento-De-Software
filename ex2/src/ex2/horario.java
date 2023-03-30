package ex2;
import java.util.Scanner;
public class horario {
public static void main(String args[]) {
	/*
	 * Desenvolva uma aplicação em Java, que receba do usuário o tempo em segundos e escreva
	em horas, minutos e segundos.
	 */
		Scanner leitor= new Scanner(System.in);
		int tempo=0;
		double horas;
		double minutos;
		System.out.println("Digite o tempo em segundos para saber em horas: ");
		tempo = leitor.nextInt();
		leitor.reset();
		horas= (tempo/3600);
		System.out.println("O tempo em digitado em segundos transformados em horas é: "+ horas);
		System.out.println("Digite o tempo em segundos para saber em minutos: ");
		tempo = leitor.nextInt();
		leitor.reset();
		minutos = (tempo/60);
		System.out.println("O tempo digitado em segundos transformado em minutos é: "+ minutos);
		System.out.println("\nO seu tempo em segundos é: \n"+ tempo);
		
		
}

}
