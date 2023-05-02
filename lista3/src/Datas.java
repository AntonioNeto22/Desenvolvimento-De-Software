import java.util.Calendar;

public class Datas {
	private int dia;
	private int mes;
	private int ano;
	
	
	public Datas(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	public Datas() {
		Calendar c = Calendar.getInstance();
		this.ano = c.get(Calendar.YEAR);
		this.mes = c.get(Calendar.MONTH);
		this.dia = c.get(Calendar.DAY_OF_MONTH);
	}
	public int getDia() {
		return this.dia;
	}
	
	public void setDia(int dia) {
		this.dia = dia;
	}
	
	public int getMes() {
		return this.mes;
	}
	
	public void setMes(int mes) {
		this.mes = mes;
	}
	
	public int getAno() {
		return this.ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String toString() {
		return "Dia atual :" +  this.getDia() +"/" + "Mês atual :" + this.getMes() + "/" + "Ano atual :" + this.getAno();
	}
	
	public void avancaData(){
		setDia(getDia()+1);
	}
}
