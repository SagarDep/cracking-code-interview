package deckcards;

public class Heart extends Card{

	public Heart(char value) {
		super(value);
	}

	public String toString(){
		return this.value+" ♥";
	}

}
