package bookservice;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor( access = lombok.AccessLevel.PRIVATE )
public class BookDao extends Dao{
//	+ 싱글톤
	@Getter
	private static BookDao instance = new BookDao();
	
//	1. 도서 정보 등록
	public boolean write( BookDto bootDto ) {
		try {
			String sql = "insert into book(bname , bwriter, bpublisher) "
					+ "value(?, ?, ?)";
			PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, bootDto.getBname());
				ps.setString(2, bootDto.getBwriter());
				ps.setString(3, bootDto.getBpublisher());
			int count = ps.executeUpdate();
			if( count == 1 ) { return true; }
		}catch( SQLException e ) { System.out.println(e); }	
		return false;
	} // f end
	
//	2. 도서 정체 정보 조회
	public ArrayList<BookDto> findAll() {
		ArrayList<BookDto> result = new ArrayList();
		try {
			String sql = "select * from book";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while( rs.next() ) {
				
			}
		}catch( SQLException e ) { System.out.println(e); }
		return result;
	} // f end
	
//	3. 도서 상세 정보 조회
	public boolean findByBno() {
		
		return false;
	} // f end
	
//	4. 도서 정보 수정
	public boolean update() {
		
		return false;
	} // f end
	
//	5. 도서 정보 삭제
	public boolean delete() {
		
		return false;
	} // f end
	
}
