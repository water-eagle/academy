package com.watereagle.ai.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.watereagle.ai.model.Heroine;
import com.watereagle.ai.service.AiHeroine;

@RestController
public class HeroineController {
	private final AiHeroine aiHeroine;

	// 생성자 주입 (Spring AI의 표준 방식)
	public HeroineController(AiHeroine aiHeroine) {
		this.aiHeroine = aiHeroine;
	}

	@GetMapping("/getHeroine")
	public String getHeroine() {
		Heroine heroine = aiHeroine.getHeroine();
		System.out.println(heroine);
		return "getHeroine";
	}
}
