package config;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import service.imp.UserServiceImpl;

/***
 * @Author 徐庶   QQ:1092002729
 * @Slogan 致敬大师，致敬未来的你
 */

@Configuration
@ComponentScan("service.imp")
public class MainStat {

    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(MainStat.class);
        UserServiceImpl bean = context.getBean(UserServiceImpl.class);
        bean.sayHi();

    }

}