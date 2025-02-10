package bookservice;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
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
		ArrayList<BookDto> result = new ArrayList<>();
		try {
			String sql = "select * from book";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while( rs.next() ) {
				BookDto bookDto = new BookDto();
				bookDto.setBno(rs.getInt("bno"));
				bookDto.setBname(rs.getString("bname"));
				bookDto.setBwriter(rs.getString("bwriter"));
				bookDto.setBpublisher(rs.getString("bpublisher"));
				bookDto.setBdate(rs.getString("bdate"));
				bookDto.setBupdate(rs.getString("bupdate"));
				result.add(bookDto);
			} // w end
		}catch( SQLException e ) { System.out.println(e); }
		return result;
	} // f end
	
//	3. 도서 상세 정보 조회
	public BookDto findByBno( int bno ) {
		BookDto result = new BookDto();
		try {
			String sql = "select * from book where bno = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
				ps.setInt(1, bno);
			ResultSet rs = ps.executeQuery();
			if( rs.next() ) {
				result.setBno(rs.getInt("bno"));
				result.setBname(rs.getString("bname"));
				result.setBwriter(rs.getString("bwriter"));
				result.setBpublisher(rs.getString("bpublisher"));
				result.setBdate(rs.getString("bdate"));
				result.setBupdate(rs.getString("bupdate"));
			} // if end
		}catch( SQLException e ) { System.out.println(e); }
		return result;
	} // f end
	
//	4. 도서 정보 수정
	public boolean update( BookDto bookDto ) {
		try {
			String sql = "update book "
					+ "set bname = ?, bwriter = ?, bpublisher = ?, bupdate = ? "
					+ "where bno = ? ";
			PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, bookDto.getBname());
				ps.setString(2, bookDto.getBwriter());
				ps.setString(3, bookDto.getBpublisher());
				ps.setString(4, bookDto.getBupdate());
				ps.setInt(5, bookDto.getBno());
			int count = ps.executeUpdate();
			if( count == 1 ) { return true; }
		}catch( SQLException e ) { System.out.println(e); }
		return false;
	} // f end
	
//	5. 도서 정보 삭제
	public boolean delete( int bno ) {
		try {
			String sql = "delete from book where bno = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
				ps.setInt(1, bno);
			int count = ps.executeUpdate();
			if( count == 1 ) { return true; }
		}catch( SQLException e ) { System.out.println(e); }
		return false;
	} // f end
	
}
