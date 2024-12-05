package using.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Industry {
//	@Autowired                               //variable injection
//	@Qualifier(value = "KGF")
	Movie movie;

//	@Autowired
//	@Qualifier(value = "KGF")
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	
	@Autowired
	public Industry(@Qualifier(value = "KGF")  Movie movie) {
		
		this.movie = movie;
	}
	
	
	public void budget() {
		System.out.println("Budget spent on creating the movie");
		movie.story();
	}
	

}
