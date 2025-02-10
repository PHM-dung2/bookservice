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
@WebServlet("/book")
public class BookController extends HttpServlet{
	
//	1. 도서 정보 등록
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(">> BOOK POST RUN");
		ObjectMapper mapper = new ObjectMapper();
		BookDto bootDto = mapper.readValue( req.getReader() , BookDto.class );
		boolean result = BookDao.getInstance().write(bootDto);
		resp.setContentType("application/json");
		resp.getWriter().print(result);
	} // f end
	
	
//	2. 도서 정체 정보 조회
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(">> BOOK GET RUN");
		ArrayList<BookDto> result = BookDao.getInstance().findAll();
			ObjectMapper mapper = new ObjectMapper();
			String jsonRsult = mapper.writeValueAsString(result);
		resp.setContentType("application/json");
		resp.getWriter().print(jsonRsult);
	}  // f end
	
//	3. 도서 정보 수정
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(">> BOOK PUT RUN");
		
	} // f end
	
//	4. 도서 정보 삭제
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(">> BOOK DELETE RUN");
		
	} // f end
	
	
	
}
