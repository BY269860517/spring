package service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

/**
 * @Auther: by
 * @Date: 2022/3/10 11:28
 * @Description:
 */
@Component
//@DependsOn({"userService"})
public class OrderService {
	@Value("555")
	 Integer money = 44;

	public OrderService(Integer money) {
		this.money = money;
	}

	public String testOrder() {
		return money.toString();
	}

	public OrderService() {
	}

	public Integer getMoney() {
		return money;
	}

	public void setMoney(Integer money) {
		this.money = money;
	}
}
