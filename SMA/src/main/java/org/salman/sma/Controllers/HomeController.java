package org.salman.sma.Controllers;

import org.salman.sma.Model.Student;
import org.salman.sma.Model.Teacher;
import org.salman.sma.Repository.StudentRepo;
import org.salman.sma.Repository.TeacherRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class HomeController {

    StudentRepo repo;
    TeacherRepo trepo;
    public HomeController(StudentRepo repo, TeacherRepo trepo)
    {
        this.repo=repo;
        this.trepo=trepo;
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

    @GetMapping("/s_all")
    public List<Student> getAllStudents()
    {
        return repo.findAll();
    }

    @PostMapping("/s_add")
    public Student addStudent(@RequestBody Student student)
    {
        return repo.save(student);
    }

    @GetMapping("/t_all")
    public List<Teacher> getAllTeacher()
    {
        return trepo.findAll();
    }

    @PostMapping("/t_add")
    public Teacher addStudent(@RequestBody Teacher teacher)
    {
        return trepo.save(teacher);
    }


}
