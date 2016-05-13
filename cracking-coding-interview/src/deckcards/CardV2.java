package deckcards;

enum Category{
	HEART('♥'),
	CLUB('♣'),
	DIAMOND('♦'),
	SPADE('♠');

	private char c;

	Category(char c){
		this.c=c;
	}

	char getValue(){
		return c;
	}
}
public class CardV2 {
	private Category category;
	private char c;

	public CardV2(char c, Category category){
		this.c=c;
		this.category=category;
	}

	public String toString(){
		return c+" "+category.getValue();
	}
}
