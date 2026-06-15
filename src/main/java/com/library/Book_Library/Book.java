package com.library.Book_Library;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/book")
public class Book {
    Map<Integer, Book_Entry> Book_Entry_Map = new HashMap<>();

    @GetMapping
    public List<Book_Entry> bookEntry(){
        return  new ArrayList<>(Book_Entry_Map.values());
    }

    @RequestMapping
    public String new_entry(@RequestBody Book_Entry Mydata){
        Book_Entry_Map.put(Mydata.getId(), Mydata);
        return "Added";
    }
    @GetMapping("id/{myids}")
    public Book_Entry bookEntryId(@PathVariable int myids){
        return  Book_Entry_Map.get(myids);
    }






}
