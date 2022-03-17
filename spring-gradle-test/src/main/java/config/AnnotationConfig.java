package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import service.UserService;

/**
 * @Auther: by
 * @Date: 2022/3/10 11:08
 * @Description:
 */
@ComponentScan("service")
public class AnnotationConfig {
	@Bean
	public UserService userService(){
		return new UserService();
	}
}
