package callcenter;

public abstract class Employee implements Runnable{

	@Override
	public void run() {
		answer();
	}

	public abstract void answer();
	public abstract boolean isAvailable();

}
