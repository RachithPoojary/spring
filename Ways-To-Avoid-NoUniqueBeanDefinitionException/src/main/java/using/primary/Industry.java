package using.primary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Industry {
	@Autowired
	Movie movie;
	
	public void budget() {
		System.out.println("Budget spent on the movie");
		movie.story();
	}
}
