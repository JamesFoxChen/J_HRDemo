import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fly.service.UserService;

public class UserServiceTest {

	@Test
	public void count() {
		ApplicationContext ctx = null;
		ctx = new ClassPathXmlApplicationContext("spring-mvc.xml");
		UserService service = (UserService) ctx.getBean("userService");
		System.out.println(service.count());
	}
}
