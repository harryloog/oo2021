package com.example.demo.controllers;

import javax.validation.Valid;

import com.example.demo.entities.ToDo;
import com.example.demo.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ToDoController {
  
  private final ToDoRepository toDoRepository;

  @Autowired
  public ToDoController(ToDoRepository toDoRepository){
    this.toDoRepository = toDoRepository;
  }

  @GetMapping("/todolist")
  public String showToDoList(Model model){
    model.addAttribute("todos", toDoRepository.findAll());
    return "todolist";
  }

  @GetMapping("/addpage")
  public String showAddPage(ToDo toDo){
    return "addpage";
  }

  @PostMapping("/addToDo")
  public String addToDo(@Valid ToDo toDo, BindingResult result, Model model){
    if (result.hasErrors()){
      return "addpage";
    }

    toDoRepository.save(toDo);
    return "redirect:/todolist";
  }

  @GetMapping("/edit/{id}")
  public String showUpdate(@PathVariable("id") long id, Model model){
    ToDo toDo = toDoRepository.findById(id)
      .orElseThrow(() -> new IllegalArgumentException("No such task with id " + id));
    model.addAttribute("todo", toDo);

    return "updatetodo";
  }

  @PostMapping("/update/{id}")
  public String updateToDo(@PathVariable("id") long id, @Valid ToDo toDo, BindingResult result, Model model){
    if (result.hasErrors()){
      return "updatetodo";
    }

    toDoRepository.save(toDo);

    return "redirect:/todolist";
  }

  @GetMapping("/delete/{id}")
  public String deleteToDo(@PathVariable("id") long id, Model model){
    ToDo toDo = toDoRepository.findById(id)
      .orElseThrow(() -> new IllegalArgumentException("No such task with id " + id));

    toDoRepository.delete(toDo);

    return "redirect:/todolist";
  }
}