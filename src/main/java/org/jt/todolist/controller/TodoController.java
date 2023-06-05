package org.jt.todolist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class TodoController {
    @RequestMapping({ "/", "/todo" })
    String todoPage() {
        return "todopage";
    }

    @PostMapping("/addtodo")
    String addTodo(@RequestParam("action") String todo) {
        System.out.println(todo);

        return "redirect:/todo";
    }
}
