package deckcards;

public class Diamond extends Card{

	public Diamond(char value) {
		super(value);
	}

	public String toString(){
		return this.value+" ♦";
	}

}
