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
import hibernate.project.irepo.ICustomerRepository;
import hibernate.project.iservice.ICustomerService;


public class CustomerRepo implements ICustomerRepository,ICustomerService{
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
	public List<Customer> getCustomers(){
		sf=getSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		List<Customer> Customers=s.createQuery("FROM Customer").getResultList();
		tx.commit();
		return  Customers;
	}
	public void addCustomer(Customer c) {
		sf=getSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		s.save(c);
		tx.commit();
	}
	public Customer getCustomer(long id) {
		sf=getSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		Customer Customer=s.get(Customer.class, id);
		tx.commit();
		return  Customer;
	}
	public void editCustomer(Customer c) {
		sf=getSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		s.update(c);
		tx.commit();
	}
	public void deleteCus(Customer c) {
		sf=getSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		s.delete(c);
		tx.commit();
	}
	//service
	@Override
	public void orderItem(OrderDetails order) {
		sf=getSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		s.save(order);
	}
	@Override
	public List<Item> searchItem(String itemName) {
		sf=getSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		List<Item> items=s.createQuery("FROM Item").getResultList();
		tx.commit();
		return items;
	}
	@Override
	public Mall searchMall(long id) {
		sf=getSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		Mall mall=s.get(Mall.class, id);
		tx.commit();
		return mall;
	}
	@Override
	public boolean cancelOrder(long orderId) {
		sf=getSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		OrderDetails od=s.get(OrderDetails.class, orderId);
		s.delete(od);
		tx.commit();
		return true;
	}
	@Override
	public User login(long id) {
		sf=getSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		User user=s.get( User.class, id);
		tx.commit();
		return user;
	}
	@Override
	public boolean logout() {
		return false;
	}

}
