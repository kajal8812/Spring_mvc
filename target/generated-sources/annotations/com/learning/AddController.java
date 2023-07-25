package com.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.learning.service.AddService;

@Controller
public class AddController {

	@Autowired
	public AddService as;

	@RequestMapping("/add")
	//	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {
	//
	//		int i = Integer.parseInt(request.getParameter("t1"));
	//		//t1 is the name of the field in index.jsp
	//		int j = Integer.parseInt(request.getParameter("t2"));
	//		//buisness logic should be written in service class
	//		//int k = i + j;
	//		//this value belongs to request object
	//
	//		int k = as.add(i, j);
	//		ModelAndView mv = new ModelAndView();
	//		mv.setViewName("display");
	//		mv.addObject("result", k);
	//
	//		return mv;
	//	}

	public ModelAndView add(@RequestParam("t1") int i, @RequestParam("t2") int j) {

		//int i = Integer.parseInt(request.getParameter("t1"));
		//t1 is the name of the field in index.jsp
		//int j = Integer.parseInt(request.getParameter("t2"));
		//buisness logic should be written in service class
		//int k = i + j;
		//this value belongs to request object

		int k = as.add(i, j);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display");
		mv.addObject("result", k);

		return mv;
	}

}
//we can use any of the methods to get value from the address bar i.e:httservletrequest or @requestparam
