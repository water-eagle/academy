package com.watereagle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.watereagle.dto.GuestDto;
import com.watereagle.service.GuestService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@RequestMapping("/guest/*")
@AllArgsConstructor // 필드 값을 매개변수로 하는 생성자를 스프링이 알아서 만들어줌. 그리고 그런 형태의 생성자을 추가하면 스프링이 알아서 객체 관리 해줌(예: @Auto)
@Controller
public class GuestController {
	private GuestService service;

	@GetMapping("/getList")
	public void getList(Model model) { // 매개변수에 Model m 식으로 작성하면 되면, 스프잉이 알아서 모델 객체를 만들어서 넘겨줌.
		model.addAttribute("list", service.getList());
	}

	@GetMapping({"/read", "/modify"})
	public void read(@RequestParam("bno") Long bno, Model model) {
		log.info("컨트롤러 ==== 글번호 ===============" + bno);
		model.addAttribute("read", service.read(bno));
	}

	@GetMapping("/del")
	public String del(@RequestParam("bno") Long bno, Model model) {
		log.info("컨트롤러 ==== 글번호 ===============" + bno);
		service.del(bno);
		return "redirect:/guest/getList";
	}

	@GetMapping("/write")
	public void write() {

	}

	@PostMapping("/write")
	public String write(GuestDto dto) {
		service.write(dto);
		return "redirect:/guest/getList";
	}

	@PostMapping("/modify")
	public String modify(GuestDto dto) {
		service.modify(dto);
		return "redirect:/guest/getList";
	}


}
