package com.library.Book_Library;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/book")
public class Book {
    Map<Integer, Book_Entry> Book_Entry_Map = new HashMap<>();

    @GetMapping
    public List<Book_Entry> bookEntry(){
        return  new ArrayList<>(Book_Entry_Map.values());
    }




}
