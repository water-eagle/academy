package com.watereagle.academy.springai.aiboard.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.watereagle.academy.springai.aiboard.dto.Post;

@Mapper
public interface AiBoardMapper {

    public int del(int no);

    public Post read(int no);

    List<Post> getList();

    void write(Post post);

    void edit(Post post);
}
