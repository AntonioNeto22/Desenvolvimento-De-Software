import java.util.Scanner;
import java.util.ArrayList;
public class Pesquisa {
	public static void main (String args[]) {
		/* Desenvolva uma aplicação em Java de Pesquisa de Habitantes:
		 * 
		 * Foi feita uma pesquisa entre os habitantes de uma cidade. Foram coletados os dados de
			idade, gênero (M/F) e renda. Faça uma aplicação em Java Orientada a Objetos contenha um
			menu onde seja possível registrar, os dados de cada habitante e, ainda consultar as seguintes
			informações:

		 */
		Scanner sc = new Scanner(System.in);
		Habitantes hb1 = new Habitantes();
		Habitantes hb2 = new Habitantes();
		ArrayList <Habitantes> habitantes = new ArrayList<>();
		String menu = "---MENU---"
				+ "Opção 1: Média de salário do grupo \n"
				+ "Opção 2: Maior e menor idade do grupo\n"
				+ "Opção 3: Quantidade de habitantes do gênero masculino com salário até R$ 1000,00\n"
				+ "Opção 4: Quantidade de habitantes do gênero feminino";
		int option;
		do {
			System.out.println(menu);
			option = (sc.nextInt());
			sc.reset();
			switch(option) {
			case 1:
				System.out.println("Digite sua idade: ");
				hb1.setIdade(sc.nextInt());
				sc.reset();
				
				System.out.println("Digite seu genero: ");
				hb1.setGenero(sc.next());
				sc.reset();
				
				System.out.println("Digite sua renda: ");
				hb1.setRenda(sc.nextDouble());
				sc.reset();
				
				System.out.println("===Cadastro da Segunda pessoa===");
				
				System.out.println("Digite sua idade: ");
				hb2.setIdade(sc.nextInt());
				sc.reset();
				
				System.out.println("Digite seu genero: ");
				hb2.setGenero(sc.next());
				sc.reset();
				
				System.out.println("Digite sua renda: ");
				hb2.setRenda(sc.nextDouble());
				sc.reset();
				
				double rendas = (hb1.getRenda() + hb2.getRenda())/2;
				System.out.println("A média da renda é: "+rendas);
				
				habitantes.add(hb1);
				habitantes.add(hb2);
				break;
				
			case 2:
				int maiorIdade=0;
				if(hb1.getIdade()>maiorIdade) {
					maiorIdade = hb1.getIdade();
					System.out.println("A maior idade é:"+ maiorIdade);
				}
				
				int menorIdade=0;
				if(hb2.getIdade()<menorIdade) {
					menorIdade = hb2.getIdade();
					System.out.println("A maior idade é:"+ menorIdade);
				}	
				
			}
			
			
			
		}while(option!=0);
	}
}
