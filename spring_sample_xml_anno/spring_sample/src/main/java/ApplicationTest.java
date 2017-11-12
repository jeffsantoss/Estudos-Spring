import com.pluralsight.model.Customer;
import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;

public class ApplicationTest {

	public static void main(String[] args) {
		
		CustomerService service = new CustomerServiceImpl();
		
		for (Customer costumer : service.findAll()) {
			System.out.println(costumer.getFirtsName() + " " + costumer.getLastName() );			
		}
	}

}
