package snippet;

public class Snippet {
	<beans xmlns="http://www.springframework.org/schema/beans"
	       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	       xmlns:context="http://www.springframework.org/schema/context"
	       xsi:schemaLocation="http://www.springframework.org/schema/beans
	            http://www.springframework.org/schema/beans/spring-beans.xsd
	            http://www.springframework.org/schema/context
	            http://www.springframework.org/schema/context/spring-context-3.0.xsd">
	
	
		<bean id="myStudent" class="com.spring.Student"></bean>
			<bean id="myPerson" class="com.spring.Person"></bean>
		
	    
	
	</beans>
}

