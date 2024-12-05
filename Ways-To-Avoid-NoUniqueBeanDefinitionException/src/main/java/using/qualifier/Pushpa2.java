package using.qualifier;

import org.springframework.stereotype.Component;

import using.primary.Movie;

@Component
public class Pushpa2 implements Movie{

	public void story() {
		System.out.println("Pushpa movie is about chandan ki chori");
	}

}
