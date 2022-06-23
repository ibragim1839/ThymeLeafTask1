package ibragim.bitlab.java.spring.javaspring2.controllers;

import ibragim.bitlab.java.spring.javaspring2.db.Item;
import ibragim.bitlab.java.spring.javaspring2.db.Student;
import ibragim.bitlab.java.spring.javaspring2.db.dbManager;
import org.apache.catalina.Manager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller

public class HomeController {



    @GetMapping(value = "/")
    public String getIndex(Model model){
        ArrayList<Student> students = dbManager.getStudents();
        model.addAttribute("students",students);
        return "indexPage";
    }



    @GetMapping(value = "/about")
    public String aboutPage(){
        return "about";
    }

    @PostMapping(value = "/addStudent")
    public String addItem(@RequestParam(name = "name") String name,
                          @RequestParam(name = "surname") String surname,
                          @RequestParam(name = "score") int score) {
        Student student = new Student();
        student.setName(name);
        student.setSurname(surname);
        student.setScore(score);
        dbManager.addStudent(student);
        return "redirect:/";

    }

    @GetMapping(value = "/addStudent")
    public String addItemPage(){
        return "AddStudent";
    }

}
