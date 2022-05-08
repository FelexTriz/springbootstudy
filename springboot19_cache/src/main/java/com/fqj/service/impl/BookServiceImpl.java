package com.fqj.service.impl;

import com.alicp.jetcache.anno.CacheInvalidate;
import com.alicp.jetcache.anno.CacheUpdate;
import com.alicp.jetcache.anno.Cached;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fqj.Mapper.BookMapper;
import com.fqj.controller.utils.CodeUtils;
import com.fqj.domain.Book;
import com.fqj.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {


    @Autowired
    BookMapper bookMapper;
    @Override
    public Boolean save(Book book) {
        return bookMapper.insert(book) > 0;
    }

    @Override
    @CacheUpdate(name="book_",key = "#book.id",value = "#book")
    public Boolean update(Book book) {
        return bookMapper.updateById(book) > 0;
    }

    @Override
    @CacheInvalidate(name = "book_",key = "#id")
    public Boolean delete(Integer id) {
        return bookMapper.deleteById(id) > 0;
    }

    @Override
//    @Cacheable(value = "cacheSpace",key = "#id")
    @Cached(name = "book_",key = "#id",expire = 600)
    public Book getById(Integer id) {
        return bookMapper.selectById(id);
    }

    @Override
    public List<Book> getAll() {
        return bookMapper.selectList(null);
    }

    @Override
    public IPage<Book> getPage(int currentPage, int pageSize) {
        IPage page = new Page(currentPage, pageSize);
        return bookMapper.selectPage(page, null);
    }
}
