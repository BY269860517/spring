package bean;

import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Constructor;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by xsls on 2019/8/15.
 */
public class MainStarter {

	public static void main(String[] args)   {
		// 加载spring上下文
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
		Car car =  (Car) context.getBean("car");
		System.out.println(car.getName());
	}



}
