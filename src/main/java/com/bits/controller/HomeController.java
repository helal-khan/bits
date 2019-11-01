package com.bits.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bits.model.Recruitment;
import com.bits.repository.RecruitmentRepository;

@Controller
public class HomeController {
	
	@Autowired
	private RecruitmentRepository recruitmentRepository;
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
}
