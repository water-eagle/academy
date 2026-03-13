package com.watereagle.controller;

import javax.servlet.http.HttpSession;

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

	@GetMapping("/login")
	public String login(MemberDto m, HttpSession session) {
		log.info("==== 로그인 컨트롤러 진입:");
		String id = service.login(m);
		if (id != null) {
			session.setAttribute("savedId", id);
			log.info("==== 컨트롤러: 로그인 성공");
		} else {
			log.info("==== 컨트롤러: 로그인 실패");
		}
		return "redirect:/";
	}
}
