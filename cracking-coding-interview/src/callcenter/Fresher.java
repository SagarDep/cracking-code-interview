package callcenter;

public class Fresher extends Employee{

	private boolean available;

	public Fresher(){
		this.available=true;
	}

	public boolean isAvailable() {
		return available;
	}

	public void answer() {
		this.available=false;
		System.out.println("Fresher is answering, hello");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Fresher is answering, bye");
		this.available=true;
	}

}
