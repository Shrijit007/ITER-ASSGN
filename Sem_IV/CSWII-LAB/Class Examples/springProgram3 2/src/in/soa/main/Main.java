package in.soa.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import in.soa.beans.*;
public class Main {

	public static void main(String[] args) {
		String config_loc = "/in/soa/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);
		
		Student std = (Student)context.getBean("stdId");
		std.display();
	}
}
