package aspectPractice.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	
	@Before("execution(public String aspectPractice.model.Circle.getName())")
	public void LoggingAdvice() {
		System.out.println("Get method called");
	}
	
}
