package com.fqj.springboot_08_ssmp.Mapper;

import com.fqj.springboot_08_ssmp.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.context.annotation.ComponentScan;


@Mapper
public interface BookMapper {

    @Select("select * from tbl_book where id = #{id}")
    Book getById(Integer id);
}
