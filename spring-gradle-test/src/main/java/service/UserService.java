package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

/**
 * @Auther: by
 * @Date: 2022/3/10 10:29
 * @Description:
 */
@Component
//@DependsOn({"orderService"})
public class UserService {
    @Autowired
	   OrderService orderService;
	public String testBean(){
		//return "getUserServiceBean";
		return "getUserServiceBean"+orderService.testOrder();
	}

	public UserService(OrderService orderService) {
		this.orderService = orderService;
	}

	public UserService() {
	}
}
