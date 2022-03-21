package starter;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.OrderService;
import service.UserService;

/**
 * Created by xsls on 2019/8/15.
 */
public class XmlStarter {

	public static void main(String[] args)   {
		// 加载spring上下文
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
////		Car car =  (Car) context.getBean("car");
////		System.out.println(car.getName());
		ClassPathXmlApplicationContext classPathXmlApplicationContext=new ClassPathXmlApplicationContext("spring.xml");
//		OrderService orderService = (OrderService) classPathXmlApplicationContext.getBean("orderService");
//		System.out.println(orderService.testOrder());

		UserService userService = (UserService) classPathXmlApplicationContext.getBean("userService");
		System.out.println(userService.testBean());

	}



}
