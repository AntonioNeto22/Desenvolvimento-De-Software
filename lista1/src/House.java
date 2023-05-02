
public class House {
	
	String color;
	Door door1;
	Door door2;
	Door door3;
	
	void paint(String s) {
		this.color =s;
	}
	
	int qhowDoorIsOpen() {
		int contador=0;
		if(this.door1.isOpen()){
			contador++;
		}
		if(this.door2.isOpen()) {
			contador++;
		}
		if(this.door3.isOpen()) {
			contador++;
		}
		return contador;
	}
}
