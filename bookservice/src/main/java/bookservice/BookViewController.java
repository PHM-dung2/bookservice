package bookservice;

import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/book/view")
public class BookViewController extends HttpServlet{

//	도서 상세 정보 조회
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(">> BOOK GET RUN");
		int bno = Integer.parseInt( req.getParameter("bno") );
		BookDto result = BookDao.getInstance().findByBno(bno);
			ObjectMapper mapper = new ObjectMapper();
			String jsonRsult = mapper.writeValueAsString(result);
		resp.setContentType("application/json");
		resp.getWriter().print(jsonRsult);
	} // f end
	
}
