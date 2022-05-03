package com.fqj.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fqj.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper

public interface BookDao extends BaseMapper<Book> {
    @Select("select * from tbl_book where id = #{id}")
    public Book getById(Integer id);


}
