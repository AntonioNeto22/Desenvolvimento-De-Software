
public class Sistema {
	public static void main (String args[]) {
		/*
		 * Desenvolva uma aplicação que trabalhe com a classe Dooră
Atributos: open, color, width, height, depth;
Métodos: void open(), void close(),void paint(String s), boolean isOpen().
Na classe que contém o método main: Crie uma Door, open e close a mesma, paint de
diversas cores, altere suas dimensões e use o método isOpen para verificar se ela está aberta.

Desenvolva uma aplicação que trabalhe com a classe House;
Atributos: color, door1, door2, door3 (Use a Classe Door da questão anterior);
Método: void paint(String s), int qhowDoorIsOpen();
Na Classe que contém o método main: Crie uma casa e pinte-a. Crie três portas e
coloque-as na casa; abra e feche as mesmas como desejar. Utilize o métodoquantasPortasEstaoAbertaspara imprimir o número de portas abertas.
		 */
		
		Door d = new Door();
		d.open();
		d.close();
		d.paint("red");
		d.widht=8.1;
		d.height = 10.0;
		d.depht = 5.5;
		d.isOpen();
		House h = new House();
		h.paint("Green");
		h.door1 = new Door();
		h.door2 = new Door();
		h.door3 = new Door();
		h.door1.open();
		h.door2.close();
		h.door3.open();
		System.out.println(h.qhowDoorIsOpen());
		
	}
}
