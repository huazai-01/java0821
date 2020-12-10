package com.atguigu.mapper;

import com.atguigu.pojo.Book;
import org.springframework.stereotype.Repository;

import javax.print.DocFlavor;


public interface BookMapper {

    public Book queryBookById(Integer id);


}
