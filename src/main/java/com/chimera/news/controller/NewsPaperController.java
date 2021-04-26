package com.chimera.news.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chimera.news.dto.NewsPaperDTO;
import com.chimera.news.service.NewsPaperService;

@Component
@RequestMapping("/")
public class NewsPaperController {
	
	@Autowired
	private NewsPaperService newspaperService;

	public NewsPaperController() {
		super();
		System.out.println(this.getClass().getSimpleName() + " object created");
	}

	@RequestMapping("/newspaper.do")
	public String onClick(@ModelAttribute NewsPaperDTO newspaperDTO, Model model) {
		System.out.println(newspaperDTO);
		if (this.newspaperService.validateNewspaperInfo(newspaperDTO)) {
			model.addAttribute("message", "thankyou for registering");
			return "/index.jsp";
		}
		model.addAttribute("message", "enter valid data");
		return "/index.jsp";
	}

}
