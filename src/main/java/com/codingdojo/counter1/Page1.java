package com.codingdojo.counter1;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class Page1 {
	
	@RequestMapping("/your_server")
	public String index(HttpSession session) {
		if (session.getAttribute("count") == null) {
				session.setAttribute("count", 1);
			}
			else {
				session.setAttribute("count", (Integer)session.getAttribute("count")+1 );
			}
		return "index.jsp";
	}
	
	@RequestMapping("/your_server/counter")
	public String counter(HttpSession session) {
		return "index2.jsp";
	}

}


