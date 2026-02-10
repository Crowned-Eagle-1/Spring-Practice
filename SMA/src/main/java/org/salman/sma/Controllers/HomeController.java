package org.salman.sma.Controllers;

import org.salman.sma.Model.Student;
import org.salman.sma.Repository.StudentRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class HomeController {

    StudentRepo repo;
    public HomeController(StudentRepo repo)
    {
        this.repo=repo;
    }
    //temporary memory list
//    private List<Student> students = new ArrayList<>();

//    @GetMapping({"/","/home"})
//    public String home(Model model)
//    {
//        model.addAttribute("student", new Student());
//
//        model.addAttribute("students", students);
//
//        return "home";
//    }
//
//    @PostMapping("/add")
//    public String addStudent(Student student)
//    {
//        students.add(student);
//
//        return "redirect:/";
//    }

    @GetMapping("/all")
    public List<Student> getAllStudents()
    {
        return repo.findAll();
    }

    @PostMapping("/add")
    public Student addStudent(@RequestBody Student student)
    {
        return repo.save(student);
    }

}
