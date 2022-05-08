package com.fqj.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fqj.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface BookMapper extends BaseMapper<Book> {

    @Select("select * from tbl_book where id = #{id}")
    Book getById(Integer id);
}
