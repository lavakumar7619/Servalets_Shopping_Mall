package hibernate.project.irepo;

import java.util.List;

import hibernate.project.entites.Customer;

public interface ICustomerRepository {
	public List<Customer> getCustomers();
	public void addCustomer(Customer c);
	public Customer getCustomer(long id) ;
	public void editCustomer(Customer c);
	public void deleteCus(Customer c) ;
}
