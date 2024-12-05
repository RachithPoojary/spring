package using.qualifier;


import org.springframework.stereotype.Component;

@Component
public class KGF implements Movie{

	public void story() {
		System.out.println("KGF movie is about sone ki chari");
		
	}

}
