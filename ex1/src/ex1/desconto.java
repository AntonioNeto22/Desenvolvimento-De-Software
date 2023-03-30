package ex1;
import java.util.Scanner;
public class desconto {
public static void main(String args[]) {
	/*
	 * Produtos e descontos
Desenvolva uma aplicação em Java, simulando uma rotina de venda. Onde para cada
produto informado, leia: nome, preço e quantidade, escreva o nome do produto comprado e
o valor total a ser pago, considerando que são oferecidos descontos pelo número de unidades
compradas, segundo a tabela abaixo:
	 */
	Scanner leitor = new Scanner (System.in);
	String produto;
	double preco=0;
	double total =0;
	int quantidade=0;
	double precofinal=0;
	System.out.println("Digite o nome do produto que quer comprar: ");
	produto= leitor.next();
	leitor.reset();
	System.out.println("Digite o preço do produto: ");
	preco= leitor.nextDouble();
	leitor.reset();
	System.out.println("Digite a quantidade de produto que você deseja: ");
	quantidade= leitor.nextInt();
	total= preco*quantidade;
	leitor.reset();
	System.out.println("Você está comprando "+ produto+ ""+ "Com o valor de: "+ total);
	if(quantidade<=10) {
		System.out.println("Você não possui descontos nessa compra");
		
	}else if(quantidade>=11 && quantidade<21){
		precofinal= total - (total*0.1);
		System.out.println("Parabéns, você teve um desconto de 10% o valor a ser pago agora será de: "+ precofinal);
	
	}else if(quantidade>= 21 && quantidade<51) {
		precofinal= total - (total*0.2);
		System.out.println("Parabéns, você teve um desconto de 20% o valor a ser pago agora será de: "+ precofinal);
	
	}else if(quantidade>50){
		precofinal= total - (total*0.25);
		System.out.println("Parabéns, você teve um desconto de 25% o valor a ser pago agora será de: "+ precofinal);
	}
}
}
