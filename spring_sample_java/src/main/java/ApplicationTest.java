import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pluralsight.model.Customer;
import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;

public class ApplicationTest {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		CustomerService service = appContext.getBean("customerService", CustomerService.class);
		System.out.println(service);
		
		// testando o pattern singleton
		CustomerService service2 = appContext.getBean("customerService", CustomerService.class);
		System.out.println(service2);
		
		for (Customer costumer : service.findAll()) {
			System.out.println(costumer.getFirtsName() + " " + costumer.getLastName() );			
		} 
	}

}