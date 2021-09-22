package hibernate.project.controlers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hibernate.project.entites.User;
import hibernate.project.repo.UserRepo;

public class UserControler extends HttpServlet {
	private static final long serialVersionUID = 1L;
    UserRepo ur;
	public void init(ServletConfig config) throws ServletException {
		ur=new UserRepo();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getServletPath();
		switch (action) {
		case "/addUser":
			addUser(request,response);
			break;
		case "/editUser":
			editUser(request,response);
			break;
		case "/deleteUser":
			deleteUser(request,response);
			break;
		default:
			getUser(request,response);
		}
	}

	private void getUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<User> list=ur.getUser();
		System.out.println(list);
		request.setAttribute("list", list);
		//RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
		//rd.forward(request, response);
	}

	private void deleteUser(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	private void editUser(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	private void addUser(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("add user ");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
