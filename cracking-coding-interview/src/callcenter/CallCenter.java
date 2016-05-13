package callcenter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CallCenter{
	private List<Fresher> freshers;
	private TL tl;
	private PM pm;

	public CallCenter(){
		freshers=Arrays.asList(new Fresher(), new Fresher(), new Fresher(), new Fresher());
		tl=new TL();
		pm=new PM();
	}

	public Employee getCallhandler(){
		Optional<Fresher> fresher=freshers.stream()
											.filter(Fresher::isAvailable)
											.findFirst();
		if(fresher.isPresent()){
			return fresher.get();
		}else{
			if(tl.isAvailable())
				return tl;
			else if(pm.isAvailable())
				return pm;
			return null;
		}
	}

	public void newCall(){
		Employee emp=getCallhandler();
		if(emp!=null){
			Thread t=new Thread(emp);
			t.start();
		}
		else
			System.out.println("None is available");
	}

}
