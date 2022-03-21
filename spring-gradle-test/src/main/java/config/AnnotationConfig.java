package config;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import service.OrderService;
import service.UserService;

/**
 * @Auther: by
 * @Date: 2022/3/10 11:08
 * @Description:
 */
@ComponentScan("service")
@Configuration
public class AnnotationConfig {
	@Bean({"userService","userService1"})  //userService1为别名
	public UserService userService(){
		return new UserService();
	}
	@Bean(value = {"orderService","orderService1"} )  //orderService1
	public OrderService orderService(){
		return new OrderService();
	}
}
