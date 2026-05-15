package com.watereagle.academy.springai.aiboard.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper // 중요! 이 어노테이션이 있어야 Spring이 이 녀석을 빈(Bean)으로 등록해요!
public interface AiBoardMapper {

    public int del(int no);

}
