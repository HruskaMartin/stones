package stones;

import java.util.Random;

public class Field {

	private final Stone[][] stones;

	public int rowCount;
	public int columnCount;
	public int stoneCount;

	private StateOfGame state = StateOfGame.PLAYING;

	// final int stoneCount = 15;

	public Field(int rowCount, int columnCount, int stoneCount) {
		this.rowCount = rowCount;
		this.columnCount = columnCount;
		this.stoneCount = stoneCount;
		stones = new Stone[rowCount][columnCount];

		generate();
	}

	private void generate() {
		generateNumber();
		// generatEemptyPlace();
	}

	/*
	 * private void generatEemptyPlace() { Random random = new Random();
	 * 
	 * int minesToSet = 1; while (minesToSet > 0) { int row =
	 * random.nextInt(rowCount); int column = random.nextInt(columnCount); if
	 * (stones[row][column] == null) { stones[row][column] = new emptyPlace();
	 * minesToSet--; } }
	 * 
	 * }
	 * 
	 * private void generateNumber() { for (int row = 0; row < rowCount; row++) {
	 * for (int column = 0; column < columnCount; column++) { if
	 * (stones[row][column] == null) { stones[row][column] = new Number(); } } }
	 * 
	 * }
	 */
	public int getRowCount() {
		return rowCount;
	}

	public void setRowCount(int rowCount) {
		this.rowCount = rowCount;
	}

	public int getColumnCount() {
		return columnCount;
	}

	public void setColumnCount(int columnCount) {
		this.columnCount = columnCount;
	}

	public int getStoneCount() {
		return stoneCount;
	}

	public void setStoneCount(int stoneCount) {
		this.stoneCount = stoneCount;
	}

	public Stone getStone(int row, int column) {
		return stones[row][column];
	}

	public void generateNumber() {
		int pocet = stoneCount;
		if (pocet > 0) {
			for (int i = 0; i < rowCount; i++) {
				for (int j = 0; j < columnCount; j++) {
					// if(stones[i][j] != stones[rowCount - 1][columnCount - 1]) {
					if (stones[i][j] == null) {
						stones[i][j] = new Number();
						pocet--;
					}
				}
			}
		}
	}

	public StateOfGame getState() {
		return state;
	}

}
