import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fly.domain.OperateLog;
import com.fly.service.UserService;

public class UserServiceTest {

	private UserService service = null;

	@Before
	public void before() {
		ApplicationContext ctx = null;
		ctx = new ClassPathXmlApplicationContext("spring-mvc.xml");
		this.service = (UserService) ctx.getBean("userService");
	}

	@Test
	public void count() {
		System.out.println(service.count());
	}

	@Test
	public void get() {
		OperateLog log = service.get(8);
		System.out.println(ReflectionToStringBuilder.toString(log));
	}

	@Test
	public void getList() {
		OperateLog log = new OperateLog();
		log.setId(8);
		//log.setAdmin_name("2");
		List<OperateLog> lstLog = service.getList(log);
		System.out.println(lstLog.size());
		System.out.println(ReflectionToStringBuilder.toString(lstLog));
	}

	@Test
	public void add() {
		OperateLog log = new OperateLog();
		log.setAdmin_name("james");
		log.setRemark("2aremark");
		int result = service.add(log);
		System.out.println(result);
	}

	@Test
	public void update() {
		OperateLog log = new OperateLog();
		log.setId(4);
		log.setAdmin_name("333");
		log.setCreated(new Date());
		int result = service.update(log);
		System.out.println(result);
	}

	@Test
	public void delete() {
		int result = service.delete(4);
		System.out.println(result);
	}
	
	@Test
	public void deletebatch() {
		List<Integer> lst=new ArrayList<Integer>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		int result = service.deletebatch(lst);
		System.out.println(result);
	}
}
