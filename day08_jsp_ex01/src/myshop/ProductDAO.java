package myshop;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import util.JdbcUtil;

public class ProductDAO {
	public static final String SELECT = "select * from people";
	public static final String INSERT = "INSERT INTO people(pno,NAME,PHONE,RPAY,RNO) VALUES(NEXTVAL('seq_people'),?,?,?,?)";
	public static final String DELETE = "DELETE FROM people WHERE pno=?";
	
	private Connection conn ;
	private Statement stmt ; //statement�� �����ʿ������������
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private static List<ProductDTO> list = new ArrayList();
	static {
		list.add(new ProductDTO(1,"�ҳ�Ÿ","HYUNDAI",3000,0));
		list.add(new ProductDTO(2,"ī�Ϲ�","KIA",4000,0));
		list.add(new ProductDTO(3,"S530","����",9000,0));
		list.add(new ProductDTO(4,"S80","VOLVO",6000,0));
		list.add(new ProductDTO(5,"K5","KIA",2500,0));
		list.add(new ProductDTO(6,"BMW","BMW",5500,0));
	}
	
	public List<ProductDTO> selectAll() {

	      return list;
	}
	
	public ProductDTO selectOne(ProductDTO dto) {
		int idx  =  list.indexOf(dto);
		if(idx != -1) {
			return list.get(idx);
		}
		return null;
	}
	
	
}
