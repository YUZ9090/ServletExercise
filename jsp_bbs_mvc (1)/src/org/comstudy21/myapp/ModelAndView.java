package org.comstudy21.myapp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ModelAndView {
	private String viewName;
	private HttpServletRequest req;
	private HttpServletResponse resp;

	public ModelAndView(String viewName, HttpServletRequest req, HttpServletResponse resp) {
		this.viewName = viewName;
	}

	public ModelAndView(HttpServletRequest req, HttpServletResponse resp) {
		this.req = req;
		this.resp = resp;
	}

	public void addObject(String key, Object value) {
		req.setAttribute(key, value);
	}

	public void setViewName(String viewName) {
		this.viewName = viewName;
	}
	
	public String getViewName() {
		return viewName;
	}
}
