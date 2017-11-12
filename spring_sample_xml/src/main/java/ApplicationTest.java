import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pluralsight.model.Customer;
import com.pluralsight.service.CustomerService;

public class ApplicationTest {

	public static void main(String[] args) {
		
		//CustomerService service = new CustomerServiceImpl();
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CustomerService service = appContext.getBean("customerService", CustomerService.class);
		
		for (Customer costumer : service.findAll()) {
			System.out.println(costumer.getFirtsName() + " " + costumer.getLastName() );			
		}
	}

}
