
public class Juros {
	private double boleto;
	private int dias;
	
	public double getBoleto() {
		return this.boleto;
	}
	
	public void setBoleto(double boleto) {
		this.boleto = boleto;
	}
	
	public int getDias() {
		return this.dias;
	}
	
	public void setDias(int dias) {
		this.dias = dias;
	}
	
	public Juros(double boleto, int dias) {
		this.boleto = boleto;
		this.dias = dias;
	}
	
	public void jurosSobreJuros() {
		double total;
		int cont =1;
		if(getDias()>=1) {
			total = getBoleto() + (5 * getBoleto() /100);
			for(cont = 1;cont<=getDias();cont++) {
				total = total  + (total*0.01);
			}
			System.out.println("O boleto com juros será de: "+ total);
		}
		
	}
	
	
}
