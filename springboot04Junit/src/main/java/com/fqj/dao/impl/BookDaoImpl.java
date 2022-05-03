package com.fqj.dao.impl;

import com.fqj.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {

    @Override
    public void save() {
        System.out.println("Book dao is running");
    }
}
