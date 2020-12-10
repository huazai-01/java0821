package com.atguigu.service;

import com.atguigu.mapper.BookMapper;
import com.atguigu.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    BookMapper bookMapper;

    public Book queryBookById(Integer id){
         return bookMapper.queryBookById( id);
    }
}
