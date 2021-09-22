package hibernate.project.controlers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hibernate.project.entites.Customer;
import hibernate.project.entites.User;
import hibernate.project.irepo.ICustomerRepository;
import hibernate.project.iservice.ICustomerService;
import hibernate.project.repo.CustomerRepo;

public class CustomerControler extends HttpServlet{
	ICustomerRepository cr;
	ICustomerService cs;
	public void init(ServletConfig config) throws ServletException {
		cr=new CustomerRepo();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getServletPath();
		System.out.println(action);
		switch (action) {
		case "/addCus":
			addCustomer(request,response);
			
		case "/sendCus":
			sendCustomer(request,response);
			
		case "/editCus":
			editCustomer(request,response);
		
		case "/edit":
			getEditCustomer(request,response);
			
		case "/deleteCus":
			deleteCustomer(request,response);
		case "/orderItem":
			orderItem(request,response);
		case "/mall":
			getMall(request,response);
		case "/searchItems":
			searchItem(request,response);
		case "/cancelOrder":
			deleteOrder(request,response);
		case "/login":
			userLogin(request,response);
		case "/logout":
			userLogout(request,response);
		default:
			//getEditCustomer(request,response);
			getCustomer(request,response);
		}
	}
	private void userLogout(HttpServletRequest request, HttpServletResponse response) {
	}
	private void userLogin(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}
	private void deleteOrder(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}
	private void searchItem(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}
	private void getMall(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}
	private void orderItem(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}
	//all curd operations for customer
	private void getEditCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//int id=Integer.parseInt(request.getParameter("id"));
		Customer c=cr.getCustomer(1);
		System.out.println(c);
		request.setAttribute("c", c);
		RequestDispatcher rd=request.getRequestDispatcher("editCus.jsp");
		rd.forward(request, response);
		
	}
	private void sendCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Customer c=new Customer();
		//c.setUser(Integer.parseInt(request.getParameter("userId")));
		c.setEmail(request.getParameter("email"));
		c.setName(request.getParameter("name"));
		c.setPhone(Integer.parseInt(request.getParameter("phno")));
		cr.addCustomer(c);
		//forwarding to index page
		List<Customer> list=cr.getCustomers();
		System.out.println(list);
		request.setAttribute("cus", list);
		RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
	}
	private void getCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Customer> list=cr.getCustomers();
		request.setAttribute("cus", list);
		RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
	}
	private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		Customer c=cr.getCustomer(id);
		cr.deleteCus(c);
		//forwarding to index page
		List<Customer> list=cr.getCustomers();
		System.out.println(list);
		request.setAttribute("cus", list);
		RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
		
	}
	private void editCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		Customer c=cr.getCustomer(id);
		c.setEmail(request.getParameter("email"));
		c.setName(request.getParameter("name"));
		c.setPhone(Integer.parseInt(request.getParameter("phno")));
		cr.editCustomer(c);
		//forwarding to index page
		List<Customer> list=cr.getCustomers();
		System.out.println(list);
		request.setAttribute("cus", list);
		RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
	}
	private void addCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=request.getRequestDispatcher("register.jsp");
		rd.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
		
	}

	//lets write some code for customer service 
}
