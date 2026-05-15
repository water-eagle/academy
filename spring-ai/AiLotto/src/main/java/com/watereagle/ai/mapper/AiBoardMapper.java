package com.watereagle.ai.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.watereagle.ai.dto.Post;

@Mapper
public interface AiBoardMapper {

	public int del(int no);

	public Post read(int no);

	List<Post> getList();

}
