package myshop;

import static util.MyController.productDAO;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ProductService {

	
	//����Ʈ����
	public String viewList(HttpServletRequest req, HttpServletResponse resp) throws SQLException {

		List<ProductDTO> opList = productDAO.selectAll();

		req.setAttribute("opList", opList);
		return "menu/list";
	}
	
	//��ǰ���
	public String regist(HttpServletRequest req, HttpServletResponse resp) throws SQLException {
		if("POST".equals(req.getMethod())) {
			//���� ���� �� ���ΰ�ħ
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
	
	//�������
	public String delete(HttpServletRequest req, HttpServletResponse resp) throws SQLException {
		
		//Ư���� id �޾ƿ�
		int id =Integer.parseInt( req.getParameter("id"));
	
		optionDAO.delete(id);
		return "redirect:list.do";
	}
	
}
