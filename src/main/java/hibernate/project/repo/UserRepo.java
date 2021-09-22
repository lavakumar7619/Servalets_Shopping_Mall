package hibernate.project.repo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import hibernate.project.entites.Customer;
import hibernate.project.entites.Employee;
import hibernate.project.entites.Item;
import hibernate.project.entites.Mall;
import hibernate.project.entites.MallAdmin;
import hibernate.project.entites.OrderDetails;
import hibernate.project.entites.Shop;
import hibernate.project.entites.ShopOwner;
import hibernate.project.entites.User;

public class UserRepo {
	SessionFactory sf;
	public SessionFactory getSessionFactory() {
		Configuration con=new Configuration()
				.configure()
				.addAnnotatedClass(Customer.class)
				.addAnnotatedClass(OrderDetails.class)
				.addAnnotatedClass(User.class)
				.addAnnotatedClass(Employee.class)
				.addAnnotatedClass(Item.class)
				.addAnnotatedClass(Mall.class)
				.addAnnotatedClass(MallAdmin.class)
				.addAnnotatedClass(Shop.class)
				.addAnnotatedClass(ShopOwner.class);
		sf=con.buildSessionFactory();
		return sf;
	}
	public List<User> getUser(){
		sf=getSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		List<User> li=s.createQuery("FROM User").getResultList();
		System.out.println(li);
		tx.commit();
		return li;
	}
}
