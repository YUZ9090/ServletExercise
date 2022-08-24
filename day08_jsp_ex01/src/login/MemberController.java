package login;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.myweb.service.MenuService;

import util.MyController;

public class MemberController implements MyController{
	@Override
	public String handleRequest(HttpServletRequest req, HttpServletResponse resp) {

		System.out.println("---- menuController ----");
		
		
		String fileName = (String)req.getAttribute("fileName");
		String viewName = "menu/list";
		
		//����Ʈ
		if("/list".equals(fileName)) {
			try {
				viewName = new MemberService().viewList(req, resp);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//���
		}else if("/regist".equals(fileName)) {
			try {
				viewName = new MemberService().regist(req,resp);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			//����
		}else if("/delete".equals(fileName)) {
			try {
				viewName = new MemberService().delete(req,resp);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return viewName;
		

	}

}
