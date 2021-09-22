package hibernate.project.iservice;

import hibernate.project.entites.User;

public interface IUserService {
	public User addUser(User user);
	public User updateUser(User user);
	public User login(User user);
	public boolean logOut();
}
