
public class Calendario {
	public static void main(String args[]) {
		
		/*Desenvolva um aplicação em Java: 
		 * 
		 * Crie uma classe para representar datas.
• Apresente a data utilizando três atributos: dia, mês, e ano.
• Sua classe deve ter um construtor que inicializa os três atributos e verifica a validade dos
valores fornecidos.
• Desenvolva um construtor sem parâmetros que inicializa a data com a data atual fornecida
pelo sistema operacional.
• Desenvolva um método set um get para cada atributo.
• Desenvolva o método toString para retornar uma representação de data como string.
Considere que a data deve ser formatada mostrando o dia, o mês e o ano separados por
barra (/).
• Desenvolva um método para avançar uma data para o dia seguinte.
• Escreva um aplicativo de teste que demonstra as capacidades da classe.*/
		
		
		Datas d = new Datas();
		d.setDia(22);
		d.setMes(07);
		d.setAno(1998);
		d.toString();
		d.avancaData();
		System.out.println(d.toString());
	}
}
