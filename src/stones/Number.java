package stones;

public class Number extends Stone{
	public int number;
	
	public Number(int number) {
		super();
		this.number = number;
	}
	
	public Number() {
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}
