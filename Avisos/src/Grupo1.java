
public class Grupo1 {
	private double indicePoluicao;
	
	public Grupo1 (double indicePoluicao) {
		this.indicePoluicao = indicePoluicao;
	}
	
	public double getIndicePoluicao() {
		return this.indicePoluicao;
	}
	
	public void setIndicePoluicao(double indicePoluicao) {
		this.indicePoluicao = indicePoluicao;
	}
	
	public double saneamento() {
		if(getIndicePoluicao() >= 0.06 && getIndicePoluicao() <=0.16) {
			System.out.println("O índice de poluição está aceitável");
			
		}else if(getIndicePoluicao()>=0.25 && getIndicePoluicao()<0.4) {
			System.out.println("O grupo 1z foi intimado a reduzir suas atividades em 50%");
		}else if(getIndicePoluicao()>=0.4 && getIndicePoluicao()<0.5) {
			System.out.println("Os grupos 1z  e 2z foram intimados a suspenderem suas atividades");
		}else if(getIndicePoluicao()>=0.5){
			System.out.println("Todos os grupos devem pararem suas atividades");
		}
		return getIndicePoluicao();
	}
}
