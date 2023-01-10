package org.comstudy21.myapp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Command {

	ModelAndView action(HttpServletRequest req, HttpServletResponse resp);

}