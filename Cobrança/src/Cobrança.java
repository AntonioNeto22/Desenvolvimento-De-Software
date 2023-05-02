import java.util.Scanner;

public class Cobrança {
	public static void main(String args[]) {
		/*Uma empresa de vendas precisa implementar a rotina de cobrança com a seguinte regra:
		• Os boletos atrasados devem receber uma multa de 5% ao constar em atraso;
		• O valor do boleto deve ser recalculado a cada dia com juros de 1% por dia de atraso
		(juros sobre juros);
		• Desenvolva um programa em Java, Orientado a Objetos que dado o valor original do
		boleto, e os dias de atraso calcule o valor total a ser pago;
		
		Exemplo: Um boleto no valor de R$ 259,90 com 2 dias de atraso deve ser recalculado em R$
		278,38*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do boleto: ");
		double boleto = (sc.nextDouble());
		sc.reset();
		
		System.out.println("Digite os dias: ");
		int dias = (sc.nextInt());
		sc.reset();

		Juros j = new Juros(boleto,dias);
		j.jurosSobreJuros();
		
		
		//int num1=1;
		//int num2=2;
		//int total=0;
		
		//total= num1+num2;
		//total = soma();
		//public void soma(num1 + num2){
			//int total = num1+num2;
			//return total;
		//}
	}
}
