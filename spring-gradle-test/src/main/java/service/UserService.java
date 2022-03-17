package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Auther: by
 * @Date: 2022/3/10 10:29
 * @Description:
 */
@Component
public class UserService {
       @Autowired
	   OrderService orderService;
	public String testBean(){
		return "getUserServiceBean"+orderService.testOrder();
	}

}
