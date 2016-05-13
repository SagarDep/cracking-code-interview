package deckcards;

public class Spade extends Card{

	public Spade(char value) {
		super(value);
	}

	public String toString(){
		return this.value+" ♠";
	}
}
