package hibernate.project.iservice;

import hibernate.project.entites.Employee;
import hibernate.project.entites.Item;
import hibernate.project.entites.Shop;

public interface IShopService {
	public Shop addShop(Shop shop);
	public Shop updateShop(Shop shop);
	public Shop searchShopById(long id);
	public boolean deleteShop(long id);
	public boolean addEmployee(Employee employee);
	public boolean updateEmployee(Employee employee);
	public Item addItem(Item item);
}
