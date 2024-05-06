package th.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import th.dto.CreateStudentRequest;
import th.dto.UpdateStudentRequest;
import th.model.Student;
import th.service.StudentService;
import th.service.StudentServiceImp;

@Controller
@RequestMapping("studentController")
public class StudentController {
    @Autowired
    private StudentService service;
    @GetMapping("/getAll")
    public String getAll(Model model){
        model.addAttribute("listStudent", service.findAll());
        return "listStudents";
    }

    @GetMapping("/add")
    public String preAdd(Model model){
        model.addAttribute("newStudent", new CreateStudentRequest());
        return "addStudent";
    }

    @PostMapping("/add")
    public String add(CreateStudentRequest newStudent){
        service.save(newStudent);
        return "redirect: /getAll";
    }

    @GetMapping("/delete")
    public String delete(int studentId){
        service.delete(studentId);
        return "redirect: /getAll";
    }

    @GetMapping("/update")
    public String preUpdate(Model model, int studentId){
        model.addAttribute("updateStudent", service.findById(studentId));
        return "updateStudent";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute UpdateStudentRequest request){
        service.update(request);
        return "redirect: /getAll";
    }

    @PostMapping("/search")
    public String search(@RequestParam String name){
        service.findByName(name);
        return "redirect: getAll";
    }

}
