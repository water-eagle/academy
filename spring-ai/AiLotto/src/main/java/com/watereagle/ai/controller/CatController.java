package com.watereagle.ai.controller;

import org.springframework.ui.Model;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CatController {

	@GetMapping("/")
	public String index(Model model) {
		// 1. 단순 값
		model.addAttribute("catName", "나비");
		model.addAttribute("catAge", 3);

		// 2. 객체
		Cat myCat = new Cat("나비", 3, "치즈색");
		model.addAttribute("cat", myCat);

		// 3. 리스트
		List<Cat> cats = Arrays.asList(
				new Cat("나비", 3, "치즈색"),
				new Cat("코코", 2, "검은색"),
				new Cat("루루", 5, "흰색"));
		model.addAttribute("cats", cats);

		// 4. boolean
		model.addAttribute("isHungry", true);
		model.addAttribute("isSleeping", false);

		return "index";
	}

	// 내부 클래스로 Cat 정의
	public static class Cat {
		private String name;
		private int age;
		private String color;

		public Cat(String name, int age, String color) {
			this.name = name;
			this.age = age;
			this.color = color;
		}

		// Getter들
		public String getName() {
			return name;
		}

		public int getAge() {
			return age;
		}

		public String getColor() {
			return color;
		}

	}

}
