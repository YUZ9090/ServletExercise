package myshop;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import util.MyController;

public class ProductController implements MyController {

	@Override
	public String handleRequest(HttpServletRequest req, HttpServletResponse resp) {

		System.out.println("---- menuController ----");
		
		
		String fileName = (String)req.getAttribute("fileName");
		String viewName = "menu/list";
		
		//����Ʈ
		if("/list".equals(fileName)) {
			try {
				viewName = new ProductService().viewList(req, resp);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//���
		}else if("/regist".equals(fileName)) {
			try {
				viewName = new ProductService().regist(req,resp);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			//����
		}else if("/delete".equals(fileName)) {
			try {
				viewName = new ProductService().delete(req,resp);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return viewName;
		

	}

}
