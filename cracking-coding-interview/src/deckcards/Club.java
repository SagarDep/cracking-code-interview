package deckcards;

public class Club extends Card{

	public Club(char value) {
		super(value);
	}

	public String toString(){
		return this.value+" ♣";
	}

}
