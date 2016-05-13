package callcenter;

public class PM extends Employee{

	private boolean available;

	public PM(){
		this.available=true;
	}



	@Override
	public void answer() {
		this.available=false;
		System.out.println("PM is answering, hello");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("PM is answering, bye");
		this.available=true;
	}

	@Override
	public boolean isAvailable() {
		// TODO Auto-generated method stub
		return available;
	}

}
