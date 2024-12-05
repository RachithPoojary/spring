package using.primary;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DriverClass {

	public static void main(String[] args) {
		ConfigurableApplicationContext cApp = new AnnotationConfigApplicationContext(AppConfig.class);
		Industry i = (Industry) cApp.getBean("industry");
		i.budget();
	}
}
