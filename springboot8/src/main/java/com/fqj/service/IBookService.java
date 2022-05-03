package com.fqj.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.fqj.domain.Book;

public interface IBookService extends IService<Book> {
    IPage<Book> getPage(int currentPage, int pageSize, Book book);
    IPage<Book> getPage(int currentPage, int pageSize);
}
