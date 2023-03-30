package ex4;
import java.util.Scanner;
public class data {
	public static void main (String args[]) {
	/*
	 * Desenvolva uma aplicação em Java, que receba como parâmetro um número inteiro relativo
a um mês do ano, retorne uma string com o nome deste mês por extenso e retorne uma
mensagem "Inválido!"para números que não reprentem um mês. Utilize o conceito de array
para solucionar o problema.
	 */
	Scanner leitor= new Scanner (System.in);
	int numeroMes=0;
	System.out.println("Digite em numero um mes do ano: ");
	numeroMes= leitor.nextInt();
	String mes[]= new String [11];
	switch(numeroMes) {
	case 1:
		mes[0]= "Janeiro";
		System.out.println("O número digitado corresponde ao mês de: " + mes[0]);
		break;
		
	case 2:
		mes[1]= "Fevereiro";
		System.out.println("O número digitado corresponde ao mês de: " + mes[1]);
		break;
		
	case 3:
		mes[2]= "Março";
		System.out.println("O número digitado corresponde ao mês de: " + mes[2]);
		break;
		
	case 4:
		mes[3]= "Abril";
		System.out.println("O número digitado corresponde ao mês de: " + mes[3]);
		break;
		
	case 5:
		mes[4]= "Maio";
		System.out.println("O número digitado corresponde ao mês de: " + mes[4]);
		break;
		
	case 6:
		mes[5]= "Junho";
		System.out.println("O número digitado corresponde ao mês de: " + mes[5]);
		break;
		
	case 7:
		mes[6]= "Julho";
		System.out.println("O número digitado corresponde ao mês de: " + mes[6]);
		break;
		
	case 8:
		mes[7]= "Agosto";
		System.out.println("O número digitado corresponde ao mês de: " + mes[7]);
		break;
		
	case 9:
		mes[8]= "Setembro";
		System.out.println("O número digitado corresponde ao mês de: " + mes[8]);
		break;
		
	case 10:
		mes[9]= "Outubro";
		System.out.println("O número digitado corresponde ao mês de: " + mes[9]);
		break;
		
	case 11:
		mes[10]= "Novembro";
		System.out.println("O número digitado corresponde ao mês de: " + mes[10]);
		break;
		
	case 12:
		mes[11]= "Dezembro";
		System.out.println("O número digitado corresponde ao mês de: " + mes[11]);
		break;
		
		default:
			System.out.println("O Número digitado é ínvalido, digite um número válido de 1 a 12");
   }
	
	}
}
