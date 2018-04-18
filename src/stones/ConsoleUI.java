package stones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConsoleUI {

	private Field field;

	private BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

	private String readLine() {
		try {
			return input.readLine();
		} catch (IOException e) {
			return null;
		}
	}

	public void newGameStarted(Field field) {
		this.field = field;
		do {
			update();
			readLine();

			if (field.getState() == StateOfGame.SOLVED) {
				System.out.println("Hra uspesne ukoncena");
				System.exit(0);
			}

		} while (true);

	}

	public void update() {
		for (int row = 0; row < field.getRowCount(); row++) {
			for (int column = 0; column < field.getColumnCount(); column++) {
				Stone stone = field.getStone(row, column);
				if (stone instanceof Number) {
					System.out.print(((Number) stone).getNumber());
				} else if (stone instanceof EmptyPlace) {
					System.out.print("-");
				}
			}
			System.out.println();
		}
	}

	private void processInput() {
		System.out.println("Zadajte vstup: ");
		String input = readLine();
		input = input.trim();
		try {
			handleInput(input);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private void handleInput(String input) {
		String pattern = ("([wsad]{1})");
		Pattern p = Pattern.compile(pattern);
		Matcher matcher = p.matcher(input);

		if (!matcher.matches()) {
			System.out.println("Zly format vstupu");
		}
		String a = matcher.group(1);

		if (a.equals("w")) {
			//
			return;
		} else if (a.equals("s")) {
			//
			return;
		} else if (a.equals("a")) {
			//
			return;
		} else if (a.equals("d")) {
			//
			return;
		}
		System.exit(0);
	}
}
