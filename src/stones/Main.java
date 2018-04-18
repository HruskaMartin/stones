package stones;

public class Main {

	public Main() {
		ConsoleUI ui = new ConsoleUI();
		Field field = new Field(4, 4, 15);
		ui.newGameStarted(field);

	}

	public static void main(String[] args) {
		new Main();

	}

}
