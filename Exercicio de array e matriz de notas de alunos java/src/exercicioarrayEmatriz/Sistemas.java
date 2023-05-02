package exercicioarrayEmatriz;
import java.util.Scanner;
public class Sistemas {
	public static void main (String args[]) {
		/* Desenvolva uma aplicação em java de notas de uma sala de aula:
		 * 
		 * Turma(qtd a escolher) cada aluno duas notas e média final
		 * 1 Array de nomes de alunos
		 * 1 Array multidimensional de notas, coluna média e calculada
		 * Exiba a maior e menor nota e media da turma
		 */
		Scanner leitor = new Scanner (System.in);
		System.out.println("Digite a quantidade de alnos da turma: ");
		int qtd = leitor.nextInt();
		int indexMenor=0, indexMaior=0;
		String alunos[] = new String [qtd];
		double notas[][]= new double [qtd][3];
		for(int i=0;i<qtd; i++) {
			System.out.println("Digite o nome dos alunos: "+ alunos[i]);
			alunos[i]= leitor.next();
			leitor.reset();
			System.out.println("Digite a primeira nota "+ alunos[i]);
			notas[i] [0]= leitor.nextDouble();
			System.out.println("Digite a segunda nota "+ alunos[i]);
			notas[i] [1]= leitor.nextDouble();
			leitor.reset();
			notas[i][2] = (notas[i][0] + notas[i][1])/2;
			if(notas[i][2] < notas[indexMenor][2]) {
				indexMenor=i;
			}
			if(notas[i][2] > notas[indexMaior][2]) {
				indexMaior=i;
			}
		}
		System.out.println("A maior nota da turma é "+alunos[indexMaior]+ " Nota: "+ notas[indexMaior][2]);
		System.out.println("A maior nota da turma é "+alunos[indexMenor]+ "Nota: "+ notas[indexMenor][2]);
	}
	
	
}
