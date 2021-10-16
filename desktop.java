package week3.day1;

public class desktop extends computer {
	public static void desktopSize() {System.out.println("desktopSize");}
	public static void main(String[] args) {
		desktop desk=new desktop();
		desk.computerModel();
		desk.desktopSize();
	}
}
