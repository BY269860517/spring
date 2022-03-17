package service;

import org.springframework.stereotype.Component;

/**
 * @Auther: by
 * @Date: 2022/3/10 11:28
 * @Description:
 */
@Component
public class OrderService {
	 Integer money = 44;

	public String testOrder() {
		return money.toString();
	}

	public OrderService() {
	}


}
