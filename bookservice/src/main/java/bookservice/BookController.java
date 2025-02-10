package bookservice;

import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServlet;

@WebFilter("/book")
public class BookController extends HttpServlet{
	
}
