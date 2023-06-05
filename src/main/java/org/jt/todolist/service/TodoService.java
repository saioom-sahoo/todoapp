package org.jt.todolist.service;

import java.util.List;
import org.jt.todolist.model.Todo;
import org.jt.todolist.repository.TodoRepository;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TodoService {
    private final TodoRepository todoRepository;

    public void addTodo(Todo todo) {
        todoRepository.save(todo);
    }

    public List<Todo> todos() {
        return todoRepository.findAll();
    }
}
