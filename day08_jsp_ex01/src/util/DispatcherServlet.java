package util;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static util.MyUtil.initPathAttr;


public class DispatcherServlet extends HttpServlet {
	
	MyController ctrl = new HomeController();
	HandlerMapping handlerMapping = new HandlerMapping();
	
	protected void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PathVO pathVO = initPathAttr(req, resp);
		
		ctrl = handlerMapping.getController(pathVO.getDirName());
		
		 // home.jsp 페이지로 forward 시키기
	      // 컨텍스트/home.do
		String viewName = "";
		if(ctrl != null) {
			viewName = ctrl.handleRequest(req, resp);
			if(viewName.indexOf("redirect:")!=-1) {
				//redirect:가 걸렸을경우 처리한다
				resp.sendRedirect(viewName.substring("redirect:".length()));
				//redirect 후 메서드 종료
				return;
			}
		}
		
		viewName = pathVO.getPrefix() + viewName + pathVO.getSuffix();
		RequestDispatcher dispatcher = req.getRequestDispatcher(viewName);
		dispatcher.forward(req, resp);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
}
