package com.atguigu.controller;


import com.atguigu.pojo.Book;
import com.atguigu.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/Book")
@Controller
public class BookController {

    @Autowired
    BookService bookService;

    @RequestMapping(value = "/query")
    @ResponseBody
    public Book queryBookById(){
        return  bookService.queryBookById(5);

    }
}
