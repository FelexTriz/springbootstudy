package com.fqj.springboot_08_ssmp.domain;

import com.fqj.springboot_08_ssmp.Mapper.BookMapper;
import lombok.Data;
import lombok.Getter;

@Data
public class Book  {
    private Integer id;
    private String type;
    private String name;
    private String description;


}
