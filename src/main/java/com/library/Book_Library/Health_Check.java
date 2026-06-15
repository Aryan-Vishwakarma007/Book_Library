package com.library.Book_Library;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Health_Check {
    @GetMapping("/check")
    public String check(){
        return "Health --> OK";
    }
}
