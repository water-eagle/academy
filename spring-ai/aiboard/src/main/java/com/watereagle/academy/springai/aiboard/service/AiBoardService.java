package com.watereagle.academy.springai.aiboard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.watereagle.academy.springai.aiboard.dto.Post;
import com.watereagle.academy.springai.aiboard.mapper.AiBoardMapper;

public class AiBoardService {

	@Autowired
	private AiBoardMapper mapper;

	private final int PAGE_SIZE = 3;

	public List<Post> getList(int page) {
		int startIndex = (page - 1) * PAGE_SIZE;
		return mapper.getList(startIndex);
	}

	public Post read(int no) {
		return mapper.read(no);
	}

	public void write(Post post) {
		post.setId("kitty");
		mapper.write(post);
	}

	public void edit(Post post) {
		mapper.edit(post);
	}

	public int del(int no) {
		return mapper.del(no);
	}
}
