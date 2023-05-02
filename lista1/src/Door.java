
public class Door {
	boolean open;
	String color;
	double widht;
	double height;
	double depht;
	
	void open() {
		this.open = true;
		
	}
	
	void close() {
		this.open = false;
	}
	
	void paint(String s) {
		this.color = s;
		
		
	}
	

	boolean isOpen(){
		return open;
	}
}
