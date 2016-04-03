import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MybatisTest {

	public static void main(String[] args) {
		ApplicationContext ctx = null;
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

	}

}
