package hibernate.project.iservice;

import hibernate.project.entites.Shop;
import hibernate.project.entites.User;

public interface IAdminService {
	public boolean approveNewShop(Shop shop);
	public User updateUser(User user);
	public User login(User user);
	public boolean logOut();
}
