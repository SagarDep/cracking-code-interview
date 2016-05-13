package callcenter;

public class TL extends Employee{

	private boolean available;

	public TL(){
		this.available=true;
	}

	@Override
	public void answer() {
		this.available=false;
		System.out.println("TL is answering, hello");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("TL is answering, bye");
		this.available=true;
	}

	@Override
	public boolean isAvailable() {
		// TODO Auto-generated method stub
		return available;
	}

}
