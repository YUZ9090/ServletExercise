package myshop;

import static util.MyController.productDAO;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ProductService {

	
	//리스트보기
	public String viewList(HttpServletRequest req, HttpServletResponse resp) throws SQLException {

		List<ProductDTO> opList = productDAO.selectAll();

		req.setAttribute("opList", opList);
		return "menu/list";
	}
	
	//상품등록
	public String regist(HttpServletRequest req, HttpServletResponse resp) throws SQLException {
		if("POST".equals(req.getMethod())) {
			//내용 저장 후 새로고침
			int pno = Integer.parseInt(req.getParameter("pno")) ;;
			String pname = req.getParameter("pname");
			String company = req.getParameter("company");
			int price = Integer.parseInt(req.getParameter("price")) ;
			int ea = Integer.parseInt(req.getParameter("ea")) ;
			ProductDTO dto = new ProductDTO(pno, pname, company, price, ea);
			productDAO.insert(dto);
			
			return "redirect:list.do";
		} else {
			//get
			return "menu/regist";
		}
	}
	
	//예약삭제
	public String delete(HttpServletRequest req, HttpServletResponse resp) throws SQLException {
		
		//특정값 id 받아옴
		int id =Integer.parseInt( req.getParameter("id"));
	
		optionDAO.delete(id);
		return "redirect:list.do";
	}
	
}
