package com.multi.test100;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class CarController {
	
	@Autowired
	CarDAO dao;
	
	@RequestMapping("list4")
	public void list4(PageVO2 pageVO2, Model model) {
		pageVO2.setStartEnd();
		
		int count = dao.count();
		List<CarVO> list = dao.list1(pageVO2);
		
		int pages = count / 20;
		if(count % 20 != 0) {
			pages += 1;
		}
		
		model.addAttribute("count", count);
		model.addAttribute("pages", pages);
		model.addAttribute("list", list);
		
	}
	
	@RequestMapping("list5")
	public void list5(PageVO2 pageVO2, Model model) {
		pageVO2.setStartEnd();
		int count = dao.count();
		List<CarVO> list = dao.list1(pageVO2);
		
		int pages = count / 20;
		if(count % 20 != 0) {
			pages += 1;
		}
		
		model.addAttribute("count", count);
		model.addAttribute("pages", pages);
		model.addAttribute("list", list);
	}
	
	@RequestMapping("list0")
	public void list1(PageVO2 pageVO2, Model model) { //start, end
		pageVO2.setStartEnd();
		List<CarVO> list = dao.list1(pageVO2);
		model.addAttribute("list", list);
	}
}
