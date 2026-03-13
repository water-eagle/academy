package com.watereagle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.watereagle.dto.MemberDto;
import com.watereagle.service.MemberService;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@RequestMapping("/member/*")
@Controller
public class MemberController {
	@Setter(onMethod_ = @Autowired)
	private MemberService service;

	@GetMapping("/reg")
	public void reg() {

	}

	@GetMapping("/regProc")
	public String regProc(MemberDto m) {
		service.reg(m);
		return "redirect:/";
	}
}
