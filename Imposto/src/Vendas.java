
public class Vendas {
	private double vendasMes;
	
	public double getVendasMes() {
		return this.vendasMes;
	}
	
	public void setVendasMes(double vendasMes) {
		this.vendasMes = vendasMes;
	}
	
	public void passouLimiteMes() {
		double mei = 0.10;
		double multa=0;
		double excesso= 0;
		if(getVendasMes()>=500) {
			excesso =(getVendasMes()-500);
			multa= (excesso * mei);
			System.out.println("O valor da multa será = "+ multa);
			
		}else {
			System.out.println("O valor da multa é = "+ excesso);
			
		}
		
	}
}
