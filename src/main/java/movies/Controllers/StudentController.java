package movies.Controllers;

import movies.Models.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/form")
    public String showStudentForm(Model studentModel) {
        System.out.println("in the show form controller");
        Student newStudent = new Student();
        studentModel.addAttribute("studentModel", newStudent);
        return "student-form";
    }

    @RequestMapping("/process-form")
    public String showFormData(@ModelAttribute("studentData") Student studentModel) {
//        System.out.println(student);
        return "formTags";
    }

}
