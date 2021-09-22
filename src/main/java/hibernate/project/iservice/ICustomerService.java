package hibernate.project.iservice;

import java.util.List;

import hibernate.project.entites.Item;
import hibernate.project.entites.Mall;
import hibernate.project.entites.OrderDetails;
import hibernate.project.entites.User;

public interface ICustomerService {
	public void orderItem(OrderDetails item);
	public List<Item> searchItem(String itemName);
	public Mall searchMall(long id);
	public boolean cancelOrder(long orderId);
	public User login(long id);
	public boolean logout();
}
