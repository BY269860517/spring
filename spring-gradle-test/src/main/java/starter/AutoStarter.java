package starter;

import config.AnnotationConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.UserService;

/**
 * @Auther: by
 * @Date: 2022/3/10 11:06
 * @Description: AnnotationConfigApplicationContext 的方式创建Bean
 */
public class AutoStarter {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AnnotationConfig.class);
		UserService userService = (UserService) annotationConfigApplicationContext.getBean("userService1");
		System.out.println(userService.testBean());


	}
}
