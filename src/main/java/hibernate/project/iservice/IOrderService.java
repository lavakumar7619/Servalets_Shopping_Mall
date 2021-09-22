package hibernate.project.iservice;

import hibernate.project.entites.Item;
import hibernate.project.entites.OrderDetails;

public interface IOrderService {
	public OrderDetails addOrder(OrderDetails order);
	public OrderDetails updateOrder(OrderDetails order);
	public OrderDetails searchOrder(long id);
	public boolean cancelMall(long id);
	public Item addItem(Item item);
}
